package AMC.TestCases;

import AMC.BaseAMC;
import AMC.Pages.CapexFormPage;
import AMC.Pages.LoginPage;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginTestCase extends BaseAMC {

    public LoginTestCase(){
        super();
    }

    @Test(priority = 1)
    public void loginShouldnotSuccess1() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.getEmail("test1@gmail.com");
        loginPage.getpassword("123456789");
        loginPage.getLoginBtn();
        loginPage.getLoginOkBtn();
    }

    @Test(priority = 2)
    public void loginShouldnotSuccess2() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.getEmail("");
        loginPage.getpassword("123456789");
        loginPage.getLoginBtn();
        loginPage.getLoginOkBtn();
    }

    @Test(priority = 3)
    public void loginShouldnotSuccess3() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.getEmail("");
        loginPage.getpassword("");
        loginPage.getLoginBtn();
        loginPage.getLoginOkBtn();
    }

    @Test(priority = 4)
    public void loginShouldnotSuccess4() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.getEmail("test1@gmail.com");
        loginPage.getpassword("");
        loginPage.getLoginBtn();
        loginPage.getLoginOkBtn();
    }

    @Test(priority = 5)
    public void loginShouldSuccess() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.getEmail("tanzila.prianka@sqgc.com");
        loginPage.getpassword("ta12345");
        loginPage.getLoginBtn();
        loginPage.getLoginOkBtn();
        CapexFormPage capexFormPage = new CapexFormPage();
        Assert.assertTrue(capexFormPage.isCapexFormText());

    }

    @AfterMethod
    public void tearDown(ITestResult result){
        if (ITestResult.FAILURE == result.getStatus()){
            takeScreenshot(result.getMethod().getMethodName());
        }

        driver.quit();
    }
}
