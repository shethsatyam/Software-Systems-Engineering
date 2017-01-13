public class Decaf implements IRobotCommand
{
    private IRobotCommand component ;
    private String opt;
    
    public Decaf(IRobotCommand c)
    {
        this.component = c ;
    }
    

    public String getCommand() 
    {
        if (opt != null)
        {
            return component.getCommand() + " Decaf[" + opt + "]"; 
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
