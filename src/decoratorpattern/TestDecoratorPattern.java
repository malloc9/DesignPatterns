package decoratorpattern;

import java.text.DecimalFormat;

public class TestDecoratorPattern {
	
	public static void main(String[] args) {
		
		DecimalFormat dformat = new DecimalFormat("#.##");
		Pizza pizza = new SimplyVegPizza();
		
		pizza
                .addTopping(new RomaTomatoes())
                .addTopping(new GreenOlives())
                .addTopping(new Spinach());
		
		System.out.println("Desc: "+pizza.getDesc());
		System.out.println("Price: "+dformat.format(pizza.getPrice()));

        pizza = new SimplyNonVegPizza();

        pizza
                .addTopping(new Meat())
                .addTopping(new Cheese())
                .addTopping(new Cheese())
                .addTopping(new Ham());

        System.out.println("Desc: "+pizza.getDesc());
        System.out.println("Price: "+dformat.format(pizza.getPrice()));
	}

}
