package it.stilo.uCrawler.concurrentFetcher.proxy;

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

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 *
 * @author stilo
 */
public class ProxyAddressProvider implements ProxyAddressProviderIF{

	private ConcurrentLinkedQueue<ProxyAddress> proxies;
	
	@Override
	public ProxyAddress getProxyAddress() {

		return proxies.poll();
	}

	@Override
	public void remove(ProxyAddress p) {
		// TODO Auto-generated method stub
		
	}
	
	public void setProxies(ConcurrentLinkedQueue<ProxyAddress> proxies) {
		this.proxies = proxies;
	}

}