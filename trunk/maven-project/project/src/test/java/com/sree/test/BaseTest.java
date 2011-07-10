/**
 * 
 */
package com.sree.test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sree.base.service.IBaseService;

/**
 * @author srinivasr
 *   
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:/META-INF/spring/springContext-Test.xml",
		"classpath:/META-INF/spring/applicationContext-security.xml",
		"classpath:/META-INF/spring/applicationContext-spring.xml" })
public class BaseTest {
	@Autowired
	IBaseService baseService;
}
