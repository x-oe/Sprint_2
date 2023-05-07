import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;
import static java.lang.String.format;

public class Main {
    public static void main(String[] args) {
        //Food meat = new Meat(5,100.0);
       // Food apple1 = new Apple(10, 50.0, "red");
       // Food apple2 = new Apple(8, 60.0, "green");
        Food[] foods = {
                new Meat(5,100.0),
                new Apple(10, 50.0, Colour.RED),
                new Apple(8, 60.0, Colour.GREEN)};
        ShoppingCart carts = new ShoppingCart(foods);

        System.out.printf("Общая сумма товаров без скидки: %.2f.\n", carts.getSumWithoutDiscont());
        System.out.printf("Общая сумма товаров cо скидкой:  %.2f.\n", carts.getSumWithDiscont());
        System.out.printf("Сумма всех вегетарианских продуктов без скидки: %.2f.",carts.getSumVegan());
    }
}
