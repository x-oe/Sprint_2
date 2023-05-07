package model;
import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {
    public  String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        double d = 0;
        if (colour.equals(Colour.RED)) {
        d = Discount.DISCOUNT_TOTAl;
        }else {
            d = Discount.DISCOUNT;
        }
        return d;
    }
}

