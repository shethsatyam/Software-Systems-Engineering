import greenfoot.*;  
import java.lang.Math;
/*
  The RandomPicker will dispense a ball only when the inspector invokes it, more about this is explained in the inspector class.
 */
public class RandomPicker extends Picker
{
    
    public void act() 
    {
       
    }    
    
    void dispenseball(int i)
    {    Greenfoot.delay(100);
         getWorld().showText("Here's you're Gumball",543,104);
        if(i==0)
            {
                GreenfootImage gum = new GreenfootImage("blue-gumball.png");
                gum.scale( 50, 50 ) ;
                getWorld().getBackground().drawImage(gum,150,400);
            }
        else if(i==1)
            {
                GreenfootImage gum = new GreenfootImage("red-gumball.png");
                gum.scale( 50, 50 ) ;
                getWorld().getBackground().drawImage(gum,150,400);
            }
        else if(i==2)
            {
                GreenfootImage gum = new GreenfootImage("green-bumball.png");
                gum.scale( 50, 50 ) ;
                getWorld().getBackground().drawImage(gum,150,400);
            }   
    }
}


