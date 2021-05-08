package learn.coresponsibility;

public class Director extends Handler {
	public  void handleRequest(Request request) {
		if(request.getRequestType() == RequestType.CONFERENCE) {
			System.out.println("Approved by Director");
		}else {
			successor.handleRequest(request);
		}
	}

}
