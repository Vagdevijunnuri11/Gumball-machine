import java.lang.reflect.Method;

//Parent class for all 3 models of gumball machines


public class GumballMachineParent {
	
	
	protected int noOfGumballs = 0;
	protected int coinValue = 0;
	protected int costOfGumball = 0;
	
	public GumballMachineParent(int noOfGumballs) {
		// TODO Auto-generated constructor stub
		this.noOfGumballs = noOfGumballs;
	}

	
	protected int getCoinValue() {
		return coinValue;
	}


	protected void setCoinValue(int coinValue) {
		this.coinValue = coinValue;
	}
	
	protected void totalCoinValue(int value) {
		System.out.println("You have inserted "+value+" cents");
		setCoinValue(coinValue + value);
	}

	protected void ejectGumball() {
		if(coinValue < costOfGumball) {
			int due = costOfGumball - coinValue;
			System.out.println("Insufficient money. Please put "+due+" cents more");
		}
		else if(noOfGumballs>0) {
			noOfGumballs--;
			System.out.println("Here is your gumball!!");	
		}
		coinValue = 0;
	}

	protected int getCostOfGumball() {
		return costOfGumball;
	}


	protected void setCostOfGumball(int costOfGumball) {
		this.costOfGumball = costOfGumball;
	}
	
	public static void main(String[] args) {
		GumballMachine gm = new GumballMachine(10);
    	Class gmClass = gm.getClass();
    	Method gmMethods[] = gmClass.getMethods();
    	for(int i=0;i<gmMethods.length;i++) {
    		Method theMethod = gmMethods[1];
    		String method = theMethod.toString();
    		System.out.println(method);

	}
  }
}
