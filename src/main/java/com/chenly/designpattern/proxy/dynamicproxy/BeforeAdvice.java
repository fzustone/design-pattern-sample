package com.chenly.designpattern.proxy.dynamicproxy;

/**
 * 具体的通知接口
 *
 * @author chenly
 * @create 2020-11-01 22:57
 */
public class BeforeAdvice implements IAdvice {
	@Override
	public void exec() {
		System.out.println("我是前置通知，我被执行了！");
	}
}