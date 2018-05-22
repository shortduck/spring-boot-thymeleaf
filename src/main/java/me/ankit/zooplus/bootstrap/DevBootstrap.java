package me.ankit.zooplus.bootstrap;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import me.ankit.zooplus.ILogging;
import me.ankit.zooplus.Entity.Users;
import me.ankit.zooplus.repositories.UserRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>, ILogging {

	private UserRepository userRepository;

	public DevBootstrap(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	public void init() {

		Users ankit = new Users("ankit@gmail.com", "password", "ROLE_USER", 1,
				new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()));

		Users pinki = new Users("pinki@gmail.com", "password", "ROLE_USER", 1,
				new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()));

		Log.info("DevBootstrap:init");
		userRepository.save(ankit);

		userRepository.save(pinki);

	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {

		Log.info("DevBootstrap:onApplicationEvent");

		init();
	}

}
