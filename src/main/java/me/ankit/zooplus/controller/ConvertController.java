package me.ankit.zooplus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import me.ankit.zooplus.IConstants;

@Controller
public class ConvertController {

	@GetMapping("/convert")	
	public String newUser() {
		return IConstants.PAGES.CONVERT.toString().toLowerCase();
	}
	
}