package learn.state;

public class FanOffState implements State {
private Fan fan;

	public FanOffState(Fan fan) {
	this.fan = fan;
}

	@Override
	public void handleRequest() {
		System.out.println("Turning on to Low state");
		fan.setState(fan.getFanOnLowState());
	}

	@Override
	public String toString() {
		return "Fan is Off";
	}
	

}
