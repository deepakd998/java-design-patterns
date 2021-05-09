package learn.observer;

public class Client1 extends Observer {
	Client1(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Client1 recevied: " + subject.getNews());
	}

}
