package learn.flyweight;

import java.util.concurrent.CopyOnWriteArrayList;

import java.util.List;

public class InventorySystem {
private Catalog catalog= new Catalog();
private List<Order> orders= new CopyOnWriteArrayList<>();

void takeOrder(String itemName,int orderNumber) {
	Item item=catalog.lookup(itemName);
	orders.add(new Order(orderNumber, item)); 
}

void processOrder() {
	for(Order order:orders) {
		order.processOrder();
		orders.remove(order);
	}
}

void report() {
	System.out.println("Total item objects Made :"+ catalog.totalItemSize());
}
}
