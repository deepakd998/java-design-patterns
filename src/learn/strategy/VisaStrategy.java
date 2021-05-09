package learn.strategy;

public class VisaStrategy implements ValidationStrategy {

	@Override
	public boolean isValid(CreditCard cc) {
		boolean isValid=false;
		isValid=cc.getCcNumber().length()==16;
		if(isValid) {
			isValid=ValidationStrategy.checkLuhn(cc.getCcNumber());
		}
		return isValid;
	}

}
