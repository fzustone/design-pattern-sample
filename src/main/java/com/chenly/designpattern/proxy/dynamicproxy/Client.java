package com.chenly.designpattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;

/**
 * @author cly
 * @create 2020-09-15 20:52
 */
public class Client {
	public static void main(String[] args) {
		Foo foo = new FooImpl();

		InvocationHandler invocationHandler = new MyInvocationHandler(foo);
		Foo foo1 = DynamicProxy.newProxyInstance(foo.getClass().getClassLoader(), foo.getClass().getInterfaces(), invocationHandler);
		foo1.doSomething();
	}
}
