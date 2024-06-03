package Has_a_Relationship_Lazy_Binding;

public class Playlist {
	String name;
	String artist;
	double duration;
	String date;
	
	Songs s;
	
	public Playlist() {
		// TODO Auto-generated constructor stub
	}
	
	Playlist(String name, String artist, double duration, String date)
	{
		this.name=name;
		this.artist=artist;
		this.duration=duration;
		this.date=date;
	}
	
	public void insertSongs(String name, String Singer, double duration, int year)
	{
		s=new Songs(name, Singer, duration, year);
		System.out.println("Songs added to playlist");
	}
	
	public void displayPlaylist()
	{
		System.out.println(name);
		System.out.println(artist);
		System.out.println(duration);
		System.out.println(date);
	}
}
