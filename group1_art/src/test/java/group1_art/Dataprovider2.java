package group1_art;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider2 {
  @Test
  
  
  @DataProvider(name = "reg")
	public String[][] getdata()
	{
		String[][] data = new String[5][4];
		data[0][0] = "myfname";
		data[1][0] = "mylname";
		data[2][0] = "abcdef@gmail.com";
		data[3][0] = "98675465378";
		data[4][0] = "abcdef";
		
		data[0][1] = "myfname";
		data[1][1] = "mylname";
		data[2][1] = "abcdef@gmail.com";
		data[3][1] = "98675465378";
		data[4][0] = "abcdef";
		return data;
	}
  public void f() {
  }
}
