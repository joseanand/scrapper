/**
 * 
 */
package com.learn4j;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jose
 *
 */
public class App {

	private static final Logger LOG = LoggerFactory.getLogger(App.class);

	/**
	 * 
	 */
	public App() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			WebScrapper ws = new WebScrapper();
			ws.scrap();
		} catch (IOException e) {
			LOG.error(e.getMessage());
		}

	}

}
