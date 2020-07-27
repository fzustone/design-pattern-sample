package com.chenly.designpattern.singleton.lazy;

/**
 * 懒汉式，线程安全
 *
 * @author chenly
 * @create 2020-07-27 21:27
 */
public class SingletonSafe {
	private static SingletonSafe instance;

	private SingletonSafe() {
	}

	public static synchronized SingletonSafe getInstance() {

		if (instance == null) {
			instance = new SingletonSafe();
		}
		return instance;
	}

	public void dosomthing() {
		System.out.println("do something");
	}
}
