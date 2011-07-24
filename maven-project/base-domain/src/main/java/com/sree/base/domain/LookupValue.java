/**
 * 
 */
package com.sree.base.domain;

/**
 * @author Sree
 *
 */
@SuppressWarnings("serial")
public class LookupValue extends BaseDomain {

	private Long id;

	private String lookupCode;
	private String lookupValue;
	private String description;
	
	private int sortOrder;
	
	private LookupCategory lookupCategory = new LookupCategory();
	
	private Boolean isActive;
	private Boolean isModifiable;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLookupCode() {
		return lookupCode;
	}
	public void setLookupCode(String lookupCode) {
		this.lookupCode = lookupCode;
	}
	public String getLookupValue() {
		return lookupValue;
	}
	public void setLookupValue(String lookupValue) {
		this.lookupValue = lookupValue;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LookupCategory getLookupCategory() {
		return lookupCategory;
	}
	public void setLookupCategory(LookupCategory lookupCategory) {
		this.lookupCategory = lookupCategory;
	}
	public int getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
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
