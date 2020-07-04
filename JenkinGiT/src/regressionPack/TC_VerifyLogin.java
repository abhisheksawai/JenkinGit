package regressionPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_VerifyLogin {
	
	@Test
	public void logincheck()
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\Batch Data\\jar\\chrome 84\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.facebook.com/");
		
		System.out.println("added 729");
		System.out.println("added 741");
		System.out.println("added 742");
		System.out.println("added 750 added my name to author");
		System.out.println("added 750 added my name to author ny sanu");
		
		
		String titlefrombrd = "Facebook – log in or sign up";
		String gettitleFromPortal = driver.getTitle();
		System.out.println("actual title " + gettitleFromPortal);

		if(titlefrombrd.equals(gettitleFromPortal))
		{
			System.out.println("tc pass");
			System.out.println("actula is "+titlefrombrd+ " but found on portal"+gettitleFromPortal);
		}
		else
		{
			System.out.println("tc failed");
			System.out.println("actula is "+titlefrombrd+ " but found on portal "+gettitleFromPortal);
		}
		
	
	}

}
