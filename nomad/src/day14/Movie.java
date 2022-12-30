package day14;

public class Movie {
	private String name;
	private int rating;
	private boolean isGood;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setRating(int rating) {
		this.rating=rating;
	}
	public int getRating() {
		return rating;
	}
	public void setIsGood(boolean isGood) {
		this.isGood=isGood;
	}
	public boolean getIsGood() {
		return isGood;
	}
	public Movie(String name,int rating,boolean isGood) {
		this.name=name;
		this.rating=rating;
		this.isGood=isGood;
	}
	public String toString() {
		return "MOVIENAME= "+name+", RATING= "+rating+", GOOD or BAD= "+isGood;
	}
}
