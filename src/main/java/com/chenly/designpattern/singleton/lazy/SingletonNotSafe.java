package com.chenly.designpattern.singleton.lazy;

/**
 * 懒汉式，线程不安全
 * @author chenly
 * @create 2020-07-27 21:21
 */
public class SingletonNotSafe {
	private static SingletonNotSafe instance;

	private SingletonNotSafe() {
	}

	public static SingletonNotSafe getInstance() {
		if (instance == null) {
			instance = new SingletonNotSafe();
		}
		return instance;
	}

	public void dosomthing() {
		System.out.println("do something");
	}
}
