/*
 * SevenDaySubscriber.java
 *
 * Created on 9 May 2007, 14:34
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package pnewspaper;

/**
 *
 * @author DALE
 */
public class SevenDaySubscriber extends NewspaperSubscriber
        
{
    
    private String subType;
    
    public SevenDaySubscriber(String address)
    
    {
        
        super(address);
        
        setType();
        
    }
    
    
    
    public void setType()
    
    {
        
        subType = "Seven day";
        
    }
    
    public void setRate()
    
    {
        
        rate = 4.5;
        
    }
    
    public String toString()
    
    {
        
        return(address + " rate: " + rate +
                
                " service type : " + subType);
        
    }
    
    
    
}