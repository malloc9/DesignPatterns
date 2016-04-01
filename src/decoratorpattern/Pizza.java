package decoratorpattern;

public abstract class Pizza {
    protected String desc;
    protected double price;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Pizza addTopping(Topping topping){
        setDesc(this.getDesc() + topping.getDesc());
        setPrice(this.getPrice() + topping.getPrice());
        return this;
    };
}
