package lab2.abstractfactory;

import lab2.factory.Drink;

public interface ComboFactory {
    Drink createDrink();

    Dessert createDessert();

    Topping createTopping();
}
