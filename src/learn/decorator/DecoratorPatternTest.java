package learn.decorator;

public class DecoratorPatternTest {
public static void main(String[] args) {
	Job simpleJob= new SimpleJob();
	simpleJob.schedule();
	simpleJob.unschduele();
	simpleJob.remove();
	
	Job job=new GlobalJob(simpleJob);
	job.schedule();
	job.unschduele();
	job.remove();
}
}
