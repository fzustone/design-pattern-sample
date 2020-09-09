package com.chenly.designpattern.proxy;

/**
 * @author cly
 * @create 2020-09-09 20:36
 */
public class Client {
	public static void main(String[] args) {
		CaibiPlayer caibiPlayer=new CaibiPlayer("小陈");

		PowerLeveling powerLeveling=new PowerLeveling(caibiPlayer);

		powerLeveling.rank();

	}
}
