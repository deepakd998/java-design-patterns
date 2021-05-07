package learn.factory.abstractfactory;

import java.util.HashMap;
import java.util.Map;

import learn.factory.SocialMediaHandler;

public class AbstractFactoryDesignTest {

	public static void main(String[] args) {
		
		SocialMediaHandler fbHandler = SocialMediaHandlerFactory.getHandler(new FacebookFactory());
		Map<String, Object> resp = fbHandler.post(new HashMap<>());
		System.out.println(fbHandler.get(String.valueOf(resp.get("id"))));
		System.out.println(fbHandler.delete(String.valueOf(resp.get("id"))));
		
		SocialMediaHandler twHandler = SocialMediaHandlerFactory.getHandler(new TwitterFactory());
		Map<String, Object> twResp = twHandler.post(new HashMap<>());
		System.out.println(twHandler.get(String.valueOf(twResp.get("id"))));
		System.out.println(twHandler.delete(String.valueOf(twResp.get("id"))));
		
		SocialMediaHandler insHandler = SocialMediaHandlerFactory.getHandler(new InstaFactory());
		Map<String, Object> insResp = insHandler.post(new HashMap<>());
		System.out.println(insHandler.get(String.valueOf(insResp.get("id"))));
		System.out.println(insHandler.delete(String.valueOf(insResp.get("id"))));
	}

}
