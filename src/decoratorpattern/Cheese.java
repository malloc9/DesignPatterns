package decoratorpattern;

public class Cheese implements Topping{

    @Override
    public String getDesc() {
        return ", Cheese (20.72)";
    }

    @Override
    public double getPrice() {
        return 20.72;
    }

}