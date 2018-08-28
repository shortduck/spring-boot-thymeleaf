package me.ankit.zooplus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface ILogging {

	// TODO: Currently logger always shows "me.ankit.zooplus.log.Ilogging",
	// it should be changed to show the actual filename.

	static final Logger Log = LogManager.getLogger();
	
	
	
//	public static void LogInfo(String className, String methodName) {
//		Log.info("Class Name: " + className + ", Method Name:" + methodName);		
//	}
	
}
