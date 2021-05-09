package learn.templateMethod;

public class WebOrder extends Order {

	@Override
	public void doCheckout() {
		System.out.println("Checked out");

	}

	@Override
	public void doPayment() {
		System.out.println("Paid using UPI");

	}

	@Override
	public void doSendReceipt() {
		System.out.println("Receipt Sent");

	}

}
