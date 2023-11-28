package AMS.Util;

import AMS.BaseAMC;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;

public class CommonMethod extends BaseAMC {

    public String fileUpload(String fileLocation) throws AWTException, InterruptedException {

        // using robot class
        Robot rb= new Robot();
        rb.delay(2000);

        // put path to file in a clipboard
        StringSelection ss= new StringSelection(fileLocation);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        // ctrl v
        rb.keyPress(KeyEvent.VK_CONTROL);// press on control key
        rb.keyPress(KeyEvent.VK_V);// press on v

        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        // enter key
        rb.keyPress(KeyEvent.VK_ENTER);// press on enter key
        rb.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);

        return fileLocation;

    }

    public String getFilePath(String file) {

        File filepath=new File("D:\\Automation Work\\ApprovalManagementSystem\\src\\test\\File\\Man.jpg");
        //WebElement fileobj = driver.findElement(By.name("toplogoupload"));
        //fileobj.sendKeys("\ntwinelogin.jpg");
        String Filepath=filepath.getAbsolutePath();
        return Filepath.trim();
    }

  /*      public String getFilePath() throws InterruptedException {
        String relativeFilePath = "\\src\\test\\File\\Man.jpg";

        String projectFolderPath = System.getProperty("user.dir");
        String absoluteFilePath = projectFolderPath + relativeFilePath;

        uploadInvoiceFile.sendKeys(absoluteFilePath);
        Thread.sleep(2000);
        return this;

    }*/


    public String fileName(String profile_image) throws AWTException, InterruptedException {

        return fileUpload(profile_image);

    }

    //for switch previous window
    public void switchpreviousWindow() {
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));     //switch to new tab
    }

    public void switchnextWindow() {
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));     //switch to new tab
    }



    //for upload file from project

   /* public CapexFormPage getimage() throws InterruptedException {
//        WebElement fileUpload = driver.findElement(By.xpath("//input[@id='file_uploaded']"));

        // Construct the relative path to your file
        String relativeFilePath = "\\src\\test\\File\\Man.jpg";

        String projectFolderPath = System.getProperty("user.dir");
        String absoluteFilePath = projectFolderPath + relativeFilePath;

        fileUploadBtn.sendKeys(absoluteFilePath);
        Thread.sleep(2000); // Wait 5 seconds (you may consider using explicit waits instead)

        return this;
    }*/


}
