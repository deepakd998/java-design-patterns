package learn.factory;

import java.util.Map;

public interface SocialMediaHandler {
	Map<String, Object> post(Map<String, Object> content);

	Map<String, Object> get(String id);

	Map<String, Object> delete(String id);
}
