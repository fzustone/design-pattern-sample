package com.chenly.designpattern.decorator;

/**
 * 加牛奶
 *
 * @author chenly
 * @create 2020-11-22 20:47
 */
public class MilkCafe extends CafeDecorator {
	private Drink drink;

	private int price = 5;
	private String description = "加牛奶";

	public MilkCafe(Drink drink) {
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
