package com.chenly.designpattern.decorator;

/**
 * 加糖
 *
 * @author chenly
 * @create 2020-11-22 20:44
 */
public class SugarCafe extends CafeDecorator {
	private Drink drink;

	private int price = 2;
	private String description = "加糖";

	public SugarCafe(Drink drink) {
		this.drink = drink;
	}

	@Override
	public int getPrice() {
		return price + drink.getPrice();
	}

	@Override
	public String getDescription() {
		return drink.getDescription() + description;
	}
}
