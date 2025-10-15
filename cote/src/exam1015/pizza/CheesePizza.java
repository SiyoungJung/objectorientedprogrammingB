package exam1015.pizza;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        this.name = "CheesePizza";
        this.size ="M";
    }

    public CheesePizza(String size) {
        this.size = size;
        this.name = "CheesePizza";
        this.price = new int[]{12900, 21900, 31900};
        setPriceBySize(size);
    }
}