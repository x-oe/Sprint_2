package model;

import model.constants.Discount;

public abstract class Food implements Discountable{

    protected int amount; // кол-во
    protected double price; // цена за единицу
    protected boolean isVegetarian;

    protected Food(int amount, double price, boolean isVegetarian){
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
        //if (isVegetarian) {
         //   this.isVegetarian = true;
        //} else this.isVegetarian = false;
    }
    public int getAmount(){
        return amount;
    }
    public double getPrice(){
        return price;
    }
    public boolean isVegetarian(){
        return isVegetarian;
    }

    @Override
    public double getDiscount(){
        return Discount.DISCOUNT;
    }
}