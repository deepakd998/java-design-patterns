package learn.facade;

public class FacadeTest {

	public static void main(String[] args) {
	PhoneFacade phoneFacade= new PhoneImpl();
	phoneFacade.buildIphone();
	phoneFacade.buildRealmePhone();
	}

}
