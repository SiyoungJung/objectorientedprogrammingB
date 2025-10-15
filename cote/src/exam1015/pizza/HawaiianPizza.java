package exam1015.pizza;

public class HawaiianPizza  extends Pizza{
    public HawaiianPizza() {
        this.name = "HawaiianPizza";
        this.toppings = "Pineapple";
        this.size = "M";
    }

    public HawaiianPizza(String size) {
        this.size = size;
        this.toppings = "Pineapple";
        this.name = "HawaiianPizza";
        this.price = new int[]{15900, 25900, 35900};
        setPriceBySize(size);
    }

    @Override
    public void cook() {
        System.out.println(name + " " + size + "에 " + toppings + "를 올립니다.");
        super.cook();
    }
}
