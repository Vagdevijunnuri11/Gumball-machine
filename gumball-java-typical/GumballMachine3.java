import java.lang.reflect.Method;

public class GumballMachine3 extends GumballMachine implements IGumballMachineSlot{

	public GumballMachine3(int count) {
		super(count);
		setCost(50);
		// TODO Auto-generated constructor stub
	}
	
	public void insertCoin(int value) {
		System.out.println("Insert coin: "+value+" cents.");
		insertCoinValue(value);
		if(coinValue>=cost)
			ejectGumball();
	}
	
	public void returnCoins() {
		System.out.println("Return coins...");
		System.out.println("Change return "+coinValue+" cents.");
		setCoinValue(0);
	}
	
	public void turnCrank() {
		System.out.println("Turn the crank");
		ejectGumball();
	}

	public static void main(String[] args) {
    	GumballMachine3 gm = new GumballMachine3(10);
    	Class gmClass = gm.getClass();
    	Method gmMethods[] = gmClass.getMethods();
    	for(int i=0;i<gmMethods.length;i++) {
    		Method theMethod = gmMethods[1];
    		String method = theMethod.toString();
    		System.out.println(method);
    	}
    }

}
