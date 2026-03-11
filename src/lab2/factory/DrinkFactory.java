package lab2.factory;

public class DrinkFactory {
    public static Drink createDrink(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Loai do uong khong duoc de trong");
        }

        switch (type.toLowerCase()) {
            case "coffee":
                return new Coffee();
            case "tea":
                return new MilkTea();
            case "smoothie":
                return new Smoothie();
            default:
                throw new IllegalArgumentException("Khong ho tro loai do uong: " + type);
        }
    }
}
