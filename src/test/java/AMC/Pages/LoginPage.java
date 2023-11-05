package AMC.Pages;

import AMC.BaseAMC;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseAMC {

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user_email")
    WebElement userEmail;

    @FindBy(id = "user_password")
    WebElement userPassword;

    @FindBy(id = "login_button")
    WebElement loginBtn;

    @FindBy(xpath = "/html/body/div[6]/div[7]/div/button")
    WebElement loginOkBtn;

    public LoginPage getEmail(String userEmailno){
        userEmail.isDisplayed();
        userEmail.clear();
        userEmail.sendKeys(userEmailno);
        return this;
    }

    public LoginPage getpassword(String userPasswordno){
        userPassword.isDisplayed();
        userPassword.clear();
        userPassword.sendKeys(userPasswordno);
        return this;
    }

    public LoginPage getLoginBtn(){
        loginBtn.isDisplayed();
        loginBtn.click();
        return this;
    }

    public CapexFormPage getLoginOkBtn() throws InterruptedException {
        Thread.sleep(2000);
        loginOkBtn.isDisplayed();
        loginOkBtn.click();
        Thread.sleep(2000);
        return new CapexFormPage();
    }


}

