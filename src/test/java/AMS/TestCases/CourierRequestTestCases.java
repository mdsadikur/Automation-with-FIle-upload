package AMS.TestCases;

import AMS.BaseAMC;
import AMS.Pages.CourierRequestPage;
import AMS.Pages.DashboardPage;
import AMS.Pages.LoginPage;
import AMS.Pages.UserCreationPage;
import com.thedeanda.lorem.LoremIpsum;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class CourierRequestTestCases extends BaseAMC {

    public CourierRequestTestCases() {
        super();
    }

    @Test
    public void courierRequestShouldnSuccess() throws InterruptedException, AWTException {
        DashboardPage dashboardPage = new LoginPage()
                .getEmail("requester@nonrm.com")
                .getpassword("1234")
                .getLoginBtn()
                .expandMenu();

        CourierRequestPage courierRequestPage = new DashboardPage()
                .getShippingLogistics()
                .getCourier()
                .getCourierRequest();
        Assert.assertTrue(courierRequestPage.isCourierRequest());
        CourierRequestPage courierRequestPage1 = new CourierRequestPage()
                .getChooseSBU()
                .getChooseSBUvalue()
                .getConstCenter()
                .getConstCenterValue()
                .getChooseType()
                .getChooseTypeValue()
                .getItemType()
                .getItemTypeValue()
                .getItemDescription(LoremIpsum.getInstance().getWords(10))
                .getCustomerBrand()
                .getCustomerBrandValue()
                .getDestinationCountry()
                .getDestinationCountryValue()
                .getChooseSeason()
                .getChooseSeasonValue()
                .getWeight("123456789")
//                .getRecevierName(LoremIpsum.getInstance().getNameMale())
//                .getRecevierDesignation(LoremIpsum.getInstance().getWords(2))
                .getSenderNo(LoremIpsum.getInstance().getPhone())

                .getProposedDeliveryDate()
                .getProposedDeliveryDateValue()
                .getReceiverAddress(LoremIpsum.getInstance().getWords(5))
                .getRemarks(LoremIpsum.getInstance().getWords(5))
                .getUploadInvoiceFile()
                .getUploadAWBFile()
                .getPreview()
                .getSubmit();


    }
}
