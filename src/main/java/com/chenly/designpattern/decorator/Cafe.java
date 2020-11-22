package com.chenly.designpattern.decorator;

/**
 * 咖啡
 *
 * @author chenly
 * @create 2020-11-22 20:40
 */
public class Cafe implements Drink {
	private int price = 20;

	private String description = "这是一杯咖啡";

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public String getDescription() {
		return description;
	}
}
