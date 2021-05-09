package learn.state;

public class FanOnMediumState implements State {
private Fan fan;

	public FanOnMediumState(Fan fan) {
	this.fan = fan;
}

	@Override
	public void handleRequest() {
		System.out.println("Turning on to High state");
		fan.setState(fan.getFanOnHighState());
	}

	@Override
	public String toString() {
		return "Fan is Medium";
	}
	

}
