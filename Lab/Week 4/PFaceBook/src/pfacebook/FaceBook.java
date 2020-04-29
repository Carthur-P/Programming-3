package pfacebook;

import java.util.ArrayList;

public class FaceBook {
	ArrayList<Friend> friendsArray;
	String faceBookProfile;
	
	public FaceBook(String faceBookProfile)
	{
		this.faceBookProfile = faceBookProfile;
		friendsArray = new ArrayList<Friend>();
	}
	
	public String getProfile()//getting the Face book profile
	{
		return faceBookProfile;
	}
	
	public void setProfile(String profile)//setting the Face book profile
	{
		faceBookProfile = profile;
	}
	
	public int getNumberOfFriends()
	{
		return friendsArray.size();
	}
	
	public void addFriend(Friend friend)//adding friends to the array
	{
		boolean isSame = false;//needs a boolean so it can loop through the whole array
		for(Friend person:friendsArray)
		{
			if(person.isTheSame(friend) == true)
			{
				isSame = true;
			}		
		}
		
		if (isSame == false)
		{
			friendsArray.add(friend);
		}
	}
	
	public void RemoveFriend(String firstName, String lastName)//deleting a friend
	{

		boolean isSame = false;
		int deletedFriend = 0;
		for(Friend person:friendsArray)
		{
			if(person.getFirst() == firstName && person.getLast() == lastName)
			{
				deletedFriend = friendsArray.indexOf(person);
				isSame = true;
			}		
		}
		
		if (isSame == true)
		{
			friendsArray.remove(deletedFriend);
		}
	}
	
	public String displayInfo()//displaying all the info of friends in the array
	{
		StringBuilder details = new StringBuilder();
		for(Friend person:friendsArray)
		{
			details.append(person.toString() + "\n");
		}
		return details.toString();
	}
	
	public String displayFriendsUnder21()//showing friends under 21
	{
		StringBuilder details = new StringBuilder();
		details.append("Friends under 21\n");
		for(Friend person:friendsArray)
		{
			if (person.calcAge() < 21)
			{
				details.append(person.getFirst() + " ");
				details.append(person.getLast());
				
			}
		}
		return details.toString();
	}
	
	public String displayHomeTown()//displaying home town info of friends in the array
	{
		StringBuilder details = new StringBuilder();
		details.append("Hometown of friends\n");
		for(Friend person:friendsArray)
		{
			details.append(person.getFirst() + " ");
			details.append(person.getLast() + " hometown is: ");
			details.append(person.getHomeTown() + "\n");
		}
		return details.toString();
	}
	
	
}
