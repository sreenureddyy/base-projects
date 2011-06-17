/**
 * 
 */
package com.sree.base.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author srinivasr
 *
 */
@Component("baseBean")
@Scope(value = "session")
public class BaseBean {
	@SuppressWarnings("unused")
	private String string = new String();

	public String getString() {
		return "Hello Sreeeee....";
	}

	public void setString(String string) {
		this.string = string;
	}
	
	
}
