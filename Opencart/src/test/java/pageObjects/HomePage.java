package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage{
    public Actions actions;
    public HomePage(WebDriver driver){
        super(driver);
        this.actions = new Actions(driver);
    }
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    public WebElement lnkMyAccount;

    @FindBy(xpath = "//a[normalize-space()='Register']")
    public WebElement lnkRegerterAccount;

    public void performMouseAction(){
        actions.moveToElement(lnkMyAccount).click().perform();
        actions.moveToElement(lnkRegerterAccount).click().perform();
    }
}
