package pfriend2;

import java.time.LocalDate;

public class Friend implements Comparable<Friend> {
	
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private Gender gender; 
	private String homeTown;
	private String email;
	private Relationship relationshipStatus;
	private LocalDate enteredDate;
	
	public Friend(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		enteredDate = LocalDate.now();
	}
	
	public Friend(String firstName, String lastName, int year, int month, int day)
	{
		this(firstName, lastName);
		dateOfBirth = LocalDate.of(year, month, day);
	}
	
	public Friend(String firstName, String lastName, int year, int month, int day, Gender gender, String homeTown, String email,
			Relationship relationshipStatus)
	{
		this(firstName, lastName, year, month, day);
		this.gender = gender;
		this.homeTown = homeTown;
		this.email = email;
		this.relationshipStatus = relationshipStatus;
	}
	
	public String getFirst()
	{
		return firstName;
	}
	
	public String getLast()
	{
		return lastName;
	}
	
	public LocalDate getDOB()
	{
		return dateOfBirth;
	}
	
	public Gender getGender()
	{
		return gender;
	}
	
	public String getHomeTown()
	{
		return homeTown;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public Relationship getRelationship()
	{
		return relationshipStatus;
	}
	
	public LocalDate getEnteredDate()
	{
		return enteredDate;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public void setGender(Gender gender)
	{
		this.gender = gender;
	}
	
	public void setHomeTown(String homeTown)
	{
		this.homeTown = homeTown;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public void setRelationship(Relationship relationshipStatus)
	{
		this.relationshipStatus = relationshipStatus;
	}
	
	public int calcAge()
	{
		int age = LocalDate.now().getYear() - dateOfBirth.getYear();//get the initial age by minus the current year by DOB year
		if (dateOfBirth != null)
		{
			if (dateOfBirth.getMonthValue() > LocalDate.now().getMonthValue())//if the current month is less than the birthday month
			{
				age --;
			}
			
			if (dateOfBirth.getMonthValue() == LocalDate.now().getMonthValue())
			{
				if(dateOfBirth.getDayOfMonth() > LocalDate.now().getDayOfMonth())//if the current date is less than the birthday date
				{
					age --;
				}
			}
		}
		return age;
	}
	
	public boolean isTheSame(Friend aFriend)
	{
		return this.firstName.equals(aFriend.getFirst()) && this.lastName.equals(aFriend.getLast());	
	}
	
	@Override
	public String toString()
	{
		StringBuilder message = new StringBuilder();
		if (getGender() != null)
		{
			if(gender.equals(Gender.MALE))
			{
				message.append("Mr ");
			}
			
			if(gender.equals(Gender.FEMALE))
			{
				message.append("Ms ");
			}
		}
		
		message.append(getFirst());
		message.append(" " + getLast());
		
		if (getDOB() != null)
		{
			if (calcAge() < 13 || calcAge() > 120)
			{
				message.append("\nThe value you have entered for your date of birth is invalid");
			}
			
			else
			{
				message.append("\nYour age is: " + Integer.toString(calcAge()));
			}
		}
		
		if (homeTown != null)
		{
			message.append("\nYour hometown is: " + getHomeTown()); 
		}
		
		if (email != null)
		{
			message.append("\nYour email address is: " + getEmail());
		}
		
		if (relationshipStatus != null)
		{
			message.append("\nYour relationship status is: " + getRelationship());
		}
		
		message.append("\nData entered on " + getEnteredDate() + "\n");
		
		return message.toString();		
	}
	
	@Override
	public int compareTo(Friend f)
	{
		if (this.getLast().equals(f.getLast()))
		{
			return this.getFirst().compareTo(f.getFirst());
		}
		
		else
		{
			return this.getLast().compareTo(f.getLast());
		}
	}
}
