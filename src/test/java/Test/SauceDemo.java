package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SauceDemo {


    static WebDriver driver;

    public static void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(5000);
    }

    public static void LoginMethod() {
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();
    }

    public static void ProductAdd() {

        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();

    }


    public static void AddtoCart()
    {

         driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();

}
    public static void checkout() {

        driver.findElement(By.name("checkout")).click();

    }
    public static void checkoutInformation () {
        driver.findElement(By.name("firstName")).sendKeys("Rohini");
        driver.findElement(By.name("lastName")).sendKeys("Kamal");
        driver.findElement(By.name("postalCode")).sendKeys("143001");
        driver.findElement(By.name("continue")).click();
    }
    public static void Finish () {

        driver.findElement(By.name("finish")).click();
    }
        public static void main(String[] args) throws InterruptedException {
            setup();
            LoginMethod();
            ProductAdd();
            AddtoCart();
            checkout();
            checkoutInformation ();
            Finish ();
        }
    }

//input[@class='oxd-input oxd-input--active']
//span[text='oxd-text oxd-text--span oxd-main-menu-item--name']

