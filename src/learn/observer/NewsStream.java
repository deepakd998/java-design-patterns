package learn.observer;

public class NewsStream extends Subject {

	private String history ="";

	@Override
	public void publish(String news) {
		history=news;
		this.notifyObservers();
	}

	@Override
	public String getNews() {
		
		return history;
	}

}
