package com.chenly.designpattern.adapter;

/**
 * @author chenly
 * @create 2020-12-05 15:22
 */
public class Client {
	public static void main(String[] args) {
		HttpSession session = new StandardSession("aebsss123");
		session.getSessionId();

		//使用redis之后
		HttpSession session1 = new SessionAdapter(getSessionFromRedis());
		session1.getSessionId();
	}

	private static RedisSession getSessionFromRedis() {
		return new RedisSession();
	}
}
