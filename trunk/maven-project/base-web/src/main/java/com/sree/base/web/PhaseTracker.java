package com.sree.base.web;

import java.text.MessageFormat;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import org.richfaces.log.LogFactory;
import org.richfaces.log.Logger;

@SuppressWarnings({"rawtypes","unchecked"})
public class PhaseTracker implements PhaseListener {
	private static final long serialVersionUID = 6358081870120864332L;
	private Logger logger = LogFactory.getLogger(PhaseTracker.class);
	private ThreadLocal<Long> phaseTimer = new ThreadLocal();

	public void afterPhase(PhaseEvent event) {
		Long phaseStartTime = (Long) this.phaseTimer.get();

		long measuredTime = 0L;
		if (phaseStartTime != null) {
			measuredTime = System.currentTimeMillis()
					- phaseStartTime.longValue();
		}

		this.logger.debug(MessageFormat
				.format("Phase {0} completed by {1}ms", new Object[] {
						event.getPhaseId(), Long.valueOf(measuredTime) }));
		this.phaseTimer.set(null);
	}

	public void beforePhase(PhaseEvent event) {
		this.logger.debug(MessageFormat.format("Phase {0} started",
				new Object[] { event.getPhaseId() }));
		this.phaseTimer.set(Long.valueOf(System.currentTimeMillis()));
	}

	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}
}