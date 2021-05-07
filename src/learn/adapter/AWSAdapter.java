package learn.adapter;

public class AWSAdapter implements IMessagePublisher {
 
	private AWSMessageSender aws;
	
	public AWSAdapter(AWSMessageSender aws) {
		this.aws = aws;
	}

	@Override
	public String sendMessage(String subject) {
		return aws.publish(subject);
	}

}
