

public class SoldState implements State {
 
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
	public void insertCoin(int coinValue) {
		System.out.println("Please wait, we're already giving you a gumball");
	}
 
	public void ejectCoin() {
		System.out.println("Sorry, you already turned the crank");
	}
 
	public void turnCrank() {
		System.out.println("You cannot turn twice to get a gumball!!");
	}
 
	public void dispense() {
        if (gumballMachine.getnoOfGumballs() > 0) {
            gumballMachine.releaseBall();
            if (gumballMachine.getCoins() - 50 > 0) {
                int change = gumballMachine.getCoins()-50;
                System.out.println("\nPlease collect your change.Your " + change + " cents returned." );
                
                }
            gumballMachine.setCoins(0);
            gumballMachine.setState(gumballMachine.getNoCoinsState());             
        } 
        else {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
 
    public String toString() {
        return "releasing a gumball...";
    }
}


