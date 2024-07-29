package Collection.Arraylist;

import java.util.ArrayList;

public class PlaylistDriver {
	public static void main(String[] args) {
		ArrayList<Object> a1=new ArrayList<>();
	
			a1.add(new Playlist("Naatu Naatu", "Rahul Sipligunj, Kaala Bhairava", "RRR", "Telugu", 4.30, "2022-03-25"));
	        a1.add(new Playlist("Kesariya", "Arijit Singh", "Brahmastra", "Hindi", 4.28, "2022-09-09"));
	        a1.add(new Playlist("Arabic Kuthu", "Anirudh Ravichander, Jonita Gandhi", "Beast", "Tamil", 4.41, "2022-04-14"));
	        a1.add(new Playlist("Raataan Lambiyan", "Jubin Nautiyal, Asees Kaur", "Shershaah", "Hindi", 3.50, "2021-08-12"));
	        a1.add(new Playlist("Vaathi Coming", "Anirudh Ravichander, Gana Balachandar", "Master", "Tamil", 3.49, "2021-01-13"));
	        a1.add(new Playlist("Butta Bomma", "Armaan Malik", "Ala Vaikunthapurramuloo", "Telugu", 3.17, "2020-01-12"));
	        a1.add(new Playlist("Lehra Do", "Arijit Singh", "83", "Hindi", 4.45, "2021-12-24"));
	        a1.add(new Playlist("Tum Hi Ho", "Arijit Singh", "Aashiqui 2", "Hindi", 4.22, "2013-04-08"));
	        a1.add(new Playlist("Ghungroo", "Arijit Singh, Shilpa Rao", "War", "Hindi", 5.02, "2019-09-27"));
	        a1.add(new Playlist("Jai Jai Shivshankar", "Vishal Dadlani, Benny Dayal", "War", "Hindi", 3.58, "2019-09-27"));
	        
	        
		for(Object c:a1)
		{
			Playlist p=(Playlist)c;
			

				if(p.getlanguage().startsWith("T") && p.getlanguage().endsWith("u"))
				{
					System.out.println(p.getSong());
				}
			
		
		}
	
		
	}
	

}
