package learn.facade;

public class ApplePhone implements Phone {

	@Override
	public void build() {
		System.out.println("Built using Ios");
	}

}
