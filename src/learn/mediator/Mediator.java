package learn.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
	private List<Light> lights;
	Mediator(){
		this.lights=new ArrayList<>();
	}
	
	public void registerLights(Light light) {
		lights.add(light);
	}
	
	public void allLightsOn() {
		for (Light light : lights) {
			if (!light.isOn()) {
				light.toggle();
			}
		}

	}
	
	public void allLightsOff() {
		for (Light light : lights) {
			if (light.isOn()) {
				light.toggle();
			}
		}

	}
}
