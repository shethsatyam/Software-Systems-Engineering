import java.io.*;
import java.util.*;

public class GumballMachine implements IGumballMachine{
 
    State soldOutState;
    State noCoinsState;
    State hasCoinsState;
    State soldState;
 
    State state = soldOutState;
    int count = 0;
    private int TotalAmt=0, qCount=0, nCount=0, dCount=0, qGive=0, nGive=0, dGive=0,gumballsinslot=0 ;
 
    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noCoinsState = new NoCoinsState(this);
        hasCoinsState = new HasCoinsState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noCoinsState;
        } 
    }
 
    public void insertQuarter() {
        state.insertQuarter();
    }
    
    public void insertNickel() {
        state.insertNickel();
    }
    
    public void insertDime() {
        state.insertDime();
    }
 
    public void ejectQuarter() {
        state.ejectQuarter();
    }
    public void ejectNickel() {
        state.ejectNickel();
    }
    public void ejectDime() {
        state.ejectDime();
    }
 
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }
 
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
            gumballsinslot++;
            this.releaseCoins();
        }
       
    }
 
    int getCount() {
        return count;
    }
 
    void refill(int count) {
        this.count = count;
        state = noCoinsState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoCoinsState() {
        return noCoinsState;
    }

    public State getHasCoinsState() {
        return hasCoinsState;
    }

    public State getSoldState() {
        return soldState;
    }
 
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n"      );
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
    
    public void takeGumballFromSlot()
    {
        System.out.println("Collected " + gumballsinslot + " Gumballs");
        gumballsinslot=0;
        qGive=0;
        dGive=0;
        nGive=0;
        TotalAmt=0;
        isGumballInSlot();
    }
    
    public boolean isGumballInSlot()
    {
        if(gumballsinslot>0)
        {
            return true;
        }
        else
        {
        return false;    
        }    
    }
    
    int getTotalAmt(){
       return TotalAmt;
       }
       
    void setTotalAmt(int i){
       this.TotalAmt=i;
       }
       
    int getQCount(){
       return qCount;
       }    
       
    void setQCount(int i){
       this.qCount=i;
       } 
  
    int getNCount(){
       return nCount;
       }
       
   void setNCount(int i){
       this.nCount=i;
       }
  
  int getDCount(){
       return dCount;
       }
       
  void setDCount(int i){
       this.dCount=i;
       }
     
int getQGive(){
       return qGive;
       }
       
void setQGive(int i){
       this.qGive=i;
       }        

int getNGive(){
       return nGive;
       }
       
void setNGive(int i){
       this.nGive=i;
       }       

int getDGive(){
       return dGive;
       }
       
void setDGive(int i){
       this.dGive=i;
       }
       
public void releaseCoins()

{
        if(TotalAmt>=25)
        {
            TotalAmt-=25;
            qGive++;
        }
        if(TotalAmt>=10 && TotalAmt <25)
        {
            TotalAmt-=10;
            dGive++;
        }
        if(TotalAmt>=5 && TotalAmt <10)
        {
            TotalAmt-=5;
            nGive++;
        }         
    
System.out.println("Please collect your " + gumballsinslot + "Gumball(s) " + qGive + " Quarter(s) " + dGive + " Dime(s)" + nGive + " Nickel(s)");
state=noCoinsState;
  
}
}

