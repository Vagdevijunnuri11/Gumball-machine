import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GumballMachineJunit {

	private GumballMachineOne obj;
	private GumballMachineThird obj3;
	
	@Before
	public void setup() {
		obj =  new  GumballMachineOne(10);
		obj3 = new  GumballMachineThird(10);
	}
	
	
	@Test
	public void testAcceptsQuarter() {
		obj.setCoinValue(25);
		obj.ejectGumball();
		assertEquals(0, obj.getCoinValue());
	}
	@Test
	public void testEjectQuarters() {
		obj.setCoinValue(25);
		obj.ejectQuarter();
		assertEquals(0, obj.getCoinValue());
	}
	
	@Test
	public void testNoQuarterTurnCrank() {
		obj.turnCrank();
		assertEquals(0,obj.getCoinValue());
	}
	
	@Test
	public void testAcceptsCoins() {
		obj3.setCoinValue(5);
		assertEquals(5, obj3.getCoinValue());
	}
}
