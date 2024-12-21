
public class GumballMachineOne extends GumballMachine{

	public GumballMachineOne(int numberGumballs) {
		super(numberGumballs);
		setCostOfGumball(25);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		GumballMachineOne m1 = new GumballMachineOne(5);
		//put a quarter and get gumball
		m1.insertQuarter();
		m1.turnCrank();		
		System.out.println("---------------------------");
		//put a quarter and take it back without turn crank
		m1.insertQuarter();
		m1.ejectQuarter();
		System.out.println("---------------------------");
		//insert other than quarter
		m1.insertDime();
		System.out.println("---------------------------");
		//turn crank without putting a quarter
		m1.turnCrank();
		//ejectcoin in no coins state
		System.out.println("---------------------------");
		m1.ejectQuarter();
		//test sold out state
		System.out.println("---------------------------");
		m1.setNoOfGumballs(0);
		m1.insertQuarter();
		m1.turnCrank();
	}
}
