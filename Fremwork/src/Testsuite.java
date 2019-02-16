import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Testsuite {
    @Test
     public void search()
     {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.argos.co.uk");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.findElement(By.id("searchTerm")).sendKeys("Nike");
        driver.findElement(By.id("SearchTerm")).sendKeys("Enter");
        WebElement actual = driver.findElement(By.cssSelector(".search-title_term"));
         Assert.assertEquals("Nike",actual);

    }

}
