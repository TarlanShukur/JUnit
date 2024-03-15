package day07_Assertion_dropdown_testbase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Assertion {
    WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
    }

    @Test
    public void test01() {

        String actualTitle=driver.getTitle();
        String expectedTitle="YouTube";
        Assert.assertEquals(expectedTitle,actualTitle);

        WebElement logo = driver.findElement(By.xpath("(//*[@id='logo-icon'])[1]"));
        Assert.assertTrue(logo.isDisplayed());

    }

    @Test
    public void test02() {
        WebElement searchBox=driver.findElement(By.xpath("//input[@id='search']"));
        Assert.assertTrue(searchBox.isEnabled());
    }

    @Test
    public void test03() {
        Assert.assertNotEquals("youtube",driver.getTitle());

    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.close();
    }
}

