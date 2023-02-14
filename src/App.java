import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver"); 
        WebDriver driver = new ChromeDriver();  
        try {
            driver.get("https://es.wikipedia.org");
            WebElement cajaBusqueda = driver.findElement(By.id("searchInput"));
            /*cajaBusqueda.sendKeys("Selenium");
            System.out.println(driver.getTitle()); 
            driver.findElement(By.id("n-portal")).click();

            WebElement tituloPagina = driver.findElement(By.id("firstHeading"));
            System.out.println(tituloPagina.getText());
            assertEquals("Portal:Comunidad", tituloPagina.getText());
            WebElement footer = driver.findElement(By.tagName("footer"));
            System.out.println(footer.getAttribute("role"));

            List<WebElement> elementosDiv = driver.findElements(By.tagName("div"));
            for (WebElement webElement : elementosDiv) {
                System.out.println(webElement.getText());
            }*/
            WebElement caja2Busqueda = driver.findElement(By.id("searchInput"));
            WebElement botonBusqueda = driver.findElement(By.id("searchButton"));
            caja2Busqueda.sendKeys("Taragoña");
            botonBusqueda.sendKeys(Keys.ENTER);

            assertEquals("Taragoña", "Taragoña");


            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO: handle exception
        }

        driver.quit();
    }
        @Test
        public void test_checkbox() {
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver"); 
            WebDriver driver = new ChromeDriver();
            driver.get("./index.html");
        }
    
    
}