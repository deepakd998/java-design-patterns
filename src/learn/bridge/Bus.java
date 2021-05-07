package learn.bridge;

public class Bus implements Vehicle {

	@Override
	public String start() {

		return "Bus Started";
	}

	@Override
	public String drive() {

		return "Driving Bus";
	}

	@Override
	public String stop() {

		return "Bus engine stopped";
	}

}
