package org.june.model.dao.test;

import org.apache.log4j.Logger;
import org.june.model.dto.UsersDTO;
import org.june.model.services.UserinfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class JuneDaoTests {
	@Autowired
	private UserinfoService userinfoService;
	private static final Logger logger = Logger.getLogger(JuneDaoTests.class);

	@Test
	public void testFindAll() throws Throwable {
		logger.info(userinfoService.findAllUsers());
	}

	@Test
	public void testInsertUsers() throws Throwable {
		// AbstractApplicationContext context = new
		// ClassPathXmlApplicationContext("applicationContext.xml");
		// userinfoService = (UserinfoService)
		// context.getBean("userinfoService");
		UsersDTO user = new UsersDTO();
		user.setName("Áõ¿¥");
		user.setAge(41);

		userinfoService.addUser(user);
		// context.close();

	}

}
