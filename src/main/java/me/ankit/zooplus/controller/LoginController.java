package me.ankit.zooplus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import me.ankit.zooplus.ILogging;
import me.ankit.zooplus.Iconstants;

@Controller
public class LoginController implements ILogging {

	@RequestMapping({ "/login", "/" })
	public String registerUser() {
		
		//TODO: make a generic method, that takes `this` and log classname, methodname, and arguments.
		Log.info("LoginController:registerUser()");		
		//Ilogging.LogInfo(this.getClass().toString() , new Object(){}.getClass().getEnclosingMethod().getName());
		
		
		return Iconstants.PAGES.LOGIN.toString().toLowerCase();
	}

}
