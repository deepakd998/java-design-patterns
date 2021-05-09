package learn.visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartOrder implements AtvPart {
	private List<AtvPart> parts = new ArrayList<>();

	public void addPart(AtvPart part) {
		parts.add(part);
	}

	public List<AtvPart> getPart() {
		return Collections.unmodifiableList(parts);
	}

	@Override
	public void accept(AtvPartsVisitor visitor) {
		for(AtvPart part:parts) {
			part.accept(visitor);
		}
		visitor.visit(this);

	}

}
