package model;

import model.constants.Discount;

/**
 * - Класс Food — абстрактный класс с полями:
 * - amount — количество продукта в килограммах (целое число);
 * - price — цена за единицу (вещественное число);
 * - isVegetarian — флаг, который показывает, вегетарианский ли продукт.
 * Поля должны быть доступны только из классов-потомков.
 */

public abstract class Food implements Discountable {
    protected int amount ; // количество продукта в килограммах (целое число);
    protected double price; // цена за единицу (вещественное число);
    protected boolean isVegetarian; // флаг, который показывает, вегетарианский ли продукт.

    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public double getPrice() {
        return price;
    }

    public double getAmount() {
        return amount;

    }

    public int getDiscount() {
        return Discount.DEFFAULT;

    }

    public boolean isVegetarian(){
        return isVegetarian;
    };
}

