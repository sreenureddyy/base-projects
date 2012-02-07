/**
 * 
 */
package com.sree.common.constants;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sree
 * 
 */
public enum SystemConstants {
	GENDER {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "Male" });
			list.add(new Object[] { new Integer(2), "Female" });
			list.add(new Object[] { new Integer(2), "Others" });
			return list;
		}
	},

	SALUTATION {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "Mr." });
			list.add(new Object[] { new Integer(2), "Mrs." });
			list.add(new Object[] { new Integer(2), "Ms." });
			return list;
		}
	},

	PAYMENT_MODE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "Cash", "Cash" });
			list.add(new Object[] { "Cheque", "Cheque" });
			list.add(new Object[] { "DD", "DD" });
			return list;
		}
	},

	BILLING_FREQUENCY {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "Fortnightly", "Fortnightly" });
			list.add(new Object[] { "Monthly", "Monthly" });
			list.add(new Object[] { "Quaterly", "Quaterly" });
			list.add(new Object[] { "Half Yearly", "Half Yearly" });
			list.add(new Object[] { "Yearly", "Yearly" });
			return list;
		}
	},
	TRANSPORTATION_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "1", "Own Transport" });
			list.add(new Object[] { "2", "Hire Transport" });
			return list;
		}
	},
	TRANSPORTMODE_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "1", "By Air" });
			list.add(new Object[] { "2", "By Road" });
			list.add(new Object[] { "3", "By Rail" });
			list.add(new Object[] { "4", "By Sea" });
			return list;
		}
	},
	CALENDAR_WEEK_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(2), "Monday" });
			list.add(new Object[] { new Integer(3), "Tuesday" });
			list.add(new Object[] { new Integer(4), "Wednesday" });
			list.add(new Object[] { new Integer(5), "Thursday" });
			list.add(new Object[] { new Integer(6), "Friday" });
			list.add(new Object[] { new Integer(7), "Saturday" });
			list.add(new Object[] { new Integer(1), "Sunday" });
			return list;
		}
	},
	CALENDAR_DAY_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "1" });
			list.add(new Object[] { new Integer(2), "2" });
			list.add(new Object[] { new Integer(3), "3" });
			list.add(new Object[] { new Integer(4), "4" });
			list.add(new Object[] { new Integer(5), "5" });
			list.add(new Object[] { new Integer(6), "6" });
			list.add(new Object[] { new Integer(7), "7" });
			list.add(new Object[] { new Integer(8), "8" });
			list.add(new Object[] { new Integer(9), "9" });
			list.add(new Object[] { new Integer(10), "10" });
			list.add(new Object[] { new Integer(11), "11" });
			list.add(new Object[] { new Integer(12), "12" });
			list.add(new Object[] { new Integer(13), "13" });
			list.add(new Object[] { new Integer(14), "14" });
			list.add(new Object[] { new Integer(15), "15" });
			list.add(new Object[] { new Integer(16), "16" });
			list.add(new Object[] { new Integer(17), "17" });
			list.add(new Object[] { new Integer(18), "18" });
			list.add(new Object[] { new Integer(19), "19" });
			list.add(new Object[] { new Integer(20), "20" });
			list.add(new Object[] { new Integer(21), "21" });
			list.add(new Object[] { new Integer(22), "22" });
			list.add(new Object[] { new Integer(23), "23" });
			list.add(new Object[] { new Integer(24), "24" });
			list.add(new Object[] { new Integer(25), "25" });
			list.add(new Object[] { new Integer(26), "26" });
			list.add(new Object[] { new Integer(27), "27" });
			list.add(new Object[] { new Integer(28), "28" });
			list.add(new Object[] { new Integer(29), "29" });
			list.add(new Object[] { new Integer(30), "30" });
			list.add(new Object[] { new Integer(31), "31" });
			return list;
		}
	},

	VENDOR_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Manufacture" });
			list.add(new Object[] { new Long(2), "Exporter" });
			list.add(new Object[] { new Long(3), "Distributor" });
			return list;
		}
	},
	BANK_ACCOUNT_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "1", "Saving Bank" });
			list.add(new Object[] { "2", "Current Account" });
			list.add(new Object[] { "3", "Over Draft" });
			return list;
		}
	},

	INSTRUMENTS_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "CASH", "CASH" });
			list.add(new Object[] { "DD", "DD" });
			list.add(new Object[] { "CHEQUE", "CHEQUE" });
			return list;
		}
	},

	BILLING_PAYMENT_MODES {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(14), "Cash" });
			list.add(new Object[] { new Integer(15), "Cheque" });
			list.add(new Object[] { new Integer(16), "Credit Card" });
			list.add(new Object[] { new Integer(17), "Ped" });
			return list;
		}
	},

	REGISTRATION_RELATION {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "Son Of" });
			list.add(new Object[] { new Integer(2), "Wife Of" });
			list.add(new Object[] { new Integer(3), "Daughter Of" });
			return list;
		}
	},

	VISIT_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "New Visit" });
			list.add(new Object[] { new Integer(2), "FollowUp" });
			list.add(new Object[] { new Integer(3), "WalkIn" });
			list.add(new Object[] { new Integer(4), "Referral" });
			return list;
		}
	},
	SPONSOR_REFUND_MODE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "Cash", "Cash" });
			list.add(new Object[] { new Integer(2), "Cheque", "Cheque" });
			list.add(new Object[] { new Integer(3), "DD", "DD" });
			return list;
		}
	};

	public abstract List<Object[]> getEnumConstants();
}
