package group1_art1;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class testng1 {

	@BeforeClass
	public void launchbrowser() {
		System.out.println("Launch the chrome browser");
		Assert.assertEquals(true, false);
		Assert.assertEquals("hi", "hoiii");
		String str1 = "hello";
		Assert.assertTrue(str1.contains("hello"));
		Assert.assertFalse(false);
	}
}
