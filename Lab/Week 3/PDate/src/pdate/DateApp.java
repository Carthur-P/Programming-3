package pdate;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class DateApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instant time = Instant.now();
		
		String birthday = JOptionPane.showInputDialog("Please enter your birthday (date/month/year");
		String[] words = birthday.split("/");//this will split the string into substring at the character "/" and put it into an array
		int date = Integer.parseInt(words[0]);
		int month = Integer.parseInt(words[1]);
		int year = Integer.parseInt(words[2]);
		
		System.out.println(LocalDate.of(year, month, date));
		
		//calculating the age base of the date that the user gave
		LocalDate currentYear = LocalDate.now();
		int age = currentYear.getYear() - year;
		
		if (currentYear.getMonthValue() > month)//if the current month is more than the birthday month
		{
			age --;
		}
		
		if (currentYear.getMonthValue() == month)//if the current date is more than the birthday date
		{
			if(currentYear.getDayOfMonth() > date)
			{
				age --;
			}
		}
		
		System.out.println("Your age is " + age);	
		System.out.println(Duration.between(time, Instant.now()));
	}
}

