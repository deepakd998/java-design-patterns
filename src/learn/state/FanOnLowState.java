package learn.state;

public class FanOnLowState implements State {
private Fan fan;
	public FanOnLowState(Fan fan) {
		this.fan=fan;
	}

	@Override
	public void handleRequest() {
		System.out.println("Turning on to Medium state");
		fan.setState(fan.getFanOnMedState());
	}

	@Override
	public String toString() {
		return "Fan is Low";
	}

}
