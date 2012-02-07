/**
 * 
 */
package com.sree.base.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.sree.base.domain.User;
import com.sree.base.service.BaseService;
import com.sree.base.service.IBaseService;

/**
 * @author IB0765
 * 
 */
@Component("homeBean")
@Scope(value = "request")
public class HomeBean extends BaseBean {
	private List<User> userList = new ArrayList<User>();

	@Autowired
	private IBaseService baseService;

	public IBaseService getBaseService() {
		return baseService;
	}

	public void setBaseService(IBaseService baseService) {
		this.baseService = baseService;
	}

	public void doSomeThing() {

	}

	public List<User> getUserList() {
		userList = baseService.find("getAllUsers", new Object[] {});
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
}
