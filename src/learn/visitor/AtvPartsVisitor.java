package learn.visitor;

public interface AtvPartsVisitor {

	void visit(Oil oil);
	void visit(Wheel wheel);
	void visit(Fender fender);
	
	void visit(PartOrder partOrder);
}
	
