package com.chenly.designpattern.singleton.hungry;

/**
 * 单例对象
 * 饿汉式
 *
 * @author chenly
 * @create 2020-07-27 21:11
 */
public class Singleton {

	/**
	 * 类加载时就初始化
	 */
	private static final Singleton INSTANCE = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return INSTANCE;
	}

	public void dosomthing() {
		System.out.println("do something");
	}
}
