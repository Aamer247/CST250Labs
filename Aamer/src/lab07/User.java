package lab07;

public class User {

	String name;
	String location;
	
	
	public Tweet tweet(String text) {
		Tweet tweet = new Tweet();
		tweet.user = this;
		tweet.text = text;
		return tweet;
	}
}
