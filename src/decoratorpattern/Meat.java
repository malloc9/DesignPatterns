package decoratorpattern;

public class Meat implements Topping{

    @Override
    public String getDesc() {
        return ", Meat (14.25)";
    }

    @Override
    public double getPrice() {
        return 14.25;
    }

}