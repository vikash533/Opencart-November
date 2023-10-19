package testCase;

import org.testng.annotations.Test;
import pageObjects.BasePage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class AccountReg extends BaseClass {
   @Test
    void tesScript(){
       HomePage hp = new HomePage(driver);
       hp.performMouseAction();
    }


}
