package ltd.idcu.junit.testUtils;

import ltd.idcu.junit.utils.Count;
import org.junit.*;

public class TestCount {
    private static Count count;

    @BeforeClass
    public static void beforeClass(){
        count = new Count();
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Count类已经测试完毕");
    }

    @Before
    public void before(){
        System.out.println("开始测试一个新的方法");
    }

    @After
    public void after(){
        System.out.println("又一个方法测试完毕");
    }

    @Test(timeout = 100)
    public void testAdd(){
        int res = count.add(11, 22);
        Assert.assertEquals(33, res);
    }

    @Ignore
    @Test
    public void testSub(){
        int res = count.sub(15, 9);
        Assert.assertEquals(6, res);
    }

    @Test(expected = ArithmeticException.class)
    public void testDepart(){
        int res = count.depart(11, 0);
    }

    @Test
    public void testMulti(){
        int res = count.multi(7, 8);
        Assert.assertEquals(56, res);
    }
}
