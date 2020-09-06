package com.chenly.designpattern.abstractfactory.graphicsimpl;

import com.chenly.designpattern.abstractfactory.Graphics;

/**
 * @author cly
 * @create 2020-09-06 22:36
 */
public class AmdGraphics implements Graphics {

	@Override
	public String renderGraphics() {
		return "AMD显卡为你渲染4K";
	}
}
