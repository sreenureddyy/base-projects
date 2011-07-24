/**
 * 
 */
package com.sree.base.domain;

/**
 * @author Sree
 *
 */
@SuppressWarnings("serial")
public class Currency extends BaseDomain {
	private Long id;
	
	private String currencyName;
	private String currencyCode;
	private String currencySymbol;
	private String lowerDenomination;
	private String aliasName;
	private String isBaseCurrency;
	private String comments;
	
	private Integer changeFactor;
	
	private Boolean isActive;
	private Boolean isModifiable;
	
	private Country country = new Country();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getCurrencySymbol() {
		return currencySymbol;
	}

	public void setCurrencySymbol(String currencySymbol) {
		this.currencySymbol = currencySymbol;
	}

	public String getLowerDenomination() {
		return lowerDenomination;
	}

	public void setLowerDenomination(String lowerDenomination) {
		this.lowerDenomination = lowerDenomination;
	}

	public String getAliasName() {
		return aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public String getIsBaseCurrency() {
		return isBaseCurrency;
	}

	public void setIsBaseCurrency(String isBaseCurrency) {
		this.isBaseCurrency = isBaseCurrency;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Integer getChangeFactor() {
		return changeFactor;
	}

	public void setChangeFactor(Integer changeFactor) {
		this.changeFactor = changeFactor;
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
