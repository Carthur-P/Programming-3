/*
 * NewspaperApp.java
 *
 * Created on 9 May 2007, 14:18
 *
 *
 */

package pnewspaper;

/**
 *
 * @author DALE
 */
public class NewspaperApp {
    
    /** Creates a new instance of NewspaperApp */
    public NewspaperApp() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewspaperSubscriber[] people = new NewspaperSubscriber[3];
        people[0] = new SevenDaySubscriber("2 Marion St");
        people[1] = new WeekdaySubscriber("6 Marion St");
        people[2] = new WeekendSubscriber("10 Marion St");
        
        for (int i=0;i<people.length;i++) {
            System.out.println(people[i]);
        }
    }
    
    
}
