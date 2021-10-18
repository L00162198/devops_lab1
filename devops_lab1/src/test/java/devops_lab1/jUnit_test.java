package devops_lab1;

import static org.junit.Assert.*;
import org.junit.Test;



public class jUnit_test {

	@Test
	public void testConcatenate() {
	

		{
			unit unit = new unit ();
			
			String result = unit.concatenate("one","two");
			
			assertEquals("onetwo", result);
			
		}

	}
}
