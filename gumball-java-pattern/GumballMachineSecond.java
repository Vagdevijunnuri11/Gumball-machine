
public class GumballMachineSecond extends GumballMachine{

	public GumballMachineSecond(int numberGumballs) {
		super(numberGumballs);
		setCostOfGumball(50);
		setOnlyQuarters(true);
	}

	public static void main(String[] args) {
		GumballMachineSecond m2 = new GumballMachineSecond(5);
		// System.out.println("Is only quarters: "+m2.isOnlyQuarters()+" state: "+m2.getState());
		//put 2 quarters and get the gumball
		m2.insertQuarter();
		//System.out.println("After first ins quarter,valOfinsqurt: "+m2.getCoins()+ " state:"+m2.getState());
		m2.insertQuarter();
		m2.turnCrank();
		System.out.println("---------------------------");
		//put 25 cents and ask for 25 cents more
		m2.insertQuarter();
		m2.turnCrank();
		System.out.println("---------------------------");
		//put a coin other than a quarter
		m2.insertNickel();
		System.out.println("---------------------------");
		//turn crank without inserting a quarter
		m2.turnCrank();

	}

}
