package AMS.Pages;

import AMS.BaseAMC;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SupplierListPage extends BaseAMC {

    public SupplierListPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'New')]")
    WebElement newBtn;

    public boolean isnewPage(){
        return newBtn.isDisplayed();
    }

    public AddSupplierPage getNewBtn() throws InterruptedException {
        newBtn.isDisplayed();
        newBtn.click();
        return new AddSupplierPage();

    }

/*    public SupplierListPage getNewBtn() throws InterruptedException {
        newBtn.isDisplayed();
        Thread.sleep(2000);
        newBtn.click();
        Thread.sleep(2000);
        return this;
    }*/

}
