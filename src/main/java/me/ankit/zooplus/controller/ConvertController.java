package me.ankit.zooplus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import me.ankit.zooplus.Iconstants;

@Controller
public class ConvertController {

	//@GetMapping("/convert")	
	@RequestMapping("/convert")
	public String newUser() {
		return Iconstants.PAGES.CONVERT.toString().toLowerCase();
	}
	
}
