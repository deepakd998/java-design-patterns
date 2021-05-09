package learn.visitor;

public class Fender implements AtvPart {
	public static final double price=189;
	@Override
	public void accept(AtvPartsVisitor visitor) {
		visitor.visit(this);
		
	}

}
