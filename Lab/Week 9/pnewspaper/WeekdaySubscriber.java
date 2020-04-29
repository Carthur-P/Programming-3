/*
 * WeekdaySubscriber.java
 *
 * Created on 9 May 2007, 14:29
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package pnewspaper;

/**
 *
 * @author DALE
 */
public class WeekdaySubscriber extends NewspaperSubscriber

{

         private String subType;

                public WeekdaySubscriber(String address) 

                {

                  super(address);

                  setType();

                }

   

                public void setType()

                {

                   subType = "Weekday";

        }

        public void setRate()

                {

                  rate = 3.5;

                }

                public String toString()

        {

         return(address + " rate: " + rate +

                                " service type : " + subType);

        }

               

}