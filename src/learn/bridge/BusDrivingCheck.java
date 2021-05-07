package learn.bridge;

public class BusDrivingCheck implements RTO {

	private final Vehicle vehicle;

	BusDrivingCheck(Vehicle vehicle) {

		this.vehicle = vehicle;
	}

	@Override
	public String checkDrivingSkills() {
		System.out.println(vehicle.start() + " " + vehicle.drive() + " " + vehicle.stop());
		return "Passed";
	}

	@Override
	public String getVehicleNumber() {
		return "VT A 12555";
	}

}
