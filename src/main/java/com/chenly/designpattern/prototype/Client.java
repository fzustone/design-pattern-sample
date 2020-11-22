package com.chenly.designpattern.prototype;

/**
 * @author chenly
 * @create 2020-11-02 22:03
 */
public class Client {
	public static void main(String[] args) {

		PrototypeObj thing = new PrototypeObj();

		//拷贝一个对象
		PrototypeObj cloneThing = thing.clone();

	}
}
