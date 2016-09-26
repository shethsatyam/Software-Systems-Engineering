

public class SoldState implements State {
 
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a gumball");
	}
	
	public void insertNickel() {
		System.out.println("Please wait, we're already giving you a gumball");
	}
	
	public void insertDime() {
	    System.out.println("Please wait, we're already giving you a gumball");
	}
 
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank");
	}
	public void ejectNickel() {
		System.out.println("Sorry, you already turned the crank");
	}
	public void ejectDime() {
		System.out.println("Sorry, you already turned the crank");
	}
 
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball!");
	}
 
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
		    System.out.println(gumballMachine.getState());
			gumballMachine.setState(gumballMachine.getNoCoinsState());
			System.out.println(gumballMachine.getState());
		} else {
			System.out.println("Oops, out of gumballs!");
			System.out.println(gumballMachine.getState());
			gumballMachine.setState(gumballMachine.getSoldOutState());
			System.out.println(gumballMachine.getState());
		}
	}
 
	public String toString() {
		return "dispensing a gumball";
	}
}


