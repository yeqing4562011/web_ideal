package com.ideal.web.controller;

import com.ideal.utility.cache.DelegateMemcache;

/**
 *
 * @author Administrator
 *
 */
public class ControllerBase {

	private DelegateMemcache cache;

	public DelegateMemcache getCache() {
		return cache;
	}

	public void setCache(DelegateMemcache cache) {
		this.cache = cache;
	}

}
