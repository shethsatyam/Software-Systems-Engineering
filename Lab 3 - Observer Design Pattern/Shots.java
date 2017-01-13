
public class Shots implements IRobotCommand
{

    private IRobotCommand component ;
    private String opt;

    
    
    public Shots(IRobotCommand c)
    {
        this.component = c ;
    }

    public String getCommand() 
    {
        if (opt != null)
        {
            return component.getCommand() + " Shots[" + opt + "]"; 
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
