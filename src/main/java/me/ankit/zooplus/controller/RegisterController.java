package me.ankit.zooplus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import me.ankit.zooplus.IConstants;

@Controller
public class RegisterController {

	@GetMapping("/register")
	public String newUser() {
		return IConstants.PAGES.REGISTER.toString().toLowerCase();
	}

	@PostMapping("/register")
	public String registeredUser() {
		return IConstants.PAGES.REGISTER.toString().toLowerCase();
	}

}
