package learn.visitor;

public class Wheel implements AtvPart {
public static final double price=100;
	@Override
	public void accept(AtvPartsVisitor visitor) {
		visitor.visit(this);
		
	}

}
