package com.zoomiti.realcore.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.common.base.Stopwatch;

public class Log {

	public static final Logger LOGGER = LogManager.getLogger(Reference.MODID);

	public static void info(String... messages) {
		for (int i = 0; i < messages.length; i++) {
			LOGGER.info(messages[i]);
		}
	}

	public static void warn(String... messages) {
		for (int i = 0; i < messages.length; i++) {
			LOGGER.warn(messages[i]);
		}
	}

	public static void error(String... messages) {
		for (int i = 0; i < messages.length; i++) {
			LOGGER.error(messages[i]);
		}
	}

	public static void debug(String... messages) {
		for (int i = 0; i < messages.length; i++) {
			LOGGER.debug(messages[i]);
		}
	}

	public static void fatal(String... messages) {
		for (int i = 0; i < messages.length; i++) {
			LOGGER.fatal(messages[i]);
		}
	}

	public static void trace(String... messages) {
		for (int i = 0; i < messages.length; i++) {
			LOGGER.trace(messages[i]);
		}
	}

	public static class LoggedTimer {
		private final Stopwatch stopWatch = Stopwatch.createUnstarted();
		private String message = "";

		public void start(String message) {
			this.message = message;
			LOGGER.info("{}...", message);
			stopWatch.reset();
			stopWatch.start();
		}

		public void stop() {
			stopWatch.stop();
			LOGGER.info("{} took {}", message, stopWatch);
		}
	}
}
