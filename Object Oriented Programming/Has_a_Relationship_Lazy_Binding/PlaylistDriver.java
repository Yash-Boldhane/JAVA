package Has_a_Relationship_Lazy_Binding;

public class PlaylistDriver {
	public static void main(String[] args) {
	
		Playlist p1=new Playlist("Mashup", "Daler Mahendi", 29.00, "01/06/2024");
		p1.displayPlaylist();
		
		System.out.println("-----------------------------------------------------------");
		
		p1.insertSongs("Bolo tarara", "Daler Mahendi", 05.00, 1995);
		p1.s.displaySongs();
		
	}
	
}
