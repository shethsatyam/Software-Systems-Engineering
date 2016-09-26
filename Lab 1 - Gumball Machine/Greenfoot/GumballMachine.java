import greenfoot.*; 
import java.util.*;
import java.lang.*;
import java.io.*;

public class GumballMachine extends Actor
{
     String CData=null;
    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 ) ;   
    }

    public void act() 
    {
        if(isTouching(Coin.class))
        {
            Actor intersect = getOneIntersectingObject(Coin.class);
            CData = intersect.toString();
            MouseInfo m = Greenfoot.getMouseInfo();
            int mx = m.getX();
            int my = m.getY();
            if((mx >= 330 && mx <= 395) && (my >= 250 && my <= 299) )
            {
                getWorld().showText("Have Coin",350,250);
                getWorld().removeObject(intersect);
            }
        }
        if(Greenfoot.mouseClicked(this))
            {
                MouseInfo mi = Greenfoot.getMouseInfo();
                int crankx = mi.getX();
                int cranky = mi.getY();
                 if((crankx >= 330 && crankx <= 395) && (cranky >= 300 && cranky <= 350))
                 {
                     getWorld().showText("Crank Turned",350,300);
                     invokeInspector(CData);
                 }
            }
    }
    
    void invokeInspector(String data)
    {
    getWorld().getObjects(Inspector.class).get(0).checkcoin(data);
    }
}
