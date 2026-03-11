package lab2;

import lab2.abstractfactory.ComboFactory;
import lab2.abstractfactory.Dessert;
import lab2.abstractfactory.HealthyComboFactory;
import lab2.abstractfactory.Topping;
import lab2.factory.Drink;
import lab2.factory.DrinkFactory;
import lab2.singleton.CafeManager;

public class Main {
    public static void main(String[] args) {
        demoSingleton();
        demoFactoryMethod();
        demoAbstractFactory();
    }

    private static void demoSingleton() {
        System.out.println("=== Singleton Pattern ===");

        CafeManager manager1 = CafeManager.getInstance();
        CafeManager manager2 = CafeManager.getInstance();

        manager1.setShopName("Moonlight Coffee");
        manager1.setOpen(true);

        System.out.println("Ten quan: " + manager2.getShopName());
        System.out.println("Dang mo cua: " + manager2.isOpen());
        System.out.println("Cung mot doi tuong: " + (manager1 == manager2));
        System.out.println();
    }

    private static void demoFactoryMethod() {
        System.out.println("=== Factory Method Pattern ===");

        Drink coffee = DrinkFactory.createDrink("coffee");
        Drink tea = DrinkFactory.createDrink("tea");
        Drink smoothie = DrinkFactory.createDrink("smoothie");

        System.out.println(coffee.getName() + " - gia: " + coffee.getPrice() + " VND");
        System.out.println(tea.getName() + " - gia: " + tea.getPrice() + " VND");
        System.out.println(smoothie.getName() + " - gia: " + smoothie.getPrice() + " VND");
        System.out.println();
    }

    private static void demoAbstractFactory() {
        System.out.println("=== Abstract Factory Pattern ===");

        ComboFactory comboFactory = new HealthyComboFactory();
        Drink drink = comboFactory.createDrink();
        Dessert dessert = comboFactory.createDessert();
        Topping topping = comboFactory.createTopping();

        System.out.println("Combo healthy gom:");
        System.out.println("- Do uong: " + drink.getName());
        System.out.println("- Mon an kem: " + dessert.getName());
        System.out.println("- Topping: " + topping.getName());
    }
}
