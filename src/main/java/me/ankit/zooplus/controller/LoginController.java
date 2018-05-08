package me.ankit.zooplus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import me.ankit.zooplus.IConstants;
import me.ankit.zooplus.log.Ilogging;

@Controller
public class LoginController implements Ilogging {

	@RequestMapping({ "/login", "/" })
	public String registerUser() {
		
		//TODO: make a generic method, that takes `this` and log classname, methodname, and arguments.
		Log.info("LoginController:registerUser()");		
		//Ilogging.LogInfo(this.getClass().toString() , new Object(){}.getClass().getEnclosingMethod().getName());
		
		return IConstants.PAGES.LOGIN.toString().toLowerCase();
	}

}
