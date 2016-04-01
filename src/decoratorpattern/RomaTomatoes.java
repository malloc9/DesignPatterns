package decoratorpattern;

public class RomaTomatoes implements Topping{

    @Override
    public String getDesc() {
        return ", Roma Tomatoes (5.20)";
    }

    @Override
    public double getPrice() {
        return 5.20;
    }

}
