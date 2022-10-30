package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa.taltektc.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("email")).sendKeys(new CharSequence[]{"ttina@gmail.com"});
        driver.findElement(By.name("password")).sendKeys(new CharSequence[]{"Cupcake12!"});
        driver.findElement(By.xpath("//*[@value='Log In']")).click();
    }
}
