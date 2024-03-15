package day07_Assertion_dropdown_testbase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C03_DropdownMenu {
    WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
    }

    @Test
    public void test01() {
        WebElement yil = driver.findElement(By.xpath("//select[@id=\"year\"]"));
        WebElement ay = driver.findElement(By.xpath("//select[@id=\"month\"]"));
        WebElement gun = driver.findElement(By.xpath("//select[@id=\"day\"]"));

        Select selectYil = new Select(yil);
        Select selectAy = new Select(ay);
        Select selectGun = new Select(gun);

        selectYil.selectByIndex(5);
        selectAy.selectByValue("4");
        selectGun.selectByVisibleText("15");

    }

    @Test
    public void test02() {
        WebElement eyaletlerDropDown = driver.findElement(By.xpath("//*[@id=\"state\"]"));
        Select select = new Select(eyaletlerDropDown);
        List<WebElement> eyaletlerListesiWebElementler=select.getOptions();
        for ( WebElement w:eyaletlerListesiWebElementler ) {
            System.out.println(w.getText());
        }


    }

    @Test
    public void test03() {
        List<WebElement> eyaletlerListesiWebElementler=driver.findElements(By.xpath("//*[@id=\"state\"]/option"));


    }

    @Test
    public void test04() {
        WebElement eyaletlerDropDown = driver.findElement(By.xpath("//*[@id=\"state\"]"));
        Select select = new Select(eyaletlerDropDown);
        String expectedOption = "Select a State";
        String actualOption = select.getFirstSelectedOption().getText();
        System.out.println(actualOption);
        Assert.assertEquals(expectedOption,actualOption);

    }

    @Test
    public void test05() {
        WebElement eyaletlerDropDown = driver.findElement(By.xpath("//*[@id=\"state\"]"));

        eyaletlerDropDown.sendKeys("Alabama");
    }

    @After
    public void tearDown() throws Exception {
        driver.close();
    }
}


