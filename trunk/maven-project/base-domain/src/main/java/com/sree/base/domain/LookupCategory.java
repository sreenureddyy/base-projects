/**
 * 
 */
package com.sree.base.domain;

/**
 * @author Sree
 *
 */
@SuppressWarnings("serial")
public class LookupCategory extends BaseDomain {
	private Long id;
	
	private String lookupCategory;
	private String description;
	
	private Boolean isActive;
	private Boolean isModifiable;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLookupCategory() {
		return lookupCategory;
	}
	public void setLookupCategory(String lookupCategory) {
		this.lookupCategory = lookupCategory;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
