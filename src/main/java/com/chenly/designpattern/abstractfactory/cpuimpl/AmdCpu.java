package com.chenly.designpattern.abstractfactory.cpuimpl;

import com.chenly.designpattern.abstractfactory.Cpu;

/**
 * @author cly
 * @create 2020-09-06 22:36
 */
public class AmdCpu implements Cpu {
	@Override
	public String workOnMainboard() {
		return "AMD 3900正在主板上工作";
	}
}
