package pfriend;

public class FriendApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Friend friend1 = new Friend("Carthur", "Pongpatimet");
		Friend friend2 = new Friend("James", "Scott", 2016, 04, 19);
		Friend friend3 = new Friend("Matt", "Jarvie", 1990, 11, 20, Gender.MALE, "Dunedin", "matt.jarvie@gmail.com", Relationship.COMPLICATED);
		
		System.out.println(friend1.toString());
		System.out.println(friend2.toString());
		System.out.println(friend3.toString()); 
	}
}
 