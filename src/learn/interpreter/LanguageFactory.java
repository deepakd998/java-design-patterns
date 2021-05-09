package learn.interpreter;

public class LanguageFactory {

	public static Translator getInstance(LanguageType lang) throws IllegalAccessException {
		Translator translator;
		switch (lang) {
		case HINDI:
			translator = new HindiLanguageTranslator();
			break;
		case ODIA:
			translator = new OdiaLanguageTranslator();
			break;

		default:
			throw new IllegalAccessException("Language not supported");
		}
		return translator;
	}
}
