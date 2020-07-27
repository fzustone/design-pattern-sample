package com.chenly.designpattern.singleton.doublecheckedlocking;

/**
 * 懒汉式变种，双重检验锁模式（double checked locking pattern）
 * 延迟加载和线程安全
 *
 * @author chenly
 * @create 2020-07-27 21:32
 */
public class Singleton {

	private volatile static Singleton instance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		//第一次校验
		if (instance == null) {
			synchronized (Singleton.class) {
				//第二次校验
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

	public void dosomthing() {
		System.out.println("do something");
	}

}
