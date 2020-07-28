package data;

import org.testng.annotations.DataProvider;

public class DataForTesting {
	  @DataProvider(name = "data") 
	  public Object [][] dataForPost() {
		  
		  
	  Object [][] data = new Object[1][3] ; data[0][0]="Malek"; data[0][1]="Pilot";
	  data[0][2]=22;
	  
	  
	  return new Object[][] { {"HodaIbrahim","stylist",212121}
	  
	  }; }
	 

	@DataProvider(name = "id")
	public Object[] dataForDelete() {
		return new Object[] { 21212, 2121,212121 };

	}

}
