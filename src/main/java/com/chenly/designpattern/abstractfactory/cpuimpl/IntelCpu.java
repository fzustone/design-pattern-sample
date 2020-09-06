package com.chenly.designpattern.abstractfactory.cpuimpl;

import com.chenly.designpattern.abstractfactory.Cpu;

/**
 * @author cly
 * @create 2020-09-06 22:37
 */
public class IntelCpu implements Cpu {
	@Override
	public String workOnMainboard() {
		return "INTEL 10900正在主板上工作";
	}
}
