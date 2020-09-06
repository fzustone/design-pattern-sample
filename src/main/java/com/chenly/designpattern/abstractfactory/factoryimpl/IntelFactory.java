package com.chenly.designpattern.abstractfactory.factoryimpl;

import com.chenly.designpattern.abstractfactory.Cpu;
import com.chenly.designpattern.abstractfactory.Factory;
import com.chenly.designpattern.abstractfactory.Graphics;
import com.chenly.designpattern.abstractfactory.cpuimpl.IntelCpu;
import com.chenly.designpattern.abstractfactory.graphicsimpl.IntelGraphics;

/**
 * @author cly
 * @create 2020-09-06 22:35
 */
public class IntelFactory implements Factory {
	@Override
	public Cpu createCpu() {
		return new IntelCpu();
	}

	@Override
	public Graphics createGraphics() {
		return new IntelGraphics();
	}
}
