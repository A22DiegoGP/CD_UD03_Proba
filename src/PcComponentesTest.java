import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PcComponentesTest{
    WebDriver driver;  
    
    @Before
    public void initdriverchrome() {
        System.setProperty("webdriver.chrome.driver", "/home/sanclemente.local/a22diegogp/Escritorio/CD_UD03_Selenium/driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.boing.es/");

    }

    @Test
    public void proba1() {
        driver.switchTo().parentFrame();

  
       WebElement caixaBusqueda = driver.findElement(By.id("div-gpt-ad--billboard"));
    //     WebElement botonBusqueda = driver.findElement(By.className("sc-ffoxvC"));
    //     caixaBusqueda.sendKeys("MSI GeForce RTX 3060 Ti VENTUS 3X 8GD6X OC 8GB GDDR6X");
    //     botonBusqueda.sendKeys(Keys.ENTER);
     }

}