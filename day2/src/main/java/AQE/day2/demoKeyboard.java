package AQE.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class demoKeyboard {
    public static void main(String[] args) {
        String baseUrl = "https://www.facebook.com/";

        // Set the path to chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get(baseUrl);

        // Locate the username field
        WebElement txtUsername = driver.findElement(By.id("email"));

        // Initialize Actions class
        Actions builder = new Actions(driver);

        // Perform series of actions
        Action seriesOfAction = builder.moveToElement(txtUsername)
                .click()
                .keyDown(txtUsername, Keys.SHIFT)
                .sendKeys(txtUsername, "hello") // Type "hello" with Shift key held down
                .keyUp(txtUsername, Keys.SHIFT)
                .doubleClick(txtUsername) // Double click on the username field
                .contextClick() // Right click (context click) on the username field
                .build();

        seriesOfAction.perform();

        // Close the browser
        driver.quit();
    }
}
