package learn.observer;
public class ObserverDemo {

	public static void main(String[] args) {
	Subject pub=new NewsStream();
	Client1 client= new Client1(pub);
	Client2 client2= new Client2(pub);
	Client3 client3= new Client3(pub);
	pub.publish("New Vaccine approved by DCGI");
	pub.publish("2GT the covid drug  approved by DCGI");
	
	}

}
