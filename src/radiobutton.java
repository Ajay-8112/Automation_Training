import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Users//Codoid//Downloads//chromedriver_win32 (3)//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
        element.click();
        Thread.sleep(5000);
        WebElement element1 = driver.findElement(By.xpath("//label[text()='Female']"));
        element1.click();
            if (element1.isSelected()) {
                System.out.println("Radiobutton is selected");
                }
                else {
                    System.out.println("Radiobutton is not selected");
                }
        WebElement element2 = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
            if (element1.isSelected()) {
                System.out.println("Radiobutton is selected");
                }
                else {
                    System.out.println("Radiobutton is not selected");
                }
        element2.isDisplayed();
        element2.isSelected();

    }
    }
