package learn.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		DBConnector connector= DBConnector.getInstance();
		DBConnector connector1= DBConnector.getInstance();
		System.out.println(connector + " "+connector1);

	}

}
