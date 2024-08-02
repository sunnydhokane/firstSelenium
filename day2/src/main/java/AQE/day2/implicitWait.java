package AQE.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class implicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String eTitle="Demo Guru99 Page";
		String aTitle="";
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		aTitle=driver.getTitle();
		if(aTitle.equals(eTitle)) {
			System.out.println("test passed");
		}
		else {
			System.out.println("test failed");
		}
		
		
		

	}

}
