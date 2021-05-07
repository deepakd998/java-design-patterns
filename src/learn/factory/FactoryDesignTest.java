package learn.factory;

import java.util.HashMap;
import java.util.Map;

public class FactoryDesignTest {

	public static void main(String[] args) {
		SocialMediaHandlerFactory socialMediaHandlerFactory = new SocialMediaHandlerFactory();
		SocialMediaHandler fbHandler = socialMediaHandlerFactory.getHandler(SocialMedia.FB);
		Map<String, Object> resp = fbHandler.post(new HashMap<>());
		System.out.println(fbHandler.get(String.valueOf(resp.get("id"))));
		System.out.println(fbHandler.delete(String.valueOf(resp.get("id"))));
		
		SocialMediaHandler twHandler = socialMediaHandlerFactory.getHandler(SocialMedia.TW);
		Map<String, Object> twResp = twHandler.post(new HashMap<>());
		System.out.println(twHandler.get(String.valueOf(twResp.get("id"))));
		System.out.println(twHandler.delete(String.valueOf(twResp.get("id"))));
		
		SocialMediaHandler insHandler = socialMediaHandlerFactory.getHandler(SocialMedia.INS);
		Map<String, Object> insResp = insHandler.post(new HashMap<>());
		System.out.println(insHandler.get(String.valueOf(insResp.get("id"))));
		System.out.println(insHandler.delete(String.valueOf(insResp.get("id"))));
	}

}
