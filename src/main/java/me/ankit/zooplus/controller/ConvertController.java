package me.ankit.zooplus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import me.ankit.zooplus.ILogging;
import me.ankit.zooplus.Iconstants;
import me.ankit.zooplus.Entity.EnquiryHistory;

@Controller
public class ConvertController implements ILogging  {

	//@GetMapping("/convert")
	// @RequestMapping("/convert")
	@RequestMapping(value = "/convert", method = RequestMethod.GET)
	public String convertDisplay() {
		return Iconstants.PAGES.CONVERT.toString().toLowerCase();
	}

	@PostMapping("/convert")
	public String convertCurrency(EnquiryHistory history) {
		
		Log.info("convertCurrency.....");
		Log.info(history.toString());
		
		//return Iconstants.PAGES.CONVERT.toString().toLowerCase();
		return Iconstants.PAGES.USERS.toString().toLowerCase();
		
	}

}
