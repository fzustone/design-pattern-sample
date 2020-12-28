package com.chenly.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的微信公众号
 *
 * @author chenly
 * @create 2020-12-28 21:15
 */
public class MyWeChatOfficialAccount implements  WeChatOfficialAccount{

	private List<WeChatOfficialAccountSubscriber> subscriberList = new ArrayList<>();

	@Override
	public void registerSubscriber(WeChatOfficialAccountSubscriber subscriber) {

		subscriberList.add(subscriber);
	}

	@Override
	public void removeSubscriber(WeChatOfficialAccountSubscriber subscriber) {
		subscriberList.remove(subscriber);
	}

	@Override
	public void notifySubscriber(String message) {
		subscriberList.forEach(subscriber -> subscriber.articleUpdate(message));
	}
}
