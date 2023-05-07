package service;
import model.Food;

public class ShoppingCart {
     Food[] foods;
    public ShoppingCart(Food[] foods) {
        this.foods = new Food[foods.length];
        for (int i = 0; i < foods.length; i++) {
            this.foods[i] = foods[i];
        }
    }
    public double getSumWithoutDiscont() {
    double sum = 0;
        for (Food food : foods) {
            sum = sum + food.getPrice() * (double)food.getAmount();
            //System.out.println(sum);
        }
      return sum;

    }
public  double getSumWithDiscont(){
    double sum = 0;

    for (Food food : foods) {


        sum = sum + (food.getPrice() * (double) food.getAmount()) * ((100.00 - food.getDiscount()) / 100.00);

    }
    return sum;
}
public double getSumVegan(){
        double sum = 0.0;
    for (Food food : foods) {
        if (food.isVegetarian()) {
            sum += food.getPrice() * (double) food.getAmount();
        }
    }
    return sum;
}
}
