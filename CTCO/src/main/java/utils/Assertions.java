package utils;

import org.testng.Assert;

public class Assertions {

    public static void verifyAndQuit(String message, boolean b) {
        try{
            if(!b){
                Assert.fail();
            }
        }
        catch(AssertionError e)
        {
            System.out.println(message);
            e.toString();
            e.printStackTrace();
        }
        finally {
            WebDriverUtils.driver.close();
            WebDriverUtils.driver.quit();
        }
    }
}