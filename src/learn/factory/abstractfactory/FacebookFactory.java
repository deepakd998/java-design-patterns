package learn.factory.abstractfactory;

import learn.factory.FacebookHandler;
import learn.factory.SocialMediaHandler;

public class FacebookFactory implements AbstractSocialMediaHandlerFactory {

	@Override
	public SocialMediaHandler getHandler() {
		return new FacebookHandler();
	}
	
	
}
