package learn.flyweight;

public class Order {
private final int orderNumber;
private final Item item;
public Order(int orderNumber, Item item) {
	this.orderNumber = orderNumber;
	this.item = item;
}

public void processOrder() {
	System.out.println("ordering"+item+" for order number "+orderNumber );
}

}
