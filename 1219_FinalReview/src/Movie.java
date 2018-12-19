
public class Movie {
	
	String title;
	int yearReleased;
	
	Movie(String title, int year) {
		this.title=title;
		this.yearReleased=year;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYearReleased() {
		return yearReleased;
	}
	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}
	
	public String toString() {
		return title;
	}
	
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof Movie)) {
			return false;
		}
		
		Movie m = (Movie) o;
		if (m.getTitle().equals(this.title)) {
			return true;
		} else {
			return false;
		}
	}

}
