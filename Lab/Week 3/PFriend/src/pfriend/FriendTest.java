package pfriend;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FriendTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetFirstName() {
		Friend friend = new Friend("Matt", "Jarvie");
		friend.setFirstName("Carthur");
		assertEquals("Carthur", friend.getFirst());
	}

	@Test
	public void testSetLastName() {
		Friend friend = new Friend("Matt", "Jarvie");
		friend.setLastName("Pongpatimet");
		assertEquals("Pongpatimet", friend.getLast());
	}

	@Test
	public void testSetGender() {
		Friend friend = new Friend("Matt", "Jarvie");
		friend.setGender(Gender.MALE);
		assertEquals(Gender.MALE, friend.getGender());
	}

	@Test
	public void testSetHomeTown() {
		Friend friend = new Friend("Matt", "Jarvie");
		friend.setHomeTown("Dunedin");
		assertEquals("Dunedin", friend.getHomeTown());
	}

	@Test
	public void testSetEmail() {
		Friend friend = new Friend("Matt", "Jarvie");
		friend.setEmail("matt.jarvie@gmail.com");
		assertEquals("matt.jarvie@gmail.com", friend.getEmail());
	}

	@Test
	public void testSetRelationship() {
		Friend friend = new Friend("Matt", "Jarvie");
		friend.setRelationship(Relationship.COMPLICATED);
		assertEquals(Relationship.COMPLICATED, friend.getRelationship());
	}

	@Test
	public void testCalcAge1() {
		Friend friend = new Friend("Matt", "Jarvie", 1990, 11, 20);
		assertEquals(27, friend.calcAge());
	}
	
	@Test
	public void testCalcAge2() {
		Friend friend = new Friend("Matt", "Jarvie", 1990, 03, 19);
		assertEquals(27, friend.calcAge());
	}
	
	@Test
	public void testIsTheSame() {
		Friend friend = new Friend("Matt", "Jarvie");
		Friend sameFriend = new Friend("Matt", "Jarvie");
		assertEquals(true, friend.isTheSame(sameFriend));
	}
	
	@Test
	public void testIsNotTheSame() {
		Friend friend = new Friend("Matt", "Jarvie");
		Friend sameFriend = new Friend("Matt", "Scott");
		assertEquals(false, friend.isTheSame(sameFriend));
	}

	@Test
	public void testToStringMale() {
		Friend friend = new Friend("Matt", "Jarvie", 1990, 11, 20, Gender.MALE, "Dunedin", "matt.jarvie@gmail.com", Relationship.COMPLICATED);
		assertEquals("Mr Matt Jarvie\n" + 
					"Your age is: 27\n" + 
					"Your hometown is: Dunedin\n" + 
					"Your email address is: matt.jarvie@gmail.com\n" + 
					"Your relationship status is: COMPLICATED\n" + 
					"Data entered on 2018-03-08\n", friend.toString());
	}
	
	@Test
	public void testToStringFemale() {
		Friend friend = new Friend("Jane", "Doe", 1996, 04, 19, Gender.FEMALE, "Dunedin", "jane.doe@gmail.com", Relationship.WIDOWED);
		assertEquals("Ms Jane Doe\n" + 
					"Your age is: 21\n" + 
					"Your hometown is: Dunedin\n" + 
					"Your email address is: jane.doe@gmail.com\n" + 
					"Your relationship status is: WIDOWED\n" + 
					"Data entered on 2018-03-08\n", friend.toString());
	}
	
	@Test
	public void testToStringIvalidAge() {
		Friend friend = new Friend("Jane", "Doe", 2016, 04, 19, Gender.FEMALE, "Dunedin", "jane.doe@gmail.com", Relationship.WIDOWED);
		assertEquals("Ms Jane Doe\n" + 
					"The value you have entered for your date of birth is invalid\n" + 
					"Your hometown is: Dunedin\n" + 
					"Your email address is: jane.doe@gmail.com\n" + 
					"Your relationship status is: WIDOWED\n" + 
					"Data entered on 2018-03-08\n", friend.toString());
	}
	

}
