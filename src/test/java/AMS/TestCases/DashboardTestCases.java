package AMS.TestCases;

import AMS.BaseAMC;
import AMS.Pages.DashboardPage;
import AMS.Pages.LoginPage;
import AMS.Pages.UserCreationPage;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DashboardTestCases extends BaseAMC {

    public DashboardTestCases() {
        super();
    }

    @Test
    public void dashBoardPageShouldBeDisplayed() throws InterruptedException {
        DashboardPage dashboardPage = new LoginPage()
                .getEmail("requester@nonrm.com")
                .getpassword("1234")
                .getLoginBtn()
                .expandMenu()
                .getAdmin();
        Assert.assertTrue(dashboardPage.isSQApprovals());
        UserCreationPage userCreationPage = new DashboardPage()
                .getUserCreation();
        Assert.assertTrue(userCreationPage.isSQIdLabel());

    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            takeScreenshot(result.getMethod().getMethodName());
        }

        driver.quit();
    }
}
