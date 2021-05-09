package learn.templateMethod;

public class TemplateMethodDemo {
public static void main(String[] args) {
	Order order=new WebOrder();
	order.isGift=true;
	order.processOrder();
}
}
