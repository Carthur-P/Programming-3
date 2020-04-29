/*
 * NewspaperSubscriber.java
 *
 * Created on 9 May 2007, 14:18
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package pnewspaper;

/**
 *
 * @author DALE
 */
public abstract class NewspaperSubscriber
        
{
    
    protected String address;
    
    protected double rate;
    
    public NewspaperSubscriber(String address) 
            
    {
        
        
        this.address= address; 
        setRate();
        
    }
    
    public boolean equals(NewspaperSubscriber nps)
    
    {
        
        boolean result;
        
        if (address.equals(nps.address))
            
            result = true;
        
        else
            
            result = false;
        
        return result;
        
    }
    
    
    
    public String getAddress()
    
    {
        
        return address;
        
    }
    
    public double getRate()
    
    {
        
        return rate;
        
    }
    
    
    
    public void setAddress(String address) 
            
    {
        
        this.address= address;
        
    }
    
    public abstract void setRate();
    
    
    
    
    
}