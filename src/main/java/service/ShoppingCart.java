package service;

import model.Food;

/**
 * Пакет service.
 * В нём создай класс для корзины — ShoppingCart.
 * Добавь в него поле — массив элементов из объектов типа Food.
 * Понадобится конструктор с одним параметром — массивом элементов Food.
 * С его помощью ты создашь объект корзины.
 * В классе ShoppingCart реализуй методы для работы с корзиной:
 * получить общую сумму товаров в корзине без скидки,
 * получить общую сумму товаров в корзине со скидкой,
 * получить общую сумму всех вегетарианских продуктов в корзине без скидки.
 */
public class ShoppingCart {
    private final Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }
    public double totalPrice() { // Получение общей суммы товаров в корзине без скидки
        double price = 0;
        for (Food item : items) {
            price += item.getPrice() * item.getAmount();
        }
        return price;
    }

    public double discountPrice() { // Получение общей суммы товаров в корзине без скидки
        double price = 0;
        for (Food item : items) {
            double discount = (100 - item.getDiscount()) / 100.0;
            price += item.getPrice() * item.getAmount() * discount;
        }
        return price;
    }

    public double vegPrice() { // Получение общей суммы всех вегетарианских товаров в корзине без скидки.
        double price = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                price += item.getPrice() * item.getAmount();
            }
        }
        return price;
    }
}
