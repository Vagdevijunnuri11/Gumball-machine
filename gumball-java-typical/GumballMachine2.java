import java.lang.reflect.Method;

public class GumballMachine2 extends GumballMachine implements IGumballMachineCrank{

	public GumballMachine2(int count) {
		super(count);
		setCost(50);
		// TODO Auto-generated constructor stub
	}
	
	public void insertQuarter() {
		System.out.println("Insert Quarter");
		int val = getCoinValue();
		if(val>=50)
			System.out.println("Gumball only costs two quarter");
		else
			insertCoinValue(25);
	}
	
	public void turnTheCrank() {
		System.out.println("Turn the crank");
		ejectGumball();
	}

	public static void main(String[] args) {
    	GumballMachine2 gm = new GumballMachine2(10);
    	Class gmClass = gm.getClass();
    	Method gmMethods[] = gmClass.getMethods();
    	for(int i=0;i<gmMethods.length;i++) {
    		Method theMethod = gmMethods[1];
    		String method = theMethod.toString();
    		System.out.println(method);
    	}
    	
    	GumballMachine2 m2 = new GumballMachine2(10);
    	m2.insertQuarter();
    	m2.turnTheCrank();
    }
}
