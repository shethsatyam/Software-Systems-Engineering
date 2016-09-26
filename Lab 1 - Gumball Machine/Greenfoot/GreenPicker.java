import greenfoot.*;  

/*
The Greenpicker will dispense a ball only when the inspector invokes it, more about this is explained in the inspector class.
 */
public class GreenPicker extends Picker
{
 
    public void act() 
    {
     
    }    
     void dispenseball()
    {
        Greenfoot.delay(100);
        getWorld().showText("Here's you're Gumball",586,434);
        GreenfootImage gum = new GreenfootImage("green-bumball.png");
        gum.scale( 50, 50 ) ;
        getWorld().getBackground().drawImage(gum,130,400);
    }
}
