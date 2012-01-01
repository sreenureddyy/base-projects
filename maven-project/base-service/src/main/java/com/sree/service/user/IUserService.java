/**
 * 
 */
package com.sree.service.user;

import java.util.List;

/**
 * @author Sree
 * 
 */
public interface IUserService {
	public Object getUser(Class<?> clazz, Long id);
	public List<?> getUser(String queryName, Object... objects);
}
