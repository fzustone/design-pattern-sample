package com.chenly.designpattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author cly
 * @create 2020-09-15 20:50
 */
public class MyInvocationHandler implements InvocationHandler {

	private Object target=null;

	public MyInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("这里可以打印一些必要日志");
		return method.invoke(target, args);
	}
}
