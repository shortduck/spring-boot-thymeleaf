package me.ankit.zooplus.bootstrap;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import me.ankit.zooplus.ILogging;
import me.ankit.zooplus.Entity.EnquiryHistory;
import me.ankit.zooplus.Entity.Users;
import me.ankit.zooplus.repositories.EnquiryHistoryRepository;
import me.ankit.zooplus.repositories.UserRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>, ILogging {

	private UserRepository userRepository;
	
	@Autowired
	private EnquiryHistoryRepository enquiryRepository;

	public DevBootstrap(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	public void init() {

		Users ankit = new Users("ankit@gmail.com", "password", "ROLE_USER", 1,
				new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()));

		Users pinki = new Users("pinki@gmail.com", "password", "ROLE_USER", 1,
				new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()));

		EnquiryHistory ankit_history1 = new EnquiryHistory(/*1l, */"USD", "INR", 2.11f, 1.22f, 1,
				new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()));

		EnquiryHistory ankit_history2 = new EnquiryHistory(/*2l,*/ "USD", "INR", 2.22f, 1.22f, 1,
				new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()));
		
		
		EnquiryHistory pinki_history1 = new EnquiryHistory(/*1l, */"CAD", "INR", 1.00f, 1.22f, 1,
				new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()));

		EnquiryHistory pinki_history2 = new EnquiryHistory(/*2l,*/ "CAD", "INR", 2.22f, 1.22f, 1,
				new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()));
		
		Log.info("DevBootstrap:init");
		
		userRepository.deleteAll();
			
		
		ankit.getEnquiries().add(ankit_history1);
		ankit.getEnquiries().add(ankit_history2);
		userRepository.save(ankit);
		enquiryRepository.save(ankit_history1);
		enquiryRepository.save(ankit_history2);
		
		
		pinki.getEnquiries().add(pinki_history1);
		pinki.getEnquiries().add(pinki_history2);
		userRepository.save(pinki);
		enquiryRepository.save(pinki_history1);
		enquiryRepository.save(pinki_history1);		

	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {

		Log.info("DevBootstrap:onApplicationEvent");

		init();
	}

}
