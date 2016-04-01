package decoratorpattern;

public class Broccoli implements Topping {

	@Override
	public String getDesc() {
		return ", Broccoli (9.25)";
	}

	@Override
	public double getPrice() {
		return 9.25;
	}

}