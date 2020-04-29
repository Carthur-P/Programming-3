package pcdcollection;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionApp {

	public static void main(String[] args) {
		ArrayList<Artist> artists = new ArrayList<>();
		BufferedReader file;
		String line;
		
		try
		{
			file = new BufferedReader(new FileReader("data.csv"));
			while ((line = file.readLine()) != null)
			{
				String artist = line;
				ArrayList<Song> songs = new ArrayList<>();
				for(int i = 0; i < 3; i++)
				{
					line = file.readLine();
					songs.add(new Song(line));
				}
				Collections.sort(songs);
				artists.add(new Artist(artist, songs));
			}
		}
		
		catch (IOException e)
		{
			e.getStackTrace();
			System.out.println("File could not be found");
		}
		
		Collections.sort(artists);
		
		CDCollection collection = new CDCollection(artists);
		System.out.println(collection.toString());
	}

}
