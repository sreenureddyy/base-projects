/**
 * 
 */
package com.sree.base.domain;

/**
 * @author Sree
 *
 */
@SuppressWarnings("serial")
public class State extends BaseDomain {
	private Long id;
	
	private String sateName;
	private String stateCode;
	
	private Boolean isDefault;
	private Boolean isActive;
	private Boolean isModifiable;
	
	private Country country = new Country();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSateName() {
		return sateName;
	}

	public void setSateName(String sateName) {
		this.sateName = sateName;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Boolean getIsModifiable() {
		return isModifiable;
	}

	public void setIsModifiable(Boolean isModifiable) {
		this.isModifiable = isModifiable;
	}
}
