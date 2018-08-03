package me.ankit.zooplus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

	@RequestMapping(value = "user/{userId}", method = RequestMethod.GET)
	public String user(@PathVariable long userId, Model model) {

		Log.info("Userid : " + userId);

		model.addAttribute("user", userRepository.findById(userId).get());
		
		//model.addAttribute("test", "Ankit");

		return "user";
	}

}
