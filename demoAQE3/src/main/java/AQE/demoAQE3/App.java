package AQE.demoAQE3;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        FirefoxDriver dr=new FirefoxDriver();
        dr.get("http://www.google.co.in");
        dr.manage().window().maximize();
        dr.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("amazon");
        dr.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
        dr.switchTo().newWindow(WindowType.WINDOW);
        
    }
}
