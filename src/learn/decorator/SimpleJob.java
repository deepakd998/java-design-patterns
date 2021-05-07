package learn.decorator;

public class SimpleJob implements Job {

	@Override
	public void schedule() {
		System.out.println("Simple job Scheduled");
	}

	@Override
	public void unschduele() {
		System.out.println("Simple job UnScheduled");
	}

	@Override
	public void remove() {
		System.out.println("job removed");
	}

}
