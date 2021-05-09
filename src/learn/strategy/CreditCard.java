package learn.strategy;

public class CreditCard {
private String ccNumber;
private String date;
private String cvv;
private ValidationStrategy validationStrategy;
public CreditCard(ValidationStrategy validationStrategy) {
	this.validationStrategy=validationStrategy;
}
public boolean isValid() {
	return validationStrategy.isValid(this);
}
public String getCcNumber() {
	return ccNumber;
}
public void setCcNumber(String ccNumber) {
	this.ccNumber = ccNumber;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getCvv() {
	return cvv;
}
public void setCvv(String cvv) {
	this.cvv = cvv;
}

}
