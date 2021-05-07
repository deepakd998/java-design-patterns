package learn.facade;

public class PhoneImpl implements PhoneFacade {
private final ApplePhone iphone;
private final RealmePhone realme;

public PhoneImpl() {
	this.iphone = new ApplePhone();
	this.realme = new RealmePhone();
}
@Override
public void buildIphone() {
	 iphone.build();
}
@Override
public void buildRealmePhone() {
	 realme.build();
}
}
