/**
 * 
 */
package com.sree.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * @author srinivasr
 * 
 */
@SuppressWarnings("unchecked")
public class TestUser extends BaseTest {
	private Logger log = Logger.getLogger(TestUser.class);
	@Test
	public void testCase() {
		List<String> usernames = baseService.find("getusers");
		log.info(usernames.size());
		log.info(usernames.get(0));
	} 
}
    