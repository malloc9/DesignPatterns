package decoratorpattern;

public class GreenOlives implements Topping{

    @Override
    public String getDesc() {
        return ", Green Olives (5.47)";
    }

    @Override
    public double getPrice() {
        return 5.47;
    }

}