/*
 * Person.java
 *
 * Created on 20 June 2010, 13:20
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package pphonebook;

/**
 *
 * @author DALE
 */
public class Person implements Comparable<Person>{
   
	private String firstName; 
	private String lastName;
	private String room;
	private String title;
	private String phone;


	Person(String firstName, String lastName,  String room, String title, String phone) {
		
		this.firstName = firstName;
		this.lastName = lastName;
        this.room = room;
		this.title = title;
        this.phone = phone;
		}
	
	public void setFirstName(String firstName){ this.firstName= firstName;}
	public void setLastName(String lastName){ this.lastName= lastName;}
	public void setroom(String room) {this.room = room;}
	public void settitle(String title) {this.title = title;}
	public void setPhone(String phone){ this.phone = phone;}
	
	public String getFirstName(){ return firstName;}
	public String getLastName(){ return lastName;}
	public String getRoom() {return room;}
	public String gettitle() {return title;}
	public String getPhone(){ return phone;}
        
    public String toString(){
        return firstName +" "+lastName +" "+phone+" "+room;
        }

	@Override
	public int compareTo(Person p) {
		if (this.lastName.equals(p.lastName))
		{
			return this.firstName.compareTo(p.firstName);
		}
		
		else
		{
			return this.lastName.compareTo(p.lastName);
		}
	}
	
	
}

