package com.chenly.designpattern.proxy.dynamicproxy;

/**
 * @author cly
 * @create 2020-09-15 20:49
 */
public class FooImpl implements Foo{
	@Override
	public void doSomething() {
		System.out.println("这是一个实现类");
	}
}
