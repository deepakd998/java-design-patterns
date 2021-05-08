package learn.coresponsibility;

public class VP extends Handler{

	@Override
	public void handleRequest(Request request) {
		if(request.getRequestType() == RequestType.PURCHASE && request.getAmount()<=1500) {
			System.out.println("Approved by VP");
		}else {
			successor.handleRequest(request);
		}
		
	}

}
