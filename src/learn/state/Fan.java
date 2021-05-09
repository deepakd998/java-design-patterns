package learn.state;

public class Fan {
private State fanOffState;
private State fanOnLowState;
private State fanOnMedState;
private State fanOnHighState;

private State state;
public Fan() {
	fanOffState= new FanOffState(this);
	fanOnLowState= new FanOnLowState(this);
	fanOnMedState= new FanOnMediumState(this);
	fanOnHighState= new FanOnHighState(this);
	state=new FanOffState(this);
}
public void pullChain() {
	state.handleRequest();
}
public String toString() {
	return state.toString();
}
public State getFanOffState() {
	return fanOffState;
}
public State getFanOnLowState() {
	return fanOnLowState;
}
public State getFanOnMedState() {
	return fanOnMedState;
}
public State getFanOnHighState() {
	return fanOnHighState;
}
public void setState(State state) {
	this.state= state;
}

}
