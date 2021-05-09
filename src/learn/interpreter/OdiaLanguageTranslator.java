package learn.interpreter;

public class OdiaLanguageTranslator implements Translator {

	@Override
	public void translate(String content) {
		System.out.println(content+ " Changed in Odia");
	}

}
