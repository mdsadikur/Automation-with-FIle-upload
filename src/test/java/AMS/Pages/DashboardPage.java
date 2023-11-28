package AMS.Pages;

import AMS.BaseAMC;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BaseAMC {

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//app-body/div[1]/app-sidenav[1]/div[1]/div[1]/span[1]")
    WebElement expandMenu;

    @FindBy(xpath = "//div[contains(text(),'SQ Approvals')]")
    WebElement sqApprovals;

    @FindBy(xpath = "//span[contains(text(),'Admin')]")
    WebElement administrative;

    @FindBy(xpath = "//span[contains(text(),'User Creation')]")
    WebElement userCreation;

    @FindBy(xpath = "//span[contains(text(),' Shipping & Logistics ')]")
    WebElement shippingLogistics;

    @FindBy(xpath = "//span[contains(text(),'Courier')]")
    WebElement courier;

    @FindBy(xpath = "(//span[@class=\"sublevel-link-text ng-tns-c3926422078-12 ng-trigger ng-trigger-fadeInOut ng-star-inserted\"])[1]")
    WebElement courierRequest;

    @FindBy(xpath = "//span[contains(text(),'Marketing - Supply Chain')]")
    WebElement marketingSupplyChain;

    @FindBy(xpath = "//span[contains(text(),'Supplier Onboarding')]")
    WebElement supplierOnboarding;

    @FindBy(xpath = "//span[contains(text(),'Add Suppliers')]")
    WebElement addSuppliers;

    public DashboardPage expandMenu() throws InterruptedException {
        expandMenu.isDisplayed();
        expandMenu.click();
        Thread.sleep(2000);
        return this;
    }

  /*  public DashboardPage getSQApprovals() {
        sqApprovals.isDisplayed();
        return this;
    }*/

    public boolean isSQApprovals() {
        return sqApprovals.isDisplayed();
    }

    public DashboardPage getAdmin() {
        administrative.isDisplayed();
        administrative.click();
        return this;
    }

    public UserCreationPage getUserCreation() {
        userCreation.isDisplayed();
        userCreation.click();
        return new UserCreationPage();
    }

    public DashboardPage getShippingLogistics() {
        shippingLogistics.isDisplayed();
        shippingLogistics.click();
        return this;
    }

    public DashboardPage getCourier() {
        courier.isDisplayed();
        courier.click();
        return this;
    }

    public CourierRequestPage getCourierRequest() {
        courierRequest.isDisplayed();
        courierRequest.click();
        return new CourierRequestPage();
    }

    public DashboardPage getMarketingSupplyChain() {
        marketingSupplyChain.isDisplayed();
        marketingSupplyChain.click();
        return this;
    }

    public DashboardPage getSupplierOnboarding() {
        supplierOnboarding.isDisplayed();
        supplierOnboarding.click();
        return this;
    }

    public SupplierListPage getAddSuppliers() {
        addSuppliers.isDisplayed();
        addSuppliers.click();
        return new SupplierListPage();
    }

   /* @FindBy(xpath = "//span[contains(text(),'New')]")
    WebElement newBtn;

    public AddSupplierPage getNewBtn() throws InterruptedException {
        newBtn.isDisplayed();
        newBtn.click();
        return new AddSupplierPage();

    }*/
}
