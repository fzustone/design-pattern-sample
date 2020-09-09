package com.chenly.designpattern.proxy;

/**
 * @author cly
 * @create 2020-09-09 20:39
 */
public class CaibiPlayer implements HonorOfKingsPlayer {

	private String name;

	public CaibiPlayer(String name) {
		this.name = name;
	}

	@Override
	public void rank() {
		System.out.println(name + "账号开始5V5排位");
	}
}
