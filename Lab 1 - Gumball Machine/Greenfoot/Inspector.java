import greenfoot.*;  
import java.util.*;
import java.io.*;
import java.lang.*;
/*
 Inspector comes into play when crank is turned(clicked). He checks for coin validity and then randomly selects the green or random picker.
 */
public class Inspector extends Alien
{
    
    public void act() 
    {
       
    }
    
        
    void provideinst()
    {
        int randnum=Greenfoot.getRandomNumber(4);
        if(randnum==0)
            getWorld().getObjects(RandomPicker.class).get(0).dispenseball(0);
        else if(randnum==1)
            getWorld().getObjects(RandomPicker.class).get(0).dispenseball(1);
        else if(randnum==2)
            getWorld().getObjects(RandomPicker.class).get(0).dispenseball(2);    
        else
            getWorld().getObjects(GreenPicker.class).get(0).dispenseball();
    }
    
    void checkcoin(String coin)
    {
        if(coin.startsWith("Quarter"))
        {
            getWorld().showText("Its a quarter",650,300);
            provideinst();   
        }
        if(coin.startsWith("Penny"))
        {
            getWorld().showText("Its only a penny",650,300);
        }
        if(coin.startsWith("FakeQuarter"))
        {
             getWorld().showText("Its a Fake Quarter",650,300);
        }    
    }
}
