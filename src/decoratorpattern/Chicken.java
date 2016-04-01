package decoratorpattern;

public class Chicken implements Topping{

    @Override
    public String getDesc() {
        return ", Chicken (12.75)";
    }

    @Override
    public double getPrice() {
        return 12.75;
    }

}