package testCalc;

import calc.MyMath;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by FallOutBoy on 20.02.2015.
 */
public class testCalc {

    @DataProvider
    public Object[][]ValidDataProvider(){
        return new Object[][]{
                {5,6},{7,8},
                {8,10},{11,12},
                {13,19},{29,16}
        };
    }

    @BeforeSuite
    public void testBeforeSuite(){
       System.out.println("BeforeSuite");
    }
    @BeforeClass
    public void testBeforeClass(){
        System.out.println("BeforeClass");
    }
    @AfterClass
    public void testAfterClass(){
        System.out.println("AfterClass");
    }
    @BeforeMethod
    public void testBeforeMethod(){
        System.out.println("BeforeMethod");
    }
    @BeforeTest
    public void setUp(){
        System.out.println("BeforeTest");
    }
    @Test
    public void testSum(){
        MyMath calc = new MyMath();
        calc.Init(5,2);
        Assert.assertEquals(8d,calc.plus());
        System.out.println("TestSum");
    }

    @Test(dataProvider = "ValidDataProvider")
    public void testSumProvider(final double x1,final double x2){
        double result = x1+x2;
        MyMath calc = new MyMath();
        calc.Init(x1,x2);
        Assert.assertEquals(result,calc.plus());
    }

    @Test
    public void testMinus(){
        MyMath calc = new MyMath();
        calc.Init(5,2);
        Assert.assertEquals(3d,calc.minus());
        System.out.println("TestMinus");
    }
    @Test
    public void testDiv(){
        MyMath calc = new MyMath();
        calc.Init(4,2);
        Assert.assertEquals(2d,calc.div());
        System.out.println("TestDiv");
    }
    @Test
    public void testMul(){
        MyMath calc = new MyMath();
        calc.Init(5,2);
        Assert.assertEquals(10d,calc.multiply());
        System.out.println("TestMul");
    }
    @AfterTest
    public void testAfterTest(){
        System.out.println("AfterTest");
    }
    @AfterSuite
    public void testAfterSuite(){
        System.out.println("AfterSuite");
    }
    @AfterMethod
    public void testAfterMethod(){
        System.out.println("AfterMethod");
    }

}
