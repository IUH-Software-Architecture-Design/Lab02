package lab2.factory;

public class Coffee implements Drink {
    @Override
    public String getName() {
        return "Ca phe sua";
    }

    @Override
    public double getPrice() {
        return 30000;
    }
}
