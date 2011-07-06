/**
 * 
 */
package com.sree.test;

import java.util.List;

import org.junit.Test;

/**
 * @author srinivasr
 * 
 */
@SuppressWarnings("unchecked")
public class TestUser extends BaseTest {
	@Test
	public void testCase() {
		List<String> usernames = baseService.find("getusers");
		System.out.println(usernames.size());
		System.out.println(usernames.get(0));
	}
}
