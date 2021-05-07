package learn.flyweight;

public class FlyWeightTest {

	public static void main(String[] args) {
		InventorySystem ism= new InventorySystem();
		ism.takeOrder("Laptop", 908);
		ism.takeOrder("mobile", 88);
		ism.takeOrder("mouse", 80);
		ism.takeOrder("Laptop", 78);
		ism.takeOrder("mobile", 34);
		ism.takeOrder("mouse", 77);
		ism.takeOrder("Laptop", 33);
		ism.takeOrder("mouse", 232);
		
		ism.processOrder();
		ism.report();
	}

}
