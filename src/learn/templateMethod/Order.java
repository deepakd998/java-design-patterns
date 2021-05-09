package learn.templateMethod;

public abstract class Order {
protected boolean isGift;
public abstract void doCheckout();
public abstract void doPayment();
public abstract void doSendReceipt();
public final void wrapOrder() {
	System.out.println("order wrapped");
}
public final void processOrder() {
	doCheckout();
	doPayment();
	if(isGift) {
		wrapOrder();
	}else {
		doSendReceipt();
	}
}
}
