package me.ankit.zooplus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import me.ankit.zooplus.ILogging;
import me.ankit.zooplus.Iconstants;
import me.ankit.zooplus.repositories.UserRepository;

@Controller
public class UserController implements ILogging {

	@Autowired
	UserRepository userRepository;

	@GetMapping("/users")
	public String getAllUsers(Model model) {

		model.addAttribute("users", userRepository.findAll());

		return Iconstants.PAGES.USERS.toString().toLowerCase();

	}

}
