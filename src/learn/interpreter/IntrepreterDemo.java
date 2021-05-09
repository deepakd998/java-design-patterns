package learn.interpreter;

public class IntrepreterDemo {
public static void main(String[] args) {
	TranslatorEngine translatorEngine = new TranslatorEngine();
	translatorEngine.translate("join", LanguageType.HINDI);
	translatorEngine.translate("join", LanguageType.ODIA);
}
}
