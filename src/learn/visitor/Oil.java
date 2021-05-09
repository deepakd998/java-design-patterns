package learn.visitor;

public class Oil implements AtvPart {
	public static final double price=87;
	@Override
	public void accept(AtvPartsVisitor visitor) {
		visitor.visit(this);
		
	}

}
