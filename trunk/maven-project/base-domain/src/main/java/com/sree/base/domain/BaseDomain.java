/**
 * 
 */
package com.sree.base.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.OrderBy;

import com.sree.common.constants.AnnotationValues;

/**
 * @author ysreddy
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
public class BaseDomain implements Serializable {
	@Column(name = "CREATEDBY", length = AnnotationValues.CREATEDBY_LENGTH, nullable = false)
	private String createdBy;

	@Column(name = "CREATEDDATETIME", nullable = false)
	@OrderBy(value = "desc")
	private Timestamp createdDatetime;

	@Column(name = "UPDATEDBY", length = AnnotationValues.CREATEDBY_LENGTH)
	private String updatedBy;

	@Column(name = "UPDATEDDATETIME")
	private Timestamp updatedDatetime;

	/*@Column(name = "HIBVERSION")
	@Version
	private int versionNo;*/

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedDatetime() {
		return createdDatetime;
	}

	public void setCreatedDatetime(Timestamp createdDatetime) {
		this.createdDatetime = createdDatetime;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Timestamp getUpdatedDatetime() {
		return updatedDatetime;
	}

	public void setUpdatedDatetime(Timestamp updatedDatetime) {
		this.updatedDatetime = updatedDatetime;
	}

	/*public int getVersionNo() {
		return versionNo;
	}

	public void setVersionNo(int versionNo) {
		this.versionNo = versionNo;
	}*/

}
