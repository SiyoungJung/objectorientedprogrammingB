package exam1015;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        this.name = "PepperoniPizza";
        this.toppings = "Pepperoni";
        this.size = "M";
    }

    public PepperoniPizza(String size) {
        this.size = size;
        this.toppings = "Pepperoni";
        this.name = "PepperoniPizza";
        this.price = new int[]{15900, 25900, 35900};
        setPriceBySize(size);
    }

    @Override
    public void cook() {
        System.out.println(name + " " + size + "에 " + toppings + "를 올립니다.");
        super.cook();
    }
}
