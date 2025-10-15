package exam1015.pizza;

public abstract class Pizza {
    public String name;
    public String size;
    public int[] price;
    public String toppings;
    public int selectedPrice;

    public Pizza() {}

    protected void setPriceBySize(String size) {
        if (size.equalsIgnoreCase("S")) {
            selectedPrice = price[0];
        } else if (size.equalsIgnoreCase("M")) {
            selectedPrice = price[1];
        } else if (size.equalsIgnoreCase("L")) {
            selectedPrice = price[2];
        } else {
            selectedPrice = price[1]; // 기본 M
        }
    }

    public void cook() {

        System.out.println(name + " " + size + "을 오븐에 굽습니다.");
        System.out.println(name + " " + size + "이 완성되었습니다.");
    }

    public void serve() {
        System.out.println(name + " " + size + "이 서빙되었습니다. 가격은 " + selectedPrice + "원입니다.");
    }
}