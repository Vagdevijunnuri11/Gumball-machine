
//Third gumball machine - Accepts 50 cents for one gumball - Accepts Dime,Nickel and a quarter.

public class GumballMachineThird extends GumballMachineParent implements IGumballMachineThird{

	public GumballMachineThird(int noOfGumballs) {
		super(noOfGumballs);
		setCostOfGumball(50);
	}
	
	@Override
	public void insertCoins(int coinVal) {
		System.out.println("Please insert a coin");
		if(coinVal>=50) {
			System.out.println("You have inserted 50 cents");
		}else if(coinVal!=5&&coinVal!=10&&coinVal!=25) {
			System.out.println("Machine accepts dime or nickel or quarter for a gumball!");
		}else {
			totalCoinValue(coinVal);
		}
	}
	
	@Override
	public void ejectCoins() {
		// TODO Auto-generated method stub
		System.out.println("Hey,you don't want gumball!!Please collect your coins");
		setCoinValue(0);
	}
	
	@Override
	public void returnCoins(int change) {
		System.out.println("Returning your change...");
		System.out.println("Change returned is "+change+" cents.");
		setCoinValue(0);		
	}
	
	@Override
	public void turnTheCrank() {
		int coinsValue = getCoinValue();
		System.out.println("Turned the crank");
		ejectGumball();
		if((coinsValue-costOfGumball)>0)
			returnCoins(coinsValue-costOfGumball);
	}

	public static void main(String[] args) {
		GumballMachineThird m3 = new GumballMachineThird(10);
		//put 2 quarters and get the gumball
		m3.insertCoins(25);
		m3.insertCoins(25);
		m3.turnTheCrank();
		System.out.println("---------------------------");
		//put only one quarter
		m3.insertCoins(25);
		m3.turnTheCrank();
		System.out.println("---------------------------");
		//one dime one nickel one quarter one dime and get a gumball
		m3.insertCoins(10);
		m3.insertCoins(5);
		m3.insertCoins(25);
		m3.insertCoins(10);
		m3.turnTheCrank();
		System.out.println("---------------------------");
		//put something other than dime,nickel,quarter
		m3.insertCoins(1);
		System.out.println("---------------------------");
		//eject coins
		m3.insertCoins(5);
		m3.insertCoins(5);
		m3.ejectCoins();
		System.out.println("---------------------------");
		//return change
		m3.insertCoins(25);
		m3.insertCoins(25);
		m3.insertCoins(10);
		m3.turnTheCrank();
		System.out.println("---------------------------");
		//turn crank without putting coins
		m3.turnTheCrank();
	}
}


