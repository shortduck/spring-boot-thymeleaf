package me.ankit.zooplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import me.ankit.zooplus.log.Ilogging;

@SpringBootApplication
public class ZooplusApplication implements Ilogging {

	public static void main(String[] args) {
		SpringApplication.run(ZooplusApplication.class, args);

		Log.fatal("Test - fatal");
		Log.error("Test - error");
		Log.info("Test - info");
		Log.trace("Test - trace");
			
	}

}
