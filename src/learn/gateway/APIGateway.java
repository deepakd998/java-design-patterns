package learn.gateway;

public class APIGateway {
	private ProductClient client= new ProductClientImpl();
	private PriceClient prClient= new PriceClientImpl(); 
	public String getProductDetails() {
		return client.getProductDetails()+" = "+prClient.getPrice();
	}

	public String getProductDetailsForMobile() {
		return prClient.getPrice();
	}
	
	public static void main(String[] args) {
		APIGateway gateway = new APIGateway();
		System.out.println(gateway.getProductDetails());
		System.out.println(gateway.getProductDetailsForMobile());
	}

}
