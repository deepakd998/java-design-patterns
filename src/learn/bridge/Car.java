package learn.bridge;

public class Car implements Vehicle {

	@Override
	public String start() {

		return "Car Started";
	}

	@Override
	public String drive() {

		return "Driving car";
	}

	@Override
	public String stop() {

		return "Car engine stopped";
	}

}
