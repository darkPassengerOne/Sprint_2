package model;

/**
 * - Класс Apple — для яблок.
 * У него есть ещё строковое поле colour — цвет яблок.
 * Конструктор принимает три параметра: количество, цену и цвет яблок — и устанавливает флаг isVegetarian.
 * Для красных яблок (colour равно "red") скидка должна быть равна 60%: соответствующий метод возвращает значение 60.
 */

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {
    private String colour ;
    public Apple(double price, int amount, String colour)  {
        super(amount, price, true);
        this.colour = colour;
    }

    // Для красных яблок (colour равно "red") скидка должна быть равна 60%: соответствующий метод возвращает значение 60.
    @Override
    public int getDiscount() {
        if (Colour.RED.equals(colour)) {
            return Discount.RED;
        } else {
            return Discount.DEFFAULT;
        }
    }
}
