package learn.factory.abstractfactory;

import learn.factory.InstagramHandler;
import learn.factory.SocialMediaHandler;

public class InstaFactory implements AbstractSocialMediaHandlerFactory {

	@Override
	public SocialMediaHandler getHandler() {
		
		return new InstagramHandler();
	}

}
