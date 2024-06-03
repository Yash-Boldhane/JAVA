package Has_a_Relationship_Lazy_Binding;

public class Songs {
		String name;
		String Singer;
		double duration;
		int year;
		
		public Songs() {
			// TODO Auto-generated constructor stub
		}
		
		Songs(String name, String Singer, double duration, int year)
		{
			this.name=name;
			this.Singer=Singer;
			this.duration=duration;
			this.year=year;
			
		}
		
		public void displaySongs()
		{
			System.out.println(name);
			System.out.println(Singer);
			System.out.println(duration);
			System.out.println(year);
		}
}
