import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webauto {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://Users//Codoid//Downloads//chromedriver_win32 (3)//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.navigate().to("https://app.insight360.io/");
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.xpath("//input[@name='username']"));
        element.sendKeys("immanuel@codoid.com");
        WebElement element1 = driver.findElement(By.xpath("//input[@name='loginPassword']"));
        element1.sendKeys("Codoid@123");
        WebElement element2 = driver.findElement(By.xpath("//button[@value='Login']"));
        element2.click();
        Thread.sleep(2000);
        WebElement element3 = driver.findElement(By.xpath("//a[@class='search-button header-icon icon icon-Overlays-Company medium']"));
        element3.click();
        WebElement element4 = driver.findElement(By.xpath("//input[@placeholder='Search by Ticker, ISIN, or Company Name']"));
        element4.sendKeys("AAPL");
//        Thread.sleep(10000);
//        WebElement element5 = driver.findElement(By.xpath("//div[@class='toggle']"));
//        element5.click();
//        Thread.sleep(15000);
//        element6.click();
        //driver.findElement(By.className("gb_d")).click();
        //s = driver.getCurrentUrl();
        //System.out.println("varibale: " + s);
        //driver.get(s);
    }
}