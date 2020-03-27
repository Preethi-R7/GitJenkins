package Sample;

import org.junit.Assert;


public class Test {

	@org.testng.annotations.Test
	public void validate(){
		
	Sample sample = new Sample();
	String check=sample.print();
	System.out.println("Printing variable check:"+check);
	
	Assert.assertTrue("Git-Integration successful",check.contains("success"));
	}
}
