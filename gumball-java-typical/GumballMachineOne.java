//Gumball Machine 1 - Accepts One Quarter - 25 cents for one gumball.

public class GumballMachineOne extends GumballMachineParent implements IGumballMachineCommon{

	public GumballMachineOne(int noOfGumballs) {
		super(noOfGumballs);
		setCostOfGumball(25);
	}

	@Override
	public void insertQuarter(int coinVal) {
		// TODO Auto-generated method stub
		System.out.println("Insert Quarter");
		//int coinValue = getCoinValue();
		if(coinVal>=25) {
			totalCoinValue(coinVal);
		}else{
			System.out.println("Gumball machine accepts only a quarter");
		}		
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Hey,you don't want gumball!!Please collect your quarter");
		setCoinValue(0);
	}

	@Override
	public void turnCrank() {
		System.out.println("Turned the crank");
		ejectGumball();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GumballMachineOne m1 = new GumballMachineOne(10);
		//insert a quarter and get a gumball
		m1.insertQuarter(25);
		m1.turnCrank();
		System.out.println("---------------------------");
		//insert a quarter and take it back without turn crank
		m1.insertQuarter(25);
		m1.ejectQuarter();
		System.out.println("---------------------------");
		//insert other than quarter
		m1.insertQuarter(10);
		System.out.println("---------------------------");
		//turn crank without inserting a quarter
		m1.turnCrank();

	}
}
