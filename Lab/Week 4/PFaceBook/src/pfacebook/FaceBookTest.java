package pfacebook;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FaceBookTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetProfile() {
		FaceBook profile = new FaceBook("Carthur Pongpatimet");
		assertEquals("Carthur Pongpatimet", profile.getProfile());
	}

	@Test
	public void testSetProfile() {
		FaceBook profile = new FaceBook("Carthur Pongpatimet");
		profile.setProfile("Rachel Youngson");
		assertEquals("Rachel Youngson", profile.getProfile());
	}

	@Test
	public void testGetNumberOfFriends() {
		FaceBook profile = new FaceBook("Carthur Pongpatimet");
		Friend matt = new Friend("Matt", "Jarvie", 1990, 11, 20);
		Friend hamish = new Friend("Hamish", "Scott", 1996, 4, 19);
		Friend Allie = new Friend("Allie", "Youngson", 2000, 9, 02);
		profile.addFriend(matt);
		profile.addFriend(hamish);
		profile.addFriend(Allie);
		assertEquals(3, profile.getNumberOfFriends());
	}

	@Test
	public void testAddFriend() { 
		FaceBook profile = new FaceBook("Carthur Pongpatimet");
		Friend matt = new Friend("Matt", "Jarvie", 1990, 11, 20);
		Friend hamish = new Friend("Hamish", "Scott", 1996, 4, 19);
		profile.addFriend(matt);
		profile.addFriend(hamish);
		profile.addFriend(hamish);
		assertEquals(2, profile.getNumberOfFriends());
	}

	@Test
	public void testRemoveFriendTheSame() {
		FaceBook profile = new FaceBook("Carthur Pongpatimet");
		Friend matt = new Friend("Matt", "Jarvie", 1990, 11, 20);
		profile.addFriend(matt);
		profile.RemoveFriend("Matt", "Jarvie");
		assertEquals(0, profile.getNumberOfFriends());
	}
	
	@Test
	public void testRemoveFriendNotTheSame1() {
		FaceBook profile = new FaceBook("Carthur Pongpatimet");
		Friend matt = new Friend("Matt", "Jarvie", 1990, 11, 20);
		profile.addFriend(matt);
		profile.RemoveFriend("Matt", "Scott");
		assertEquals(1, profile.getNumberOfFriends());
	}
	
	@Test
	public void testRemoveFriendNotTheSame2() {
		FaceBook profile = new FaceBook("Carthur Pongpatimet");
		Friend matt = new Friend("Matt", "Jarvie", 1990, 11, 20);
		profile.addFriend(matt);
		profile.RemoveFriend("Hamish", "Javie");
		assertEquals(1, profile.getNumberOfFriends());
	}

	@Test
	public void testDisplayInfo() {
		FaceBook profile = new FaceBook("Carthur Pongpatimet");
		Friend matt = new Friend("Matt", "Jarvie", 1990, 11, 20);
		profile.addFriend(matt);
		assertEquals("Matt Jarvie\n" + "Your age is: 27\n" + "Data entered on 2018-03-20\n\n", profile.displayInfo());
	}

	@Test
	public void testDisplayFriendsUnder21over21() {
		FaceBook profile = new FaceBook("Carthur Pongpatimet");
		Friend matt = new Friend("Matt", "Jarvie", 1990, 11, 20);
		profile.addFriend(matt);
		assertEquals("Friends under 21\n", profile.displayFriendsUnder21());
	}
	
	@Test
	public void testDisplayFriendsUnder21under21() {
		FaceBook profile = new FaceBook("Carthur Pongpatimet");
		Friend matt = new Friend("Matt", "Jarvie", 2001, 11, 20);
		profile.addFriend(matt);
		assertEquals("Friends under 21\n" + "Matt Jarvie", profile.displayFriendsUnder21());
	}

	@Test
	public void testDisplayHomeTown() {
		FaceBook profile = new FaceBook("Carthur Pongpatimet");
		Friend matt = new Friend("Matt", "Jarvie", 1990, 11, 20, Gender.MALE, "Dunedin", "matt.jarvie@gmail.com", Relationship.COMPLICATED);
		profile.addFriend(matt);
		assertEquals("Hometown of friends\n" + "Matt Jarvie hometown is: Dunedin\n", profile.displayHomeTown());
	}

}
