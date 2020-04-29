/*
 * WeekendSubscriber.java
 *
 * Created on 9 May 2007, 14:32
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package pnewspaper;

/**
 *
 * @author DALE
 */
public class WeekendSubscriber extends NewspaperSubscriber
        
{
    
    private String subType;
    
    public WeekendSubscriber(String address)
    
    {
        
        super(address);
        
        setType();
        
    }
    
    
    
    public void setType()
    
    {
        
        subType = "Weekend";
        
    }
    
    public void setRate()
    
    {
        
        rate = 2.0;
        
    }
    
    public String toString()
    
    {
        
        return(address + " rate: " + rate +
                
                " service type : " + subType);
        
    }
    
    
    
}