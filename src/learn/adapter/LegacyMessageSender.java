package learn.adapter;

public class LegacyMessageSender implements IMessagePublisher {

	@Override
	public String sendMessage(String subject) {
		
		return "sent using Leagecy Sender "+subject;
	}

}
