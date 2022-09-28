import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class flipkart {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://Users//Codoid//Downloads//chromedriver_win32 (3)//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
        element.click();
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//a[text()='Login']")));
        act.perform();
        System.out.println("Completed");
        WebElement element1= driver.findElement(By.xpath("//div[text()='Fashion']"));
        element1.click();
        System.out.println("Fully completed");
        Thread.sleep(10000);
        Actions pack = new Actions(driver);
        pack.moveToElement(driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[3]")));
        System.out.println("Fully completed");
        pack.build().perform();
    }
}
