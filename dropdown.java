import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Users//Codoid//Downloads//chromedriver_win32 (3)//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement element = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
        element.click();
        Thread.sleep(5000);
        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        Select daysel = new Select(day);
        daysel.selectByVisibleText("8");

        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select monthsel = new Select(month);
        monthsel.selectByValue("11");

        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        Select yearsel = new Select(year);
        yearsel.selectByIndex(22);

    }
}