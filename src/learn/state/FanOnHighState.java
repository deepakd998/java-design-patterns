package learn.state;

public class FanOnHighState implements State {
private Fan fan;

	public FanOnHighState(Fan fan) {
	this.fan = fan;
}

	@Override
	public void handleRequest() {
		System.out.println("Turning Off");
		fan.setState(fan.getFanOffState());
	}

	@Override
	public String toString() {
		return "Fan is on High";
	}
	

}
