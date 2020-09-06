package com.chenly.designpattern.factorymethod.impl;

import com.chenly.designpattern.factorymethod.IHttpClient;

/**
 * @author chenly
 * @create 2020-07-29 21:11
 */
public class SignatureHttpClient implements IHttpClient {
	@Override
	public void push() {
		System.out.println("使用SIGNATURE方式推送");
	}
}
