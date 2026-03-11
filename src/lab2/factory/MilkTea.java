package lab2.factory;

public class MilkTea implements Drink {
    @Override
    public String getName() {
        return "Tra sua tran chau";
    }

    @Override
    public double getPrice() {
        return 45000;
    }
}
