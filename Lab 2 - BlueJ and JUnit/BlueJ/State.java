

public interface State {
 
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
	
	public void insertNickel();
    public void insertDime();
    public void ejectNickel();
    public void ejectDime();
}
