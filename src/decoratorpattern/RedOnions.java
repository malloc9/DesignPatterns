package decoratorpattern;

public class RedOnions implements Topping{

    @Override
    public String getDesc() {
        return ", Red Onions (3.75)";
    }

    @Override
    public double getPrice() {
        return 3.75;
    }

}
