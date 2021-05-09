package learn.observer;

public class Client3 extends Observer {
	Client3(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}

	public void publish(String message) {
		this.subject.publish(message);
	}

	@Override
	public void update() {
		System.out.println("Client3 recevied: " + subject.getNews());
	}

}
