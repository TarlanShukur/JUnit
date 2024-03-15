package day07_Assertion_dropdown_testbase;

import org.junit.Assert;
import org.junit.Test;

public class C01_Assertion {

    @Test
    public void test01() {
        String expectedData ="selenium";
        String actualData = "selenium";
        Assert.assertEquals(expectedData,actualData);
    }

    @Test
    public void test02() {
        Assert.assertTrue("selenium".contains("e"));
    }

    @Test
    public void test03() {
        Assert.assertFalse("JAVA".contains("E"));

        Assert.assertFalse("SELENIUM".contains("E"));
        System.out.println("test03 method ici calisma durdu");
    }

    @Test
    public void test04() {
        Assert.assertNotEquals("SELENIUM","JAVA");
        Assert.assertNotEquals("SELENIUM","SELENIUM");

    }
}
