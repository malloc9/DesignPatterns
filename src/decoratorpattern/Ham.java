package decoratorpattern;

public class Ham implements Topping{

    @Override
    public String getDesc() {
        return ", Ham (18.12)";
    }

    @Override
    public double getPrice() {
        return 18.12;
    }

}