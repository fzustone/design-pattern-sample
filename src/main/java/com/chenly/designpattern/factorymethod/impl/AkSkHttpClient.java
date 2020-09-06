package com.chenly.designpattern.factorymethod.impl;

import com.chenly.designpattern.factorymethod.IHttpClient;

/**
 * @author chenly
 * @create 2020-07-29 21:10
 */
public class AkSkHttpClient implements IHttpClient {
	@Override
	public void push() {
		System.out.println("使用AKSK推送");
	}
}
