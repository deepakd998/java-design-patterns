package learn.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
private String name;
private List<Component> components = new ArrayList<>();
public Composite(String name) {
	this.name = name;
}
public void addComponent(Component component) {
	components.add(component);
}

@Override
public String printPrice() {
	StringBuilder builder = new StringBuilder();
	builder.append(name);
	builder.append("\n");
	components.forEach(cmp->{
		builder.append(cmp.printPrice());
		builder.append("\n");
	});
	return builder.toString();
}

}
