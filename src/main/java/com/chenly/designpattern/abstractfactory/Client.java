package com.chenly.designpattern.abstractfactory;

import com.chenly.designpattern.abstractfactory.factoryimpl.AmdFactory;
import com.chenly.designpattern.abstractfactory.factoryimpl.IntelFactory;

/**
 * @author cly
 * @create 2020-09-06 22:42
 */
public class Client {
	public static void main(String[] args) {
		Factory intelFactory = new IntelFactory();

		Factory amdFactory=new AmdFactory();

		intelFactory.createCpu().workOnMainboard();
		amdFactory.createCpu().workOnMainboard();


		intelFactory.createGraphics().renderGraphics();
		amdFactory.createGraphics().renderGraphics();

	}
}
