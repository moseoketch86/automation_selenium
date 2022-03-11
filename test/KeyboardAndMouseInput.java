import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER-PC\\Downloads\\chromedriver.exe");
        // create a webdriver object
        WebDriver driver = new ChromeDriver();
        // waits
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
       // open website
        driver.get("https://formy-project.herokuapp.com/keypress");
        // close website
        // get web element
        WebElement name = driver.findElement(By.id("name"));
        // click the input element
        name.click();
        // send name to input
        name.sendKeys("my name is nemesis");
        // button element
        WebElement button = driver.findElement(By.id("button"));
        driver.quit();
    }
}
