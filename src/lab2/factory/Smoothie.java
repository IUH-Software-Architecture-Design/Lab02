package lab2.factory;

public class Smoothie implements Drink {
    @Override
    public String getName() {
        return "Sinh to xoai";
    }

    @Override
    public double getPrice() {
        return 50000;
    }
}
