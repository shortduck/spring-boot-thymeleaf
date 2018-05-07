package me.ankit.zooplus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import me.ankit.zooplus.IConstants;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		return IConstants.PAGES.HOME.toString().toLowerCase();
	}

}
