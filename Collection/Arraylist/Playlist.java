// Small module of searching and sorting and printing.
package Collection.Arraylist;

public class Playlist {
	private	String song;
	private String singer;
	private	String movie;
	private String language;
	private double duration;
	private	String releaseDate;
	
	
	
	public Playlist() {
		// TODO Auto-generated constructor stub
	}

	
	public Playlist(String song, String singer, String movie, String language, double duration, String releaseDate) {
		super();
		this.song = song;
		this.singer = singer;
		this.movie = movie;
		this.language = language;
		this.duration = duration;
		this.releaseDate = releaseDate;
	}


	public String toString() {
		return "Playlist [song=" + song + ", singer=" + singer + ", movie=" + movie + ", language=" + language
				+ ", duration=" + duration + ", releaseDate=" + releaseDate + "]";
	}


	public String getSong()
	{
		return song;
	}
	

	public String getSinger()
	{
		return singer;
	}

	public String getMovie()
	{
		return movie;
	}

	public String getlanguage()
	{
		return language;
	}

	public double getDuration()
	{
		return duration;
	}

	public String getRelease()
	{
		return releaseDate;
	}
}
