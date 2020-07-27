package com.chenly.designpattern.singleton.staticnestedclass;

/**
 * 静态内部类方式创建单例
 *
 * @author chenly
 * @create 2020-07-27 21:47
 */
public class Singleton {

	private static class SingletonHolder {
		private static final Singleton INSTANCE = new Singleton();
	}

	private Singleton() {
	}

	public static Singleton getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
