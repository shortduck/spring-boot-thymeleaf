package me.ankit.zooplus.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import me.ankit.zooplus.ILogging;
import me.ankit.zooplus.Iconstants;

@Controller
public class LoginController implements ILogging {

	// @GetMapping({ "/login", "/" })
	@RequestMapping(value = "/login")
	public String loginUser() {

		// TODO: make a generic method, that takes `this` and log classname, methodname,
		// and arguments.
		Log.info("LoginController:login()");
		// Ilogging.LogInfo(this.getClass().toString() , new
		// Object(){}.getClass().getEnclosingMethod().getName());

		return Iconstants.PAGES.LOGIN.toString().toLowerCase();
	}

	
//	  @PostMapping({ "/login" }) public String loginProcessing() {
//	  
//	  Log.info("LoginController:loginProcessing()");
//	  
//	  User user = (User)
//	  SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//	  
//	  Log.info("Login user is : " + user.getUsername());
//	  
//	  return Iconstants.PAGES.CONVERT.toString().toLowerCase();
//	  
//	  }
	 

}
