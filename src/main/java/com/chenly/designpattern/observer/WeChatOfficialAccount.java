package com.chenly.designpattern.observer;

/**
 * 微信公众号
 *
 * @author chenly
 * @create 2020-12-28 21:10
 */
public interface WeChatOfficialAccount {

	void registerSubscriber(WeChatOfficialAccountSubscriber subscriber);

	void removeSubscriber(WeChatOfficialAccountSubscriber subscriber);

	void notifySubscriber(String message);
}
