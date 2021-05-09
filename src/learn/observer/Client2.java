package learn.observer;

public class Client2 extends Observer {
	Client2(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}

	public void publish(String message) {
		this.subject.publish(message);
	}

	@Override
	public void update() {
		System.out.println("Client2 recevied: " + subject.getNews());
	}

}
