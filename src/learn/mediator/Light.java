package learn.mediator;

public class Light {
	private boolean isOn;

	private String location;

	Light(String location) {
		this.location = location;
	}

	public boolean isOn() {
		return isOn;
	}

	public void toggle() {
		if (isOn) {
			off();
		} else {
			on();
		}
	}

	public void on() {
		isOn = true;
		System.out.println(location+" Light switched on");
	}

	public void off() {
		isOn = false;
		System.out.println(location+ " Light switched off");
	}

}
