package me.ankit.zooplus.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface Ilogging {

	// TODO: Currently logger always shows "me.ankit.zooplus.log.Ilogging",
	// it should be changed to show the actual filename.

	static final Logger Log = LogManager.getLogger();
	
}
