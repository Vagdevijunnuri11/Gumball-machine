
public class GumballMachineThird extends GumballMachine{

	public GumballMachineThird(int numberGumballs) {
		super(numberGumballs);
		setCostOfGumball(50);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		GumballMachineThird m3 = new GumballMachineThird(5);
		
		//put 2 quarters and get the gumball
		m3.insertQuarter();
		m3.insertQuarter();
		m3.turnCrank();
		System.out.println("---------------------------");
		
		//put only one quarter
		m3.insertQuarter();
		m3.turnCrank();
		System.out.println("---------------------------");
		
		//one dime one nickel one quarter one dime and get a gumball
		m3.insertDime();
		m3.insertNickel();
		m3.insertQuarter();
		m3.insertDime();
		m3.turnCrank();
		System.out.println("---------------------------");
		
		//return change
		m3.insertQuarter();
		m3.insertQuarter();
		m3.insertDime();
		m3.turnCrank();
		System.out.println("---------------------------");
		
		//eject coins
		m3.insertQuarter();
		m3.ejectQuarter();
		System.out.println("---------------------------");
		
		//turn crank without putting coins
		m3.turnCrank();
		
	}
}
