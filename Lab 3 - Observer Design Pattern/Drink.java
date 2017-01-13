public class Drink implements IRobotCommand
{
    
    private IRobotCommand component ;
    private String opt;
    
    
    public Drink(IRobotCommand c)
    {
        this.component = c ;
    }

    public String getCommand() 
    {
        if (opt != null)
        {
            return component.getCommand() + " Drink[" + opt + "]"; 
        }
        else
        {
            return component.getCommand();
        }
    }
    
    public void setOption(String o) 
    {
        opt=o; 
    }    
}
