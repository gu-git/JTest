package com.junit.test;
import static org.junit.Assert.*;  
import com.junit.project.*;  
import org.junit.Test;  
import junit.framework.TestCase;
public class CalculationTest extends TestCase{
	private int value1;
	 private int value2;
	 
	 
	  @Test  
	     public void testFindMax(){  
	         assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));  
	         assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));  
	     } 
	  
	  protected void setUp() throws Exception {
	   super.setUp();
	   value1 = 3;
	   value2 = 5;
	   
	   }
	  
	  protected void tearDown() throws Exception {
	   super.tearDown();
	   value1 = 0;
	   value2 = 0;
	   }
	  
	  public void testAdd() {
	   int total = 8;
	   int sum = Calculation.add(value1, value2);
	   assertEquals(sum, total);
	   }
	  
	   public void testFailedAdd() {
	   int total = 9;
	   int sum = Calculation.add(value1, value2);
	   assertNotSame(sum, total);
	   }
	   
	   public void testSub() {
	   int total = 0;
	   int sub = Calculation.sub(4, 4);
	   assertEquals(sub, total);
	   }

}
