import java.lang.reflect.Method;

//Machine#1 which requires 25 cents for one gumball.Accepts Only Quarters.

public class GumballMachine
{

    protected int cnt = 0;
    protected int coinValue = 0;
    protected int cost = 0;
    
    public GumballMachine(int count){
        this.cnt = count;
    }
    
    public void displayConfig(){
        System.out.println("Gumball inventory: " +cnt);
        System.out.println("Gumball cost: " +cost);
        System.out.println("Coin value inventory: " +coinValue);

    }

    protected void setCoinValue(int v) {
    	coinValue = v;
    }
    protected int getCoinValue() {
    	return coinValue;
    }
    
    protected void setCost(int c) {
    	cost = c;
    }
    protected int getCost() {
    	return cost;
    }
    
    protected void insertCoinValue(int v) {
    	System.out.println("Added " +v+ " cents... ");
    	setCoinValue(coinValue + v);
    }
    
    protected void ejectGumball() {
    	if(coinValue < cost) {
    		System.out.println("Not enough money");
    		return;
    	}
    	if(cnt > 0) {
    		cnt--;
    		System.out.println("Gumball ejected!");
    		System.out.println("Change return: "+(coinValue-cost)+ " cents.");
    		coinValue=0;
    	}
    	else {
    		System.out.println("Sorry! Out of gumballs");
    	}
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
//    public GumballMachine( int size, int coin )
//    {
//        // initialise instance variables
//        this.num_gumballs = size;
//        this.insertCoin = coin;
//        this.has_quarter = false;
//        this.has_nickel = false;
//        this.has_dime = false;
//    }
//    
//    public GumballMachine(int size, int quarter1,int quarter2) {
//    }
//
//    public void insertQuarter(int coin)
//    {
//        if ( coin == 25 )
//            this.has_quarter = true ;
//        else 
//            this.has_quarter = false ;
//    }
//    
//    public void insertNickel(int coin) {
//    	if(coin == 5)
//    		this.has_nickel=true;
//    	else
//    		this.has_nickel=false;
//    }
//    
//    public void insertDime(int coin) {
//    	if(coin == 10)
//    		this.has_dime=true;
//    	else
//    		this.has_dime=false;
//    }
//    
//    public int coinValue(int coin) {
//    	int totalCoins=0;
//    	totalCoins=totalCoins+coin;
//    	return totalCoins;
//    }
//    
//    public void turnCrank()
//    {
//        if ( this.has_quarter || this.has_nickel || this.has_dime)
//        {
//            if ( this.num_gumballs > 0 )
//            {
//                this.num_gumballs-- ;
//                this.has_quarter = false ;
//                this.has_nickel = false;
//                this.has_dime = false;
//                System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
//            }
//            else
//            {
//                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
//            }
//        }      
//    }
}
