package decoratorpattern;

public class Spinach implements Topping{

    @Override
    public String getDesc() {
        return ", Spinach (7.92)";
    }


    @Override
    public double getPrice() {
        return 7.92;
    }

}
