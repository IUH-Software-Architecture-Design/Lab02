package lab2.abstractfactory;

import lab2.factory.Drink;
import lab2.factory.Smoothie;

public class HealthyComboFactory implements ComboFactory {
    @Override
    public Drink createDrink() {
        return new Smoothie();
    }

    @Override
    public Dessert createDessert() {
        return new GranolaCake();
    }

    @Override
    public Topping createTopping() {
        return new ChiaSeedTopping();
    }
}
