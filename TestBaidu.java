import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaidu {
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        //System.setProperty("webdriver.chrome.driver", "/Users/ceshi/Driver/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void openEditor() throws InterruptedException {
        driver.get("https://www.baidu.com");
        Thread.sleep(3000);
        driver.findElement(By.id("kw")).sendKeys("菜鸟教程");
        Thread.sleep(2000);
        driver.findElement(By.id("su")).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.close();
    }
}
