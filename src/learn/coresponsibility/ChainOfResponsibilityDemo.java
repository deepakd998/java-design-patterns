package learn.coresponsibility;

public class ChainOfResponsibilityDemo {

	public static void main(String[] args) {
		Director dir= new Director();
		
		VP vp= new VP();
		
		CEO ceo=new CEO();
		
		dir.setSuccessor(vp);
		vp.setSuccessor(ceo);
		
		dir.handleRequest(new Request(RequestType.CONFERENCE,400 ));
		dir.handleRequest(new Request(RequestType.PURCHASE,1000));
		dir.handleRequest(new Request(RequestType.PURCHASE,2400));

	}

}
