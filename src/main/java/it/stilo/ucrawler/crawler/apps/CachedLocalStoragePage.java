package it.stilo.uCrawler.crawler.apps;

/*
 * #%L
 * uCrawler
 * %%
 * Copyright (C) 2012 - 2018 Giovanni Stilo
 * %%
 * uCrawler is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program.  If not, see
 * <https://www.gnu.org/licenses/lgpl-3.0.txt>.
 * #L%
 */


import it.stilo.uCrawler.crawler.Crawler;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author metelli & musolino & stilo
 */
public class CachedLocalStoragePage {
     public static void main(String[] args) throws Throwable {

		// create and configure beans
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(
				new String[] { "conf/map_store_local_page_test_cached.xml" });
		// retrieve configured instance
		Crawler c = (Crawler) context.getBean("crawler");
		c.startCrawling();
                
               
	}
}