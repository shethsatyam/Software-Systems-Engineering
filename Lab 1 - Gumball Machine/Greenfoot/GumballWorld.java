import greenfoot.*;

public class GumballWorld extends World
{

    
    public GumballWorld()
    {    
        super(800, 600, 1); 
        prepare();
    }

    
    private void prepare()
    {
        GumballMachine gumballmachine = new GumballMachine();
  
        addObject(gumballmachine, 367, 237);
        addObject( new Penny(), 57, 71 ) ;
        addObject( new Quarter(), 68, 156 ) ;
        addObject( new FakeQuarter(), 66, 248 ) ;

        Inspector inspector = new Inspector();
        addObject(inspector, 533, 291);
        RandomPicker randompicker = new RandomPicker();
        addObject(randompicker, 643, 104);
        randompicker.setLocation(655, 94);
        GreenPicker greenpicker = new GreenPicker();
        addObject(greenpicker, 686, 454);
        greenpicker.setLocation(669, 456);
    }
}
