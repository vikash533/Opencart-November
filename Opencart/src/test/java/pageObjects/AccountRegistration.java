package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistration extends BasePage {

    public AccountRegistration(WebDriver driver) {
        super(driver);
    }
    @FindBy(name = "firstname")
    public WebElement txt_firstName;
    @FindBy(name = "lastname")
    public WebElement txt_lastName;
    @FindBy(name = "email")
    public WebElement txt_email;
    @FindBy(name = "password")
    public WebElement txt_password;
    @FindBy(name = "newsletter")
    public WebElement radio_button;
    @FindBy(name = "agree")
    public WebElement chekbox;
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    public WebElement submitButton;
    public void setCredential(String fisrtName,String lastName,String email,String password){
        txt_firstName.sendKeys(fisrtName);
        txt_lastName.sendKeys(lastName);
        txt_email.sendKeys(email);
        txt_password.sendKeys(password);
    }
    public void chckRadioButton(){
        radio_button.click();
    }
    public void submitAccountReg(){
        chekbox.click();
        submitButton.click();
    }
}
