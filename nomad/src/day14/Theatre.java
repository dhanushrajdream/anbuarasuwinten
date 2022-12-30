package day14;

public class Theatre {
	private String name;
	private int noOfSeats;
	private Movie movie;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats=noOfSeats;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setMovie(Movie movie) {
		this.movie=movie;
	}
	public Movie getMovie() {
		return movie;
	}
	public Theatre(String name,int noOfSeats,Movie movie) {
		this.name=name.toUpperCase();
		this.noOfSeats=noOfSeats;
		this.movie=movie;
	}
	public String toString() {
		return "MOVIENAME= "+name+", TOTAL SEATS= "+noOfSeats+", "+movie;
	}

}
