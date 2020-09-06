package com.chenly.designpattern.abstractfactory;

/**
 * 工厂接口
 *
 * @author cly
 * @create 2020-09-06 22:32
 */
public interface Factory {

	Cpu createCpu();

	Graphics createGraphics();
}
