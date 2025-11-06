package exam1105.exam02;

public class OrderExample {
    public static void main(String[] args) {
        Menu m1 = new Menu("피자", 31900);
        Menu m2 = new Menu("치킨", 21900);
        Menu m3 = new Menu("돈까스", 16900);

        OrderItem o1 = new OrderItem(m1, 32);

        System.out.println(o1.getPrice());
    }
}
