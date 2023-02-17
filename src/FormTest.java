import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormTest{

    WebDriver driver;

    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "/home/sanclemente.local/a22diegogp/Escritorio/CD_UD03_Selenium/driver/chromedriver");
        driver = new ChromeDriver();

    }

    @Test
    public void testCombo() {

        driver.get("file:///home/sanclemente.local/a22diegogp/Escritorio/CD_UD03_Selenium/src/index.html");
        driver.findElement(By.tagName("input")).getAttribute("type");  
        
    }
    @Test
    public void test1() {
        driver.get("file:///home/sanclemente.local/a22diegogp/Escritorio/CD_UD03_Selenium/src/index.html");
        WebElement pinha = driver.findElement(By.name("pinha")); 
        WebElement sin_pinha = driver.findElement(By.name("sin_pinha")); 
        pinha.click();
        sin_pinha.click();
        assertEquals(true, pinha.isSelected());
        assertEquals(false, sin_pinha.isSelected()); 
        
    }
    @Test
    public void testRadio() {
        driver.get("file:///home/sanclemente.local/a22diegogp/Escritorio/CD_UD03_Selenium/src/index.html");
        // WebElement masafina = driver.findElement(By.cssSelector("[name='boton' value='1']")); 
        // masafina.click();
        // WebElement masagruesa = driver.findElement(By.xpath("//input[@name='boton' and @value='2']"));
        // masagruesa.click();

    }
    @Test
    public void testComo() {
        driver.get("file:///home/sanclemente.local/a22diegogp/Escritorio/CD_UD03_Selenium/src/index.html");
        Select menu = new Select(driver.findElement(By.name("menu")));
        menu.selectByIndex(0);
        menu.selectByValue("2");
        menu.selectByVisibleText("Tres");
    }
}