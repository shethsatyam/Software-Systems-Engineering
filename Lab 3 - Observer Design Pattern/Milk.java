public class Milk implements IRobotCommand
{

    private IRobotCommand component ;
    private String opt;

   
    
    public Milk(IRobotCommand c)
    {
        this.component = c ;
    }

    public String getCommand() 
    {
        if (opt != null)
        {
            return component.getCommand() + " Milk[" + opt + "]"; 
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
