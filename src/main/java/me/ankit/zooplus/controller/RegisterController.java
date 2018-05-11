package me.ankit.zooplus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import me.ankit.zooplus.ILogging;
import me.ankit.zooplus.Iconstants;
import me.ankit.zooplus.Entity.Users;
import me.ankit.zooplus.repositories.UserRepository;

@Controller
public class RegisterController implements ILogging {

	@Autowired
	UserRepository userRepository;

	@PostMapping("/register")
	public String registeredUser(Users user) {

		Log.info("RegisterController:registeredUser");

		Log.info(user);		
		user.setId(12L);

		Log.info(user);

		userRepository.save(user);
		return Iconstants.PAGES.REGISTER.toString().toLowerCase();
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String newUser() {
		Log.info("RegisterController:newUser");
		return Iconstants.PAGES.REGISTER.toString().toLowerCase();
	}

}