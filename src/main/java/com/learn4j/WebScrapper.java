/**
 * 
 */
package com.learn4j;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jose
 *
 */
public class WebScrapper {
	
	private static final Logger LOG = LoggerFactory.getLogger(WebScrapper.class);

	/**
	 * @throws IOException 
	 * 
	 */
	public void scrap() throws IOException {
		Document doc = Jsoup.connect("https://en.wikipedia.org/").get();
		LOG.info(doc.title());
		Elements newsHeadlines = doc.select("#mp-itn b a");
		for (Element headline : newsHeadlines) {
			LOG.info("%s\n\t%s" +
		    headline.attr("title") + headline.absUrl("href"));
		}
	}

}
