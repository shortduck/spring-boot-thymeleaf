package me.ankit.zooplus;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ZooplusApplicationTests implements ILogging {

	@Test
	public void contextLoads() {
		System.out.println("in ZooplusApplicationTests.");
		Log.debug("ZooplusApplicationTests: Hello this is a debug message");
		Log.info("ZooplusApplicationTests :Hello this is an info message");
	}

}
