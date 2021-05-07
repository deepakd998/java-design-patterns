package learn.proxy;

public class ProxyTest {

	public static void main(String[] args) {
         DBExecutor dbExecutor= new DBExecutorProxy("usr", "pwd");
         System.out.println(dbExecutor.executeQuery("SELECT"));
         
         DBExecutor dbExecutor1= new DBExecutorProxy("DD", "DKD");
         System.out.println(dbExecutor1.executeQuery("SELECT"));
	}

}
