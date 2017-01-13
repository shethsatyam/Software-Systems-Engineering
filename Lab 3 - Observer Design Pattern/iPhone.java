public class iPhone
{
    Robot robot;
    Decaf decaf;
    Shots shot;
    Milk milk;
    Drink drink;
    
    public iPhone( ) {
    robot = new Robot();
    decaf = new Decaf(robot);
    shot = new Shots(decaf);
    milk = new Milk(shot);
    drink = new Drink(milk);
    }

    public void setDecaf(String s)
    {
        // input: NO, YES and 1/2
        decaf.setOption(s);  
    }
    
    public void setShots(String s)
    {
        // input: 1, 2, 3, d
        shot.setOption(s);
    }

    public void setMilk(String s)
    {
        // input: WH, NF, 1, 2
        milk.setOption(s);
    }
    
    public void setDrink(String s)
    {
        // input: A, L, M, C, CM, CDI, E, ECP
        drink.setOption(s);
    }
    
    public String sendCommand()
    {
        // return command string for robot
        return drink.getCommand(); // replace with your code
    }
}
