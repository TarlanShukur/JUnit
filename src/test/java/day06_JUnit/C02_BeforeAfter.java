package day06_JUnit;

import org.junit.*;

public class C02_BeforeAfter {

    @BeforeClass
    public static void beforeClass() throws Exception {

        System.out.println("@BeforeClass Class dan once bir kez calisir");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("@Before Her Test metodundan once birkez calisir");
    }

    @Test
    public void test01() {
        System.out.println("Test01 calisti");
    }
    @Test
    public void test02() {
        System.out.println("Test02 calisti");
    }
    @Test
    public void test03() {
        System.out.println("Test03 calisti");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("@After Her test metodundan sonra bir kez calisir");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("AfterClass Class dan sonra bir kez calisir");
    }

}

