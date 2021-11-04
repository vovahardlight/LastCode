import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

public class CityNewYorkTest {
    @Test
    public void Test(){
        WebDriverManager.chromedriver().browserVersion("4.0.0-beta-2").setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.booking.com/index.en-gb.html?aid=397594;label=gog235jc-1DCAEoggI46AdIM1gDaOkBiAEBmAEJuAEXyAEM2AED6AEBiAIBqAIDuAKOiPiGBsACAdICJDY1ZWJmOWUxLTQ5YzctNDU0Zi1iNDY4LTdjZGQ2NmY5OTU4MNgCBOACAQ;sid=40c661e2b81ef25af1bcaa255a01dfab;keep_landing=1&sb_price_type=total&");
        driver.findElement(By.xpath("//input[@id='ss']")).click();
        driver.findElement(By.xpath("//input[@id='ss']")).sendKeys("New York");
        WebElement date = driver.findElement(By.xpath("//span[contains(@data-placeholder,'Check-in month')]"));
        date.click();
        WebDriverWait wait = new WebDriverWait(driver,40);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='1 September 2021']")));
        driver.findElement(By.xpath("//span[@aria-label='1 September 2021']")).click();
        driver.findElement(By.xpath("//span[@aria-label='30 September 2021']")).click();
        driver.findElement(By.xpath("//button[@data-sb-id='main']")).click();

    }
}
