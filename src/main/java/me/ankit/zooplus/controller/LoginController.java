package me.ankit.zooplus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import me.ankit.zooplus.IConstants;

@Controller
public class LoginController {

	@RequestMapping({ "/login", "/" })
	public String registerUser() {
		return IConstants.PAGES.LOGIN.toString().toLowerCase();
	}

}
