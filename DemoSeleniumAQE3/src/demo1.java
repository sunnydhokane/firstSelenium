import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver dr=new FirefoxDriver();
		
		//ChromeDriver ch=new ChromeDriver();
		dr.get("http://www.google.com");
		dr.manage().window().maximize();
		dr.findElement(By.id("APjFqb")).sendKeys("amazon");
		dr.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		dr.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/div/div[2]/div[2]/button")).click();

		dr.findElement(By.xpath("/html/body/div[3]/div/div[12]/div[1]/div[1]/div[2]/div/div[3]/div/div/div/div[1]/a/div[1]/span")).click();
	}

}
