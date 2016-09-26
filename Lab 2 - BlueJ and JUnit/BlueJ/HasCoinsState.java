

import java.util.Random;

public class HasCoinsState implements State {
    GumballMachine gumballMachine;
    
    public HasCoinsState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
  
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        int i=gumballMachine.getTotalAmt(); 
        i+=25;
        gumballMachine.setTotalAmt(i);
        int j=gumballMachine.getQCount();
        j++;
        gumballMachine.setQCount(j);
        //System.out.println(gumballMachine.getState());
    }
    
    public void insertNickel() {
        System.out.println("You inserted a nickel");
        int i=gumballMachine.getTotalAmt(); 
        i+=5;
        gumballMachine.setTotalAmt(i);
        int j=gumballMachine.getNCount();
        j++;
        gumballMachine.setNCount(j);
    }
    
    public void insertDime() {
        System.out.println("You inserted a dime");
        int i=gumballMachine.getTotalAmt(); 
        i+=10;
        gumballMachine.setTotalAmt(i);
        int j=gumballMachine.getDCount();
        j++;
        gumballMachine.setDCount(j);
    }
 
    public void ejectQuarter() {
        int i=gumballMachine.getTotalAmt(); 
        if(i>=25)
        {
            i-=25;
            gumballMachine.setTotalAmt(i);
            int j=gumballMachine.getQCount();
            j--;
            gumballMachine.setQCount(j);
            System.out.println("Quarter returned");
            if(i==0){
            gumballMachine.setState(gumballMachine.getNoCoinsState());
            }
        }
        else
        {
            System.out.println("No enough money to eject quarter");
        }
    }
    public void ejectNickel() {
       
        int i=gumballMachine.getTotalAmt(); 
       if(i>=5)
       {
            i-=5;
            gumballMachine.setTotalAmt(i);
            int j=gumballMachine.getNCount();
            j--;
            gumballMachine.setNCount(j);
            System.out.println("Nickel returned");
            if(i==0){
            gumballMachine.setState(gumballMachine.getNoCoinsState());
            }    
       }
        else
        {
            System.out.println("No enough money to eject nickel");
        }
    }
    public void ejectDime() {
        
        int i=gumballMachine.getTotalAmt(); 
        if(i>=10)
        {
            i-=10;
            gumballMachine.setTotalAmt(i);
            int j=gumballMachine.getDCount();
            j--;
            gumballMachine.setDCount(j);
            if(i==0){
            gumballMachine.setState(gumballMachine.getNoCoinsState());
            }
        }
        else
        {
            System.out.println("No enough money to eject dime");
        }
    }
    public void turnCrank() {
        System.out.println("You turned...");
        int j = gumballMachine.getTotalAmt();
        if(j>=50)
        {
            j-=50;
            gumballMachine.setTotalAmt(j);
            System.out.println(gumballMachine.getState());
            gumballMachine.setState(gumballMachine.getSoldState());
            System.out.println(gumballMachine.getState());
        }
       else
       {
           System.out.println(j + "is not enough for a Gumball!!");  
       }
    }

    public void dispense() {
        System.out.println("No gumball dispensed, Turn Crank First!");
    }
 
    public String toString() {
        return "";
    }
}
