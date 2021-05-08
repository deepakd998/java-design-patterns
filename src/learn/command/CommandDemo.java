package learn.command;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {

	public static void main(String[] args) {
		Switch switc = new Switch();
		
		Light light= new Light();
		
		Command com= new ToggleCommand(light);
		switc.executeCommand(com);
		switc.executeCommand(com);
		
		Light hallLight= new Light();
		Light kithenLight= new Light();
		List<Light> lights= new ArrayList<>();
		lights.add(light);
		lights.add(kithenLight);
		lights.add(hallLight);
		Command comAll= new AllLightOnCommand(lights);
		switc.executeCommand(comAll);
	
		
	}

}
