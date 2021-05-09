package learn.visitor;

public class VisitorDemo {

	public static void main(String[] args) {
		PartOrder order=new PartOrder();
		order.addPart(new Fender());
		order.addPart(new Oil());
		order.addPart(new Wheel());
		order.addPart(new Wheel());
		order.accept(new ShippingVisitor());
	}

}
