package testCase;

import org.testng.annotations.Test;
import pageObjects.AccountRegistration;
import pageObjects.BasePage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class Test_001AccountReg extends BaseClass {
   @Test
    void tesScript(){
       HomePage hp = new HomePage(driver);
       hp.performMouseAction();
       AccountRegistration ar = new AccountRegistration(driver);
       ar.setCredential("vikash","kumar","singhvikash533@gmail.com","#Vikash");
       ar.chckRadioButton();
       ar.submitAccountReg();
    }


}
