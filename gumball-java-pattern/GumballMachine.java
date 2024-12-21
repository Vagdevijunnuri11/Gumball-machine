

public class GumballMachine implements IGumballMachine{
 
	State soldOutState;
	State noCoinsState;
	State hasCoinsState;
	State soldState;
 
	State state = soldOutState;
	 protected int noOfGumballs = 0;
	 protected int valueOfCoins = 0;
	 protected int costOfGumball = 0;
	 protected boolean onlyQuarters = false;
	 
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noCoinsState = new NoCoinsState(this);
		hasCoinsState = new HasCoinsState(this);
		soldState = new SoldState(this);

		this.noOfGumballs = numberGumballs;
	 	if (numberGumballs > 0) {
				state = noCoinsState;
		} 
	}
	 
	public int getNoOfGumballs() {
		return noOfGumballs;
	}

	public void setNoOfGumballs(int noOfGumballs) {
		this.noOfGumballs = noOfGumballs;
	}

	public boolean isOnlyQuarters() {
		return onlyQuarters;
	}

	public void setOnlyQuarters(boolean onlyQuarters) {
		this.onlyQuarters = onlyQuarters;
	}
	
	public int getCostOfGumball() {
		return costOfGumball;
	}

	public void setCostOfGumball(int costOfGumball) {
		this.costOfGumball = costOfGumball;
	}

	public void setCoins(int v) {
		valueOfCoins = v;
	}
	
	public int getCoins() {
		return valueOfCoins;
	}
 
	public void insertNickel() {
		state.insertCoin(5);
	}
	
	public void insertDime() {
		state.insertCoin(10);
	}
	
	public void insertQuarter() {
		state.insertCoin(25);
	}
 
	public void ejectQuarter() {
		state.ejectCoin();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (noOfGumballs != 0) {
			noOfGumballs = noOfGumballs - 1;
		}
	}
 
	int getnoOfGumballs() {
		return noOfGumballs;
	}
 
	void refill(int count) {
		this.noOfGumballs = count;
		state = noCoinsState;
	}

    public State getState() {
        return state;
    }
    
    public State getHasCoinsState() {
    	return hasCoinsState;
    }
    
    public State getNoCoinsState() {
    	return noCoinsState;
    }
    
    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + noOfGumballs + " gumball");
		if (noOfGumballs != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
