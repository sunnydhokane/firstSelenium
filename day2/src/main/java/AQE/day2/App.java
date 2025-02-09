package AQE.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WebDriver driver =new FirefoxDriver();
        
        driver.get("https://demo.guru99.com/test/radio.html");	
        WebElement radio1= driver.findElement(By.id("vfb-7-1"));
        WebElement radio2= driver.findElement(By.id("vfb-7-2"));
        
        radio1.click();
        
        radio2.click();
        System.out.println("Radio Button Option 2 selected");
        
        WebElement option1= driver.findElement(By.id("vfb-6-0"));
        WebElement option2= driver.findElement(By.id("vfb-6-1"));
        option1.click();
        
        //check whether the check box is toggled on
        if(option1.isSelected()) {
        	System.out.println("Checkbox is toggled on");
        }
        else {
        	System.out.println("Checkbox is Toggled off");
        	
        }
        
        //selecting checkbox and using isSlected method
        driver.get("https://demo.guru99.com/test/facebook.html");
        	WebElement chkFBPersist= driver.findElement(By.id("persist_box"));
        	for(int i=0; i<2; i++) {
        		chkFBPersist.click();
        		System.out.println("Facebook Persists Checkbox status is- "+chkFBPersist.isSelected());
        	}
        	//driver.close();
        
        
        
        
    }
}
