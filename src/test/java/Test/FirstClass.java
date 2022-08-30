package Test;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args)
    {
      System.setProperty("webdriver.chrome.driver","chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.google.com/");
      driver.findElement(By.name("q")).sendKeys("java with Selenium");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.partialLinkText("Selenium & Java Tutorial : How to run Automated Test")).click();
        driver.close();
    }
    }

