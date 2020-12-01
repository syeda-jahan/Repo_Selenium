package TestPkg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFile {

    // Annotation
    @Test
    public void method1(){
        System.out.println("Hello World!");
        /**
         * 1. launch website
         * 2. Enter username
         * 3. Enter Password
         * 4. Click Login
         * 5. Verify user is home screen
         */
       int a = 10;
       int b = 20;
       boolean res = b<a;
       //Assert.assertTrue(res, "res is not expected");
        Assert.assertEquals(b,a,"a & b are not equal to each other");

    }

    @Test
    public void method2(){
        System.out.println("Method2");
    }
}
