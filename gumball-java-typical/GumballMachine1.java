import java.lang.reflect.Method;

public class GumballMachine1 extends GumballMachine implements IGumballMachineCrank{

	public GumballMachine1(int count) {
		super(count);
		setCost(25);
		// TODO Auto-generated constructor stub
	}
	
	public void insertQuarter() {
		System.out.println("Insert Quarter");
		int val = getCoinValue();
		if(val>=25)
			System.out.println("Gumball only costs a quarter");
		else
			insertCoinValue(25);
	}
	
	public void turnTheCrank() {
		System.out.println("Turn the crank");
		ejectGumball();
	}

	public static void main(String[] args) {
//    	GumballMachine1 gm = new GumballMachine1(10);
//    	Class gmClass = gm.getClass();
//    	Method gmMethods[] = gmClass.getMethods();
//    	for(int i=0;i<gmMethods.length;i++) {
//    		Method theMethod = gmMethods[1];
//    		String method = theMethod.toString();
//    		System.out.println(method);
//    	}
    	
    	GumballMachine1 m1 = new GumballMachine1(10);
    	m1.insertQuarter();
    	//m1.insertQuarter();
    	m1.turnTheCrank();
    }
}
