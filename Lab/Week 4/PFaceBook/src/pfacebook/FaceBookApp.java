package pfacebook;

import pfacebook.Gender;
import pfacebook.Relationship;

public class FaceBookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		FaceBook profile = new FaceBook("Carthur Pongpatimet");
		Friend matt = new Friend("Matt", "Jarvie", 1990, 11, 20, Gender.MALE, "Dunedin", "matt.jarvie@gmail.com", Relationship.COMPLICATED);
		Friend hamish = new Friend("Hamish", "Scott", 1996, 04, 19);
		profile.addFriend(matt);
		profile.addFriend(hamish);
		profile.RemoveFriend("Matt", "Jarvie");
		
		System.out.println(profile.displayInfo());
		System.out.println(profile.displayFriendsUnder21());
		System.out.println(profile.displayHomeTown());
		*/
		
		FaceBook profile = new FaceBook("Carthur Pongpatimet");
		Friend matt = new Friend("Matt", "Jarvie", 1990, 11, 20, Gender.MALE, "Dunedin", "matt.jarvie@gmail.com", Relationship.COMPLICATED);
		profile.addFriend(matt);
		//System.out.println(profile.displayInfo());
		//System.out.println(profile.displayFriendsUnder21());
		System.out.println(profile.displayHomeTown());
	}

}
