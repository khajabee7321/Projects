package com.Educonnect_cucumber;

import org.apache.log4j.Logger;

public class Log {
private static Logger Log=Logger.getLogger(Log.class.getName());
public static void info() {
	Log.info("message");
}


}
