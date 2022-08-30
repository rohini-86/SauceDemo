package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHr {
    static WebDriver driver;

    public static void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
    }

    public static void LoginMethod() {
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button")).click();
    }

    public static void searchbar()
    {
        driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']" )).sendKeys("Admin");
        driver.findElement(By.xpath("//span[text='Admin']" )).click();

    }
    public static void main(String[] args) throws InterruptedException {
        setup();
        LoginMethod();
        searchbar();
    }
}
//input[@class='oxd-input oxd-input--active']
//span[text='oxd-text oxd-text--span oxd-main-menu-item--name']