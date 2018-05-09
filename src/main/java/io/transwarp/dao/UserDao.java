package io.transwarp.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDao {

	private static final Logger log = LoggerFactory.getLogger(UserDao.class);
	
	/**
	 * 判断是否登录成功
	 * @param username
	 * @param password
	 * @return
	 */
	public static boolean loginSuccess(String username, String password) {
		log.info("no completed of login");
		// to-do
		return true;
	}
}
