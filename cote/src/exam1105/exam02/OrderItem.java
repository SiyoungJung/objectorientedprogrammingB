package exam1105.exam02;

public class OrderItem {
    public Menu menu;
    public int quantity;

    int getPrice() {
        return menu.price * quantity;
    }

    public OrderItem() {
    }

    public OrderItem(Menu menu, int quantity) {
        this.menu = menu;
        this.quantity = quantity;
    }
}
