package me.ankit.zooplus.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;

import me.ankit.zooplus.Iconstants;

@Controller
public class AppErrorController /*implements ErrorController*/ {

	//@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public String showErrors() {
		
		
		return Iconstants.PAGES.ERROR.toString().toLowerCase();
		
		
	}

}
