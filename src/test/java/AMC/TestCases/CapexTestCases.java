package AMC.TestCases;

import AMC.BaseAMC;
import AMC.Pages.CapexFormPage;
import AMC.Pages.LoginPage;
import org.testng.annotations.Test;

import java.awt.*;

public class CapexTestCases extends BaseAMC {

    public CapexTestCases(){
        super();
    }

    @Test
    public void imageuploaded() throws InterruptedException, AWTException {
        CapexFormPage capexFormPage = new LoginPage()
                .getEmail("tanzila.prianka@sqgc.com")
                .getpassword("ta12345")
                .getLoginBtn()
                .getLoginOkBtn()
                .getimage();


    }
}
