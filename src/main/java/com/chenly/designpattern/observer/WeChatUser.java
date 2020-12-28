package com.chenly.designpattern.observer;

/**
 * 具体订阅者
 *
 * @author chenly
 * @create 2020-12-28 21:16
 */
public class WeChatUser implements WeChatOfficialAccountSubscriber {

	private String name;

	public WeChatUser(String name) {
		this.name = name;
	}

	@Override
	public void articleUpdate(String message) {
		System.out.println("接收到了新的文章通知，我要开始阅读了！" + message);
	}
}
