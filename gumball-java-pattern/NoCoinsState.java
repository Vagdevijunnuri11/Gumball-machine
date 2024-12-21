
public class NoCoinsState implements State{

	GumballMachine gumballMachine;
	public NoCoinsState(GumballMachine gumballMachine) {
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
		
		gumballMachine.setCoins(gumballMachine.getCoins()+ coinValue);
        int valOfInsertedCoins=gumballMachine.getCoins();
        if(gumballMachine.getCostOfGumball()==25) { // first gumball machine
        	if(valOfInsertedCoins>=25) {
        	gumballMachine.setState(gumballMachine.getHasCoinsState());
        	System.out.println("Gumball costs only a quarter!Please turn the crank");
        	}else {
        		System.out.println("Machine accepts only a quarter for a gumball!!");
        		ejectCoin();
        	}
        } // first gumball machines
        
        else if (gumballMachine.getCostOfGumball()==50){
        	if(gumballMachine.isOnlyQuarters()) {        //second gumball machine
        		if(valOfInsertedCoins>=50) {
        			gumballMachine.setState(gumballMachine.getHasCoinsState());
        			System.out.println("Turn the crank to get your gumball.");
        		}else if(valOfInsertedCoins!=25){ // not a quarter
        				System.out.println("Sorry..Machine accepts only quarters!!");
        				ejectCoin();
        		}
        	} //second gumball machine
        	
        	else { 	// third gumball machine
        		if(valOfInsertedCoins>=50) {
        			gumballMachine.setState(gumballMachine.getHasCoinsState());
        			System.out.println("Total amount is "+ valOfInsertedCoins +" cents.");
        			System.out.println("Please turn the crank.");
        		 }else {
        			 System.out.println("Please put in "+(50-valOfInsertedCoins)+" cents more.Accepted coins are - Quarter,Dime,Nickel");
        		 }
        	}
        } // 50 cents for a gumball
	}

	@Override
	public void ejectCoin() {
		int valOfInsertedCoins = gumballMachine.getCoins();
		if (valOfInsertedCoins>0){
		System.out.println("Please collect your "+valOfInsertedCoins+" cents.");
		gumballMachine.setCoins(0);
		}else
			System.out.println("Please put a coin first");		
	}

	@Override
	public void turnCrank() {
		int due = gumballMachine.getCostOfGumball()-gumballMachine.getCoins();
		System.out.println("You need to put in enough cents for a gumball!.Please put in "+due+ " cents more.");		
	}

	@Override
	public void dispense() {
		System.out.println("Sorry but you need to insert enough coins to get a gumball!!");
		gumballMachine.setCoins(0);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "waiting for more money";
	}
}
