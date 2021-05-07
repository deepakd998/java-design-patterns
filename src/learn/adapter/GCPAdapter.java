package learn.adapter;

public class GCPAdapter implements IMessagePublisher {
	private GCPMessageSender gcpMessageSender;
	
	public GCPAdapter(GCPMessageSender gcpMessageSender) {
		this.gcpMessageSender = gcpMessageSender;
	}

	@Override
	public String sendMessage(String subject) {
		
		return gcpMessageSender.publish(subject);
	}

}
