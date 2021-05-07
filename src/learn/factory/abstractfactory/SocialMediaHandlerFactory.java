package learn.factory.abstractfactory;

import learn.factory.SocialMediaHandler;

public class SocialMediaHandlerFactory {
	public static SocialMediaHandler getHandler(AbstractSocialMediaHandlerFactory asmf) {
		return asmf.getHandler();
	}
}
