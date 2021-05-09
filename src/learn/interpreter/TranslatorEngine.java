package learn.interpreter;

public class TranslatorEngine {
public void translate(String content,LanguageType lang) {
	Translator translator;
	try {
		translator=LanguageFactory.getInstance(lang);
		translator.translate(content);
	} catch (IllegalAccessException e) {
		e.printStackTrace();
	}
}
}
