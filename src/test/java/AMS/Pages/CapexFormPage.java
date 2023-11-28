package AMS.Pages;

import AMS.BaseAMC;
import AMS.Util.CommonMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CapexFormPage extends BaseAMC {

    CommonMethod commonMethod = new CommonMethod();
    public CapexFormPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//b[contains(text(),'CAPEX APPROVAL FORM')]")
    WebElement capexFromText;

    @FindBy(xpath = "//input[@id='file_uploaded']")
    WebElement fileUploadBtn;

   /* public CapexFormPage getimage() throws InterruptedException {
        WebElement empPhoto = driver.findElement(By.name("file_uploaded"));
        empPhoto.sendKeys("D:\\Automation Work\\ApprovalManagementSystem\\src\\test\\File");
        Thread.sleep(3000); //Wait 5 Seconds
        return this;
    }*/

    /*public CapexFormPage getimage () throws InterruptedException, AWTException {
        System.out.println("click on the " + fileUploadBtn);
        fileUploadBtn.click();
        String filePath2=commonMethod.getFilePath("Man.jpg");
        commonMethod.VideoLessonUpload(filePath2);
        Thread.sleep(5000);
        return this;

    }
*/
    public CapexFormPage getimage() throws InterruptedException {
//        WebElement fileUpload = driver.findElement(By.xpath("//input[@id='file_uploaded']"));

        // Construct the relative path to your file
        String relativeFilePath = "\\src\\test\\File\\Man.jpg";

        String projectFolderPath = System.getProperty("user.dir");
        String absoluteFilePath = projectFolderPath + relativeFilePath;

        fileUploadBtn.sendKeys(absoluteFilePath);
        Thread.sleep(2000); // Wait 5 seconds (you may consider using explicit waits instead)

        return this;
    }




    public boolean isCapexFormText() {
        return capexFromText.isDisplayed();
    }

}
