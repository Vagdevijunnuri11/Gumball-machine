
public class HasCoinsState implements State{

	GumballMachine gumballMachine;
	
	public HasCoinsState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertCoin(int coinValue) {
		if(coinValue==5)
			System.out.println("You inserted a Nickel!");
		else if(coinValue==10)
			System.out.println("You inserted a Dime!");
		else if(coinValue==25)
			System.out.println("You inserted a Quarter!");
		else {
			System.out.println("Error!..you can only insert a Quarter or a Nickel or a Dime.");
			return;
		}
		gumballMachine.setCoins(gumballMachine.getCoins() + coinValue);
	}

	@Override
	public void ejectCoin() {
		int valOfInsertedCoins = gumballMachine.getCoins();
		System.out.println("Your "+valOfInsertedCoins+" cents returned");
		gumballMachine.setCoins(0);
		gumballMachine.setState(gumballMachine.getNoCoinsState());
	}
	

	@Override
	public void turnCrank() {
		System.out.println("You turned the crank");
		gumballMachine.setState(gumballMachine.getSoldState());
		
	}

	@Override
	public void dispense() {
		System.out.println("No gumball to dispense");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "waiting for crank turn";
	}

	

}
