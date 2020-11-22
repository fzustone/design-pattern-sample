package com.chenly.designpattern.decorator;

/**
 * @author chenly
 * @create 2020-11-22 20:48
 */
public class Client {
	public static void main(String[] args) {
		Drink drink = new Cafe();
		drink = new SugarCafe(drink);
		drink = new MilkCafe(drink);

		System.out.println(drink.getDescription() + ",价格" + drink.getPrice());
	}
}
