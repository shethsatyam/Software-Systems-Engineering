

public class NoCoinsState implements State {
    GumballMachine gumballMachine;
 
    public NoCoinsState(GumballMachine gumballMachine) {
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
       
		gumballMachine.setState(gumballMachine.getHasCoinsState());
	
	}
	
	public void insertNickel() {
		System.out.println("You inserted a nickel");
		int i=gumballMachine.getTotalAmt(); 
        i+=5;
        gumballMachine.setTotalAmt(i);
        int j=gumballMachine.getNCount();
        j++;
        gumballMachine.setNCount(j);
		gumballMachine.setState(gumballMachine.getHasCoinsState());
	}
	
	public void insertDime() {
		System.out.println("You inserted a dime");
		int i=gumballMachine.getTotalAmt(); 
        i+=10;
        gumballMachine.setTotalAmt(i);
        int j=gumballMachine.getDCount();
        j++;
        gumballMachine.setDCount(j);
		gumballMachine.setState(gumballMachine.getHasCoinsState());
	}
 
	public void ejectQuarter() {
		System.out.println("You haven't inserted any coins!!");
	}
	public void ejectNickel() {
		System.out.println("You haven't inserted any coins!!");
	}
	public void ejectDime() {
		System.out.println("You haven't inserted any coins!!");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's no coins!");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "";
	}
}
