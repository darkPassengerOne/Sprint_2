import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

/**
 * В методе main реализуй следующую логику:
 * Инициализируй данные.
 * Для этого создай объекты:
 * - Мясо в количестве 5 кг по цене 100 рублей за кг;
 * - Яблоки красные в количестве 10 кг по цене 50 рублей;
 * - Яблоки зелёные в количестве 8 кг по цене 60 рублей.
 */
public class Main {
    public static void main (String[] args) {
        var meat = new Meat(5,100);
        var red = new Apple (50,10, Colour.RED);
        var green = new Apple (60,8,Colour.GREEN);
        Food[] items = {meat,red,green};
        var cart = new ShoppingCart(items);
        System.out.println("Общая сумма товаров без скидки: " + cart.totalPrice());
        System.out.println("Общая сумма товаров cо скидки: " + cart.discountPrice());
        System.out.println("Общая сумма вегетарианских товаров без скидки: " + cart.vegPrice());

    }


}
