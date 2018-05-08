package me.ankit.zooplus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import me.ankit.zooplus.Iconstants;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		return Iconstants.PAGES.HOME.toString().toLowerCase();
	}

}
