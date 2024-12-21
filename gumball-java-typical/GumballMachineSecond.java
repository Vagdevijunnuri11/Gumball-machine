
//Gumball machine two - Accepts two quarter - 50 cents for one gumball

public class GumballMachineSecond extends GumballMachineParent implements IGumballMachineCommon{

	
	public GumballMachineSecond(int noOfGumballs) {
		super(noOfGumballs);
		setCostOfGumball(50);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insertQuarter(int coinVal) {
		// TODO Auto-generated method stub
		System.out.println("Insert Quarter");
		if(coinVal>=50) {
			System.out.println("You have inserted 50 cents");
		}
		else if(coinVal!=25){
			System.out.println("Machine accepts only two quarters for a gumball!");
		}else {
			totalCoinValue(coinVal);
		}		
	}
	
	@Override
	public void ejectQuarter() {
		System.out.println("Hey,you don't want gumball!!Please collect your quarters");
		setCoinValue(0);		
	}


	@Override
	public void turnCrank() {
		System.out.println("Turned the crank");
		ejectGumball();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GumballMachineSecond m2 = new GumballMachineSecond(10);
		//put 2 quarters and get the gumball
		m2.insertQuarter(25);
		m2.insertQuarter(25);
		m2.turnCrank();
		System.out.println("---------------------------");
		//put 25 cents and ask for 25 cents more
		m2.insertQuarter(25);
		m2.turnCrank();
		System.out.println("---------------------------");
		//put a coin other than a quarter
		m2.insertQuarter(10);
		System.out.println("---------------------------");
		//test eject quarter
		m2.insertQuarter(25);
		m2.insertQuarter(25);
		m2.ejectQuarter();
		System.out.println("---------------------------");
		//turn crank without inserting a quarter
		m2.turnCrank();
	}
}
