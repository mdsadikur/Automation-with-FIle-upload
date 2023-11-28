package AMS.Pages;

import AMS.BaseAMC;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseAMC {

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    WebElement userEmail;

    @FindBy(xpath = "//body/app-root[1]/app-login[1]/div[1]/div[1]/form[1]/div[2]/span[1]/input[1]")
    WebElement userPassword;

    @FindBy(xpath = "//span[contains(text(),'Sign In')]")
    WebElement loginBtn;

//    @FindBy(xpath = "/html/body/div[6]/div[7]/div/button")
//    WebElement loginOkBtn;

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

    public DashboardPage getLoginBtn() throws InterruptedException {
        Thread.sleep(2000);
        loginBtn.isDisplayed();
        loginBtn.click();
        return new DashboardPage();
    }

//    public CapexFormPage getLoginOkBtn() throws InterruptedException {
//        Thread.sleep(2000);
//        loginOkBtn.isDisplayed();
//        loginOkBtn.click();
//        Thread.sleep(2000);
//        return new CapexFormPage();
//    }


}

