package learn.adapter;

public class MessagePublisher {

	private final IMessagePublisher iMessagePublisher;

	public MessagePublisher(IMessagePublisher iMessagePublisher) {
		this.iMessagePublisher = iMessagePublisher;
	}

	public String sendMessage(String subject) {
		return iMessagePublisher.sendMessage(subject);
	}

}
