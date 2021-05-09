package learn.strategy;

public class AmexStrategy implements ValidationStrategy {

	@Override
	public boolean isValid(CreditCard cc) {
		boolean isValid=false;
		isValid=(cc.getCcNumber().startsWith("37")||cc.getCcNumber().startsWith("34"))&& cc.getCcNumber().length()==15;
		if(isValid) {
			isValid=ValidationStrategy.checkLuhn(cc.getCcNumber());
		}
		return isValid;
	}

}
