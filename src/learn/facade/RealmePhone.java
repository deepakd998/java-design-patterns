package learn.facade;

public class RealmePhone implements Phone {

	@Override
	public void build() {
		System.out.println("Built using Andriod");
	}

}
