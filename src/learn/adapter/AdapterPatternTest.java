package learn.adapter;

public class AdapterPatternTest {

	public static void main(String[] args) {
		MessagePublisher messagePublisher=new MessagePublisher(new LegacyMessageSender());
		System.out.println(messagePublisher.sendMessage("SMS 12345"));
		
		MessagePublisher messagePublisher2=new MessagePublisher(new AWSAdapter(new AWSMessageSender()));
		System.out.println(messagePublisher2.sendMessage("SMS 12345"));
		
		MessagePublisher messagePublisher1=new MessagePublisher(new GCPAdapter(new GCPMessageSender()));
		System.out.println(messagePublisher1.sendMessage("SMS 67891"));

	}
}
