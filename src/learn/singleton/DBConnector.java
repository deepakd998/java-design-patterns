package learn.singleton;

public class DBConnector {
	private static volatile DBConnector instance = null;

	private DBConnector() {
		if (instance != null) {
			new RuntimeException("Use getInstance method to create a object");
		}
	}

	public static DBConnector getInstance() {
		if (instance == null) {
			synchronized (DBConnector.class) {
				if (instance == null)
					instance = new DBConnector();
			}

		}
		return instance;
	}
}
