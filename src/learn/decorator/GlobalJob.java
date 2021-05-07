package learn.decorator;

public class GlobalJob implements Job {
private final Job job;

  GlobalJob(Job job) {
	super();
	this.job = job;
}

	@Override
	public void schedule() {
		job.schedule();
		System.out.println("last Successful Job Run"+ System.currentTimeMillis());
		
	}

	@Override
	public void unschduele() {
		job.unschduele();
		System.out.println("Job Unscheduled");
	}

	@Override
	public void remove() {
		job.remove();
		System.out.println("Gloabl Job removed");
	}
		

}
