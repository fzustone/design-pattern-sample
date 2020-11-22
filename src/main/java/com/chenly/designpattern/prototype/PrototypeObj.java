package com.chenly.designpattern.prototype;

/**
 * @author chenly
 * @create 2020-11-02 21:59
 */
public class PrototypeObj implements Cloneable {

	//覆写父类Object方法
	@Override
	public PrototypeObj clone() {
		PrototypeObj prototypeObj = null;
		try {
			prototypeObj = (PrototypeObj) super.clone();
		} catch (CloneNotSupportedException e) {
			//异常处理
		}
		return prototypeObj;
	}

}