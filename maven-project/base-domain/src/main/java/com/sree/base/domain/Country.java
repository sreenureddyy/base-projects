/**
 * 
 */
package com.sree.base.domain;

/**
 * @author Sree
 *
 */
@SuppressWarnings("serial")
public class Country extends BaseDomain {

	private Long id;
	
	private String countryName;
	private String countryCode;
	private String countyPhoneCode;
	
	private Boolean isDefault;
	private Boolean isActive;
	private Boolean isModifiable;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountyPhoneCode() {
		return countyPhoneCode;
	}
	public void setCountyPhoneCode(String countyPhoneCode) {
		this.countyPhoneCode = countyPhoneCode;
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
	public Boolean getIsModifiable() {
		return isModifiable;
	}
	public void setIsModifiable(Boolean isModifiable) {
		this.isModifiable = isModifiable;
	}
}
