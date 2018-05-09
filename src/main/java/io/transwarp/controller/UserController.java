package io.transwarp.controller;

import io.transwarp.dao.UserDao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserController {

	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView loginUser(HttpServletRequest request, HttpSession session) {
		ModelAndView model = new ModelAndView();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if (UserDao.loginSuccess(username, password)) {
			session.setAttribute("username", username);
			model.setViewName("index");
		} else {
			log.info("login faild of user [{}]", username);
			model.setViewName("login");
		}
		return model;
	}
}
