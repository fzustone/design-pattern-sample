package com.chenly.designpattern.observer;

/**
 * @author chenly
 * @create 2020-12-28 21:10
 */
public class Client {
	public static void main(String[] args) {

		WeChatOfficialAccountSubscriber user1 = new WeChatUser("chenly");
		WeChatOfficialAccountSubscriber user2 = new WeChatUser("Stone");

		WeChatOfficialAccount officialAccount = new MyWeChatOfficialAccount();
		//两个维信用户订阅了这个公众号
		officialAccount.registerSubscriber(user1);
		officialAccount.registerSubscriber(user2);

		//公众号发布文章，订阅者都会受到文章通知
		officialAccount.notifySubscriber("论持久战.....");
		//Stone取消订阅
		officialAccount.removeSubscriber(user2);
		//再次发布文章
		officialAccount.notifySubscriber("如何学习英语.....");
	}
}
