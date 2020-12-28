package com.chenly.designpattern.observer;

/**
 * 微信公众号订阅者
 *
 * @author chenly
 * @create 2020-12-28 21:12
 */
public interface WeChatOfficialAccountSubscriber {

	void articleUpdate(String message);
}
