package learn.composite;

public class CompositePatternTest {

	public static void main(String[] args) {
		Component monitor= new Leaf("MONITOR", 8000.0);
		Component mouse= new Leaf("MOUSE", 500.5);
		Component hdd= new Leaf("HDD", 6555.6);
		Component cpu= new Leaf("CPU", 8000.0);
		Component ram= new Leaf("RAM", 3000.0);
		
		Composite peri= new Composite("PERIPHERALS");
		peri.addComponent(mouse);
		peri.addComponent(monitor);
		
		Composite mb= new Composite("MB");
		mb.addComponent(ram);
		mb.addComponent(cpu);
		
		Composite cabinet= new Composite("CABINET");
		cabinet.addComponent(mb);
		cabinet.addComponent(hdd);
		
		Composite desktop= new Composite("DESKTOP");
		desktop.addComponent(cabinet);
		desktop.addComponent(peri);
		
		System.out.println(desktop.printPrice());
		
		
		
		
	}

}
