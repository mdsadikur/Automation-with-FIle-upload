package AMC.Util;

import AMC.BaseAMC;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

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

        File filepath=new File("\\src\\test\\File\\" + file);
        //WebElement fileobj = driver.findElement(By.name("toplogoupload"));
        //fileobj.sendKeys("\ntwinelogin.jpg");
        String Filepath=filepath.getAbsolutePath();
        return Filepath.trim();
    }
    public String VideoLessonUpload(String profile_image) throws AWTException, InterruptedException {

        return fileUpload(profile_image);

    }


}
