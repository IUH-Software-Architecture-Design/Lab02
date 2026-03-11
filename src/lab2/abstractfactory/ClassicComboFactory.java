package lab2.abstractfactory;

import lab2.factory.Drink;
import lab2.factory.MilkTea;

public class ClassicComboFactory implements ComboFactory {
    @Override
    public Drink createDrink() {
        return new MilkTea();
    }

    @Override
    public Dessert createDessert() {
        return new Croissant();
    }

    @Override
    public Topping createTopping() {
        return new PearlTopping();
    }
}
