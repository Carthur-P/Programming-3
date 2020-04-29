package pword;

public class Word {
	
	private int ARRAY = 4;
	private int HALF = 2;
	private String[] words = new String[ARRAY];
	
	public Word(String word1, String word2, String word3, String word4)
	{
		words[0] = word1;
		words[1] = word2;
		words[2] = word3;
		words[3] = word4;
	}
	
	public String getMessage()
	{
		return words[0] + " " +  words[1] + " " + words[2] + " " + words[3];
	}
	
	public void reverseMessage()
	{
		for (int i = 0; i < words.length/HALF; i++)
		{
			String temp = words[i];
			words[i] = words[words.length - 1 - i];
			words[words.length - 1 - i] = temp;
		}
	}
}
