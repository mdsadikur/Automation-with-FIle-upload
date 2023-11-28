package AMS.TestCases;

import AMS.BaseAMC;
import AMS.Pages.DashboardPage;
import AMS.Pages.LoginPage;
import AMS.Pages.UserCreationPage;
import com.thedeanda.lorem.LoremIpsum;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class UserCreationTestCases extends BaseAMC {

    public UserCreationTestCases(){
        super();
    }

    @Test
    public void userCreationPageShouldBeSave() throws InterruptedException {

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
        UserCreationPage userCreationPage1 = new UserCreationPage()
                .getSQId(LoremIpsum.getInstance().getZipCode())
                .getUserName(LoremIpsum.getInstance().getNameMale())
                .getEmail(LoremIpsum.getInstance().getEmail())
                .getPassword(LoremIpsum.getInstance().getPhone())
                .getContactNumber(LoremIpsum.getInstance().getPhone())
                .getJoinDate()
                .getDateOfBirth()
                .getSelectUserType()
                .getSelectUserTypeValue()
                .getSelectGender()
                .getSelectGenderValue()
                .getSelectStuff()
                .getSelectStuffValue()
                .getCompanyName()
                .getCompanyNameValue()
                .getLocationName()
                .getLocationNameValue()
                .getMereitalStatus()
                .getMeretarialStatusValue()
                .getReligion()
                .getReligionValue()
                .getBloodGroup()
                .getBloodGroupValue()
                .getSupervisor()
                .getSupervisorValue()
                .getSaveBtn();

    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            takeScreenshot(result.getMethod().getMethodName());
        }

        driver.quit();
    }
}
