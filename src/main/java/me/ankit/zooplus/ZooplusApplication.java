package me.ankit.zooplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZooplusApplication implements ILogging {

	public static void main(String[] args) {
		SpringApplication.run(ZooplusApplication.class, args);

		Log.fatal("Test - fatal");
		Log.error("Test - error");
		Log.info("Test - info");
		Log.trace("Test - trace");
			
	}

}
