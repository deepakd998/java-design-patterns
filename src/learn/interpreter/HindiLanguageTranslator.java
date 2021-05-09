package learn.interpreter;

public class HindiLanguageTranslator implements Translator{
 
	@Override
	public void translate(String content) {
		System.out.println(content+ " Changed in Hindi");	
	}

}
