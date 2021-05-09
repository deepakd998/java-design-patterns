package learn.visitor;

public class ShippingVisitor implements AtvPartsVisitor {
	private double shippingCost=0;
	private double totalCost=0;
	@Override
	public void visit(Oil oil) {
		
		totalCost+=Oil.price;
		
		shippingCost+=2;
		System.out.println("Oil shipping costs: $"+2);
	}

	@Override
	public void visit(Wheel wheel) {
		totalCost+=Wheel.price;
		shippingCost+=5;
		System.out.println("Wheel Shipping costs: $"+5);
	}

	@Override
	public void visit(Fender fender) {
		totalCost+=Fender.price;
		shippingCost+=7;
		System.out.println("Fender Shipping costs: $"+7);
	}

	@Override
	public void visit(PartOrder partOrder) {
		
		if(totalCost>500) {
			shippingCost=0;
			System.out.println("Total Order moree than $500 free shipping");
		}else if(partOrder.getPart().size()>3) {
				shippingCost-=5;
				System.out.println("More than 3 parts earns $5 discount on shipping");
		}
	System.out.println("Total shipping Cost: $"+shippingCost);
	}

}
