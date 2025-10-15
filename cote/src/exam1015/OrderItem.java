package exam1015;

public class OrderItem{
	private Menu menu;
	private int quan;
	private int price;

	public OrderItem(Menu menu, int quan) {
		this.menu = menu;
		this.quan = quan;
	}
    public int getPrice() {
        return menu.price * quan;
    }
}
