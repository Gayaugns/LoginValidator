package com.login.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.login.model.UserProfile;


@Controller
@RequestMapping("/user")
public class LoginController {

	@RequestMapping(value = "/validate", method = RequestMethod.POST)
	public String validateUser(@Valid UserProfile users, BindingResult result, ModelMap model) {

		if (!result.hasErrors() && users.getUserId().equals(users.getPassword())) {
			model.addAttribute("userName", users.getUserId());
			return "login-success";
		}
		model.addAttribute("users", new UserProfile());
		return "login";
	}

	@RequestMapping(method = RequestMethod.GET)
	public String displayLogin(ModelMap model) {

		model.addAttribute("users", new UserProfile());
		model.addAttribute("url","/LoginValidator/user/validate");
		return "login";

	}
	
}
