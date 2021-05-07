package learn.factory.abstractfactory;

import learn.factory.SocialMediaHandler;
import learn.factory.TwitterHandler;

public class TwitterFactory implements AbstractSocialMediaHandlerFactory {

	@Override
	public SocialMediaHandler getHandler() {
		
		return new TwitterHandler();
	}

}
