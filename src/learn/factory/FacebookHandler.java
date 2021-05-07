package learn.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class FacebookHandler implements SocialMediaHandler{

	@Override
	public Map<String, Object> post(Map<String, Object> content) {
		Map<String, Object> response = new HashMap<>();
		response.put("statuCode", 200);
		response.put("message", "fb post Created");
		response.put("id", UUID.randomUUID().toString());
		return response;
	}

	@Override
	public Map<String, Object> get(String id) {
		Map<String, Object> response = new HashMap<>();
		response.put("statuCode", 200);
		response.put("message", "facebook post");
		return response;
	}

	@Override
	public Map<String, Object> delete(String id) {
		Map<String, Object> response = new HashMap<>();
		response.put("statuCode", 200);
		response.put("message", "facebook post Deleted");
		return response;
	}

}
