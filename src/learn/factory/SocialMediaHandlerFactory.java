package learn.factory;

public class SocialMediaHandlerFactory {
	
	public SocialMediaHandler getHandler(SocialMedia type) {
		SocialMediaHandler socialMediaHandler;
		switch (type) {
		case FB:
			socialMediaHandler = new FacebookHandler();
			break;
		case TW:
			socialMediaHandler = new TwitterHandler();
			break;
		case INS:
			socialMediaHandler = new InstagramHandler();
			break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
		return socialMediaHandler;
	}

}
