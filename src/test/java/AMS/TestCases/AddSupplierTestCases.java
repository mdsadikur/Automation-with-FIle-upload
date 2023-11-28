package AMS.TestCases;

import AMS.BaseAMC;
import AMS.Pages.*;
import com.thedeanda.lorem.LoremIpsum;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class AddSupplierTestCases extends BaseAMC {

    public AddSupplierTestCases() {
        super();
    }

    @Test
    public void addSupplierPageShouldBeDisplayed() throws InterruptedException, AWTException {

        DashboardPage dashboardPage = new LoginPage()
                .getEmail("requester@supplier.com")
                .getpassword("1234")
                .getLoginBtn();

//        Assert.assertTrue(dashboardPage.isSupplierOnboarding());
        SupplierListPage supplierListPage = new DashboardPage()
                .expandMenu()
                .getMarketingSupplyChain()
                .getSupplierOnboarding()
                .getAddSuppliers();

//        Assert.assertTrue(supplierListPage.isnewPage());
        /*AddSupplierPage addSupplierPage = new SupplierListPage()
                .getNewBtn();*/

//        Assert.assertTrue(addSupplierPage.isSupplierOnboarding());
        AddSupplierPage addSupplierPage1 = new SupplierListPage()
                .getNewBtn()
                .getSelectSBU()
                .getSelectSBUValue()
                .getRequestorName(LoremIpsum.getInstance().getNameMale())
                .getSupplierLegalEntityName(LoremIpsum.getInstance().getNameMale())
                .getRegisteredAddress(LoremIpsum.getInstance().getStateFull())
                .getSupplierContactDesignation(LoremIpsum.getInstance().getWords(2))
                .getSupplierContactPhone(LoremIpsum.getInstance().getPhone())
                .getSupplierContactEmail(LoremIpsum.getInstance().getEmail())
                .getBillingAddress(LoremIpsum.getInstance().getStateFull())
                .getSelectAgreedCreditTerm()
                .getSelectAgreedCreditTermValue()
                .getFactoryName(LoremIpsum.getInstance().getTitle(2))
                .getFactoryAddress(LoremIpsum.getInstance().getCity())
                .getContactPersonName(LoremIpsum.getInstance().getNameMale())
                .getContactPersonDesignation(LoremIpsum.getInstance().getWords(2))
                .getContactPersonPhoneNo(LoremIpsum.getInstance().getPhone())
                .getContactPersonEmail(LoremIpsum.getInstance().getEmail())
                .getHeaderAction()
                .getCountryOfOrigin(LoremIpsum.getInstance().getCountry())
                .getYearlyBusinessVolume("4")
                .getYearOfExperienceInThisBusiness("3")
                .getNumberOfFactories("12")
                .getNumberOfHeadcounts("1443")
                .getMajorCustomers("22324")
                .bankInformation()
                .getBankName(LoremIpsum.getInstance().getWords(2))
                .getBranch(LoremIpsum.getInstance().getWords(2))
                .getBankAddress(LoremIpsum.getInstance().getCity())
                .getBankAccountNo(LoremIpsum.getInstance().getPhone())
                .getBankRoutingNo(LoremIpsum.getInstance().getWords(2))
                .getBankAccountType(LoremIpsum.getInstance().getPhone())
                .getSwiftCode(LoremIpsum.getInstance().getWords(2))
                .getUploadFile()
                .getTaxInformation()
                .getTradeLicenseNo(LoremIpsum.getInstance().getPhone())
                .getTaxIdentificationNo(LoremIpsum.getInstance().getPhone())
                .getTaxRegistrationNo(LoremIpsum.getInstance().getPhone())
                .getVatCertificateFile()
                .getTinCertificateFile()
                .getOtherInformation()
                .getComments(LoremIpsum.getInstance().getWords(5))
                .getTradeLicenseFile()
                .getBondLicenseFile()
                .getSaveBtn()
                .getSubmitBtn();
//        Assert.assertTrue(addSupplierPage1.isSuccessMsgDisplayed());


    }
}
