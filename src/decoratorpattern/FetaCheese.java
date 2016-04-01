package decoratorpattern;

public class FetaCheese implements Topping{

    @Override
    public String getDesc() {
        return ", Feta Cheese (25.88)";
    }

    @Override
    public double getPrice() {
        return 25.88;
    }

}