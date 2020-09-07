package com.chenly.designpattern.builder;

/**
 * @author cly
 * @create 2020-09-07 21:40
 */
public class Client {
	public static void main(String[] args) {
		Builder builder = new MonkeyBuilder();
		//你指定装机猿为你装配电脑
		Director director = new Director(builder);
		//指定装机的配件
		Computer computer = director.createComputer("AMD 3900", "三星evo 970", "微星迫击炮B450M", "威刚万紫千红16G", "英伟达2080TI",
				"爱国者月光宝盒", "振华金蝶650W");
		//超级豪华的配置
		System.out.println("电脑具体参数：" + computer);
	}
}
