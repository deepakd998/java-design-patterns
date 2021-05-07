package learn.proxy;

public class DBExecutorProxy implements DBExecutor {
	private boolean isValidUser;

	public DBExecutorProxy(String user, String password) {
		if ("DD".equals(user) && "DKD".equals(password)) {
			isValidUser = true;
		}
	}

	@Override
	public String executeQuery(String query) {
		if (isValidUser) {
			return new DBExecutorServiceImpl().executeQuery(query);
		} else {
			return "Invalid User";
		}
	}

}
