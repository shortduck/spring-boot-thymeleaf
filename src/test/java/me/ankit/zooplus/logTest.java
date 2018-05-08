package me.ankit.zooplus;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import me.ankit.zooplus.log.Ilogging;

@RunWith(SpringRunner.class)
@SpringBootTest
public class logTest extends baseTest implements Ilogging{
	
	@Test
	public void testLogFile() {
		
		//TODO: Why only info is getting logged ?
		Log.debug("logTest: Hello this is a debug message");
		Log.info("logTest: Hello this is an info message");
	}
	
	

}
