package com.chenly.designpattern.factorymethod;

import com.chenly.designpattern.factorymethod.impl.AkSkHttpClient;
import com.chenly.designpattern.factorymethod.impl.SignatureHttpClient;
import com.chenly.designpattern.factorymethod.impl.TokenHttpClient;

/**
 * @author chenly
 * @create 2020-07-29 21:14
 */
public class HttpClientFactory {

	public IHttpClient getPushHttpType(HttpClientType httpClientType) {
		switch (httpClientType) {
			case AKSK:
				return new AkSkHttpClient();
			case TOKEN:
				return new TokenHttpClient();
			case SIGNATURE:
				return new SignatureHttpClient();
			default:
				break;
		}
		return null;
	}

	public enum HttpClientType {
		TOKEN, AKSK, SIGNATURE;
	}
}
