package exam1015.pizza;

public class Banban extends Pizza {
	String topping2;
    public Banban() {
        this.name = "BanbanPizza";
        this.toppings = "Pepperoni, pineapple";
        this.size = "M";
    }

    public Banban(String size) {
        this.size = size;
        this.toppings = "Pepperoni";
        this.topping2 = "pineapple";
        this.name = "BanbanPizza";
        this.price = new int[]{15900, 25900, 35900};
        setPriceBySize(size);
    }
    
    public Banban(String size, String topping1, String topping2) {
    	this.size = size;
        this.toppings = topping1;
        this.topping2 = topping2;
        this.name = "BanbanPizza";
        this.price = new int[]{15900, 25900, 35900};
        setPriceBySize(size);
    }

    @Override
    public void cook() {
        System.out.println(name + " " + size + "에 " + toppings +", " + topping2 + "를 올립니다.");
        super.cook();
    }
}
