package com.chenly.designpattern.abstractfactory.graphicsimpl;

import com.chenly.designpattern.abstractfactory.Graphics;

/**
 * @author cly
 * @create 2020-09-06 22:37
 */
public class IntelGraphics implements Graphics {

	@Override
	public String renderGraphics() {
		return "辣鸡Intel显卡为你渲染4K";
	}
}
