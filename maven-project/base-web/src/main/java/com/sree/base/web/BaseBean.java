/**
 * 
 */
package com.sree.base.web;

import java.io.Serializable;

import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

import org.springframework.context.annotation.Scope;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

/**
 * @author srinivasr
 *
 */
@SuppressWarnings("serial")
@Component("baseBean")
@Scope(value = "session")
public class BaseBean implements Serializable{
	@SuppressWarnings("unused")
	private String string = new String();
	public static final String jstlBundleParam = "javax.servlet.jsp.jstl.fmt.localizationContext";
	
	public String getBundleName() {
		return getServletContext().getInitParameter(jstlBundleParam);
	}

	protected ServletContext getServletContext() {
		return (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
	}
	
	public UserDetails getUser() {
		return (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	}
	
	public String getString() {
		return "Hello Sreeeee....";
	}

	public void setString(String string) {
		this.string = string;
	}
	
	
}
