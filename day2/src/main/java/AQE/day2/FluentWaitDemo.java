package AQE.day2;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

    public static void main(String[] args) {
        // Setup WebDriver (make sure you have the geckodriver executable in your PATH)
        WebDriver driver = new FirefoxDriver();

        // Expected title
        String eTitle = "Demo Guru99 Page";
        String aTitle = "";

        // Open URL and maximize the window
        driver.get("https://demo.guru99.com/test/guru99home/");
        driver.manage().window().maximize();

        // Verify the page title
        aTitle = driver.getTitle();
        if (aTitle.equals(eTitle)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        // Setup FluentWait
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);

        // Locate the element using FluentWait
        WebElement clickSeleniumLink = wait.until(
                new Function<WebDriver, WebElement>() {
                    public WebElement apply(WebDriver driver) {
                        // Provide a valid XPath or locator here
                        return driver.findElement(By.xpath("//a[contains(text(), 'Selenium')]"));
                    }
                });

        // You can now interact with the clickSeleniumLink WebElement, if needed
        // For example: clickSeleniumLink.click();

        // Close the driver
        driver.quit();
    }
}
