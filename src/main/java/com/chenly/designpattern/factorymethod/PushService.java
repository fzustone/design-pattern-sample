package com.chenly.designpattern.factorymethod;

/**
 * 调用者，推送任务的业务
 *
 * @author chenly
 * @create 2020-07-29 21:23
 */
public class PushService {
	public static void main(String[] args) {
		HttpClientFactory httpClientFactory = new HttpClientFactory();
		IHttpClient httpClient = httpClientFactory.getPushHttpType(HttpClientFactory.HttpClientType.AKSK);
		if (httpClient == null) {
			System.out.println("异常！没有找到指定类型的HttpClient");
		}
		httpClient.push();
	}
}
