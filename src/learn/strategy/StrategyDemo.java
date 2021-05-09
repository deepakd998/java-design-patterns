package learn.strategy;

public class StrategyDemo {

	public static void main(String[] args) {
		CreditCard cc= new CreditCard(new AmexStrategy());
		cc.setCcNumber("370000000000002");
		cc.setDate("03/2030");
		cc.setCvv("737");
		System.out.println("Amex card valid: "+cc.isValid());
		
		CreditCard ccVisa= new CreditCard(new VisaStrategy());
		ccVisa.setCcNumber("5100060000000002");
		ccVisa.setDate("03/2030");
		ccVisa.setCvv("737");
		System.out.println("Visa card valid: "+ccVisa.isValid());
	}

}
