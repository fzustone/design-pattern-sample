package com.chenly.designpattern.abstractfactory.factoryimpl;

import com.chenly.designpattern.abstractfactory.Cpu;
import com.chenly.designpattern.abstractfactory.Factory;
import com.chenly.designpattern.abstractfactory.Graphics;
import com.chenly.designpattern.abstractfactory.cpuimpl.AmdCpu;
import com.chenly.designpattern.abstractfactory.graphicsimpl.AmdGraphics;

/**
 * @author cly
 * @create 2020-09-06 22:36
 */
public class AmdFactory implements Factory {
	@Override
	public Cpu createCpu() {
		return new AmdCpu();
	}

	@Override
	public Graphics createGraphics() {
		return new AmdGraphics();
	}
}
