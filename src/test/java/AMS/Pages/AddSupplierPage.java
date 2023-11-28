package AMS.Pages;

import AMS.BaseAMC;
import AMS.Util.CommonMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;


public class AddSupplierPage extends BaseAMC {

    public AddSupplierPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h3[contains(text(),'Supplier Onboarding')]")
    WebElement supplierOnboarding;

    @FindBy(xpath = "//*[@id='pn_id_63_content']/div/div/div[1]/p-dropdown/div")
    WebElement selectSBU;

    @FindBy(xpath = "(//li[@class=\"p-ripple p-element p-dropdown-item\"])[1]")
    WebElement selectSBUValue;

    @FindBy(xpath = "//input[@title=\"Legal Entity Name\"]")
    WebElement requestorName;

    @FindBy(xpath = "//input[@title=\"Registered Address\"]")
    WebElement supplierLegalEntityName;

    @FindBy(xpath = "(//input[@title=\"Chairmen/Managing Director\"])[1]")
    WebElement registeredAddress;

    @FindBy(xpath = "(//input[@title=\"Chairmen/Managing Director\"])[2]")
    WebElement supplierContactDesignation;

    @FindBy(xpath = "(//input[@title=\"Chairmen/Managing Director\"])[3]")
    WebElement supplierContactPhone;

    @FindBy(xpath = "(//input[@title=\"Chairmen/Managing Director\"])[4]")
    WebElement supplierContactEmail;

    @FindBy(xpath = "//input[@title=\"Billing Address\"]")
    WebElement billingAddress;

    @FindBy(xpath = "//span[contains(text(),'Select Agreed Credit Term')]")
    WebElement selectAgreedCreditTerm;

    @FindBy(xpath = "(//li[@class=\"p-ripple p-element p-dropdown-item\"])[1]")
    WebElement selectAgreedCreditTermValue;

    @FindBy(xpath = "//input[@title=\"Factory Name\"]")
    WebElement factoryName;

    @FindBy(xpath = "//input[@title=\"Factory Address\"]")
    WebElement factoryAddress;

    @FindBy(xpath = "//input[@title=\"Contact Person Name\"]")
    WebElement contactPersonName;

    @FindBy(xpath = "//input[@title=\"Contact Person Designation\"]")
    WebElement contactPersonDesignation;

    @FindBy(xpath = "(//input[@title=\"Contact Person Phone No\"])[1]")
    WebElement contactPersonPhoneNo;

    @FindBy(xpath = "(//input[@title=\"Contact Person Phone No\"])[2]")
    WebElement contactPersonEmail;

    @FindBy(xpath = "//div[@class=\"p-accordion-header ng-tns-c2377356909-191 p-highlight\"]")
    WebElement businessProfile;

    @FindBy(xpath = "//input[@title=\"Country Of Origin\"]")
    WebElement countryOfOrigin;

    @FindBy(xpath = "//input[@title=\"Yearly Business Volume\"]")
    WebElement yearlyBusinessVolume;

    @FindBy(xpath = "//input[@title=\"Year Of Experience\"]")
    WebElement yearOfExperienceInThisBusiness;

    @FindBy(xpath = "//input[@title=\"Number Of Factories\"]")
    WebElement numberOfFactories;

    @FindBy(xpath = "//input[@title=\"Number Of Headcounts\"]")
    WebElement numberOfHeadcounts;

    @FindBy(xpath = "//input[@title=\"Major Customers\"]")
    WebElement majorCustomers;

    @FindBy(xpath = "//div[@class=\"p-accordion-header ng-tns-c2377356909-192\"]")
    WebElement bankInformation;

    @FindBy(xpath = "//input[@title=\"Bank Name\"]")
    WebElement bankName;

    @FindBy(xpath = "//input[@title=\"Branch\"]")
    WebElement branch;

    @FindBy(xpath = "//input[@title=\"Bank Address\"]")
    WebElement bankAddress;

    @FindBy(xpath = "//input[@title=\"Bank Account No\"]")
    WebElement bankAccountNo;

    @FindBy(xpath = "//input[@title=\"Bank Routing No\"]")
    WebElement bankRoutingNo;

    @FindBy(xpath = "//input[@title=\"Bank Account Type\"]")
    WebElement bankAccountType;

    @FindBy(xpath = "//input[@title=\"Swift Code\"]")
    WebElement swiftCode;

    @FindBy(className = "file-upload-input block ng-pristine ng-invalid ng-touched")
    WebElement uploadFile;

    @FindBy(xpath = "//div[@class=\"p-accordion-header ng-tns-c2377356909-21\"]")
    WebElement taxInformation;

    @FindBy(xpath = "//input[@title=\"Trade License No\"]")
    WebElement tradeLicenseNo;

    @FindBy(xpath = "//input[@title=\"Tax Identification No\"]")
    WebElement taxIdentificationNo;

    @FindBy(xpath = "//input[@title=\"Tax Registration No\"]")
    WebElement taxRegistrationNo;

    @FindBy(xpath = "//input[@formcontrolname=\"vatCertificateFile\"]")
    WebElement vatCertificateFile;

    @FindBy(xpath = "//input[@formcontrolname=\"tinCertificateFile\"]")
    WebElement tinCertificateFile;

    @FindBy(xpath = "//p-accordion-header ng-tns-c2377356909-22 p-highlight\"]")
    WebElement otherInformation;

    @FindBy(xpath = "//input[@title=\"Comments\"]")
    WebElement Comments;

    @FindBy(xpath = "//input[@formcontrolname=\"tradeLicenseFile\"]")
    WebElement tradeLicenseFile;

    @FindBy(xpath = "//input[@formcontrolname=\"bondLicenseFile\"]")
    WebElement bondLicenseFile;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    WebElement saveBtn;

    @FindBy(xpath = "//span[contains(text(),'Submit')]")
    WebElement submitBtn;

    @FindBy(xpath = "//div[contains(text(),'Supplier onboarding saved successfully')]")
    WebElement successMsg;


    public boolean isSupplierOnboarding() {
        return supplierOnboarding.isDisplayed();
    }

    public AddSupplierPage getSelectSBU() {
        selectSBU.isDisplayed();
        selectSBU.click();
        return this;
    }

    public AddSupplierPage getSelectSBUValue() {
        selectSBUValue.isDisplayed();
        selectSBUValue.click();
        return this;
    }

    public AddSupplierPage getRequestorName(String name) {
        requestorName.isDisplayed();
        requestorName.sendKeys(name);
        return this;
    }

    public AddSupplierPage getSupplierLegalEntityName(String name) {
        supplierLegalEntityName.isDisplayed();
        supplierLegalEntityName.sendKeys(name);
        return this;
    }

    public AddSupplierPage getRegisteredAddress(String address) {
        registeredAddress.isDisplayed();
        registeredAddress.sendKeys(address);
        return this;
    }

    public AddSupplierPage getSupplierContactDesignation(String designation) {
        supplierContactDesignation.isDisplayed();
        supplierContactDesignation.sendKeys(designation);
        return this;
    }

    public AddSupplierPage getSupplierContactPhone(String phone) {
        supplierContactPhone.isDisplayed();
        supplierContactPhone.sendKeys(phone);
        return this;
    }

    public AddSupplierPage getSupplierContactEmail(String email) {
        supplierContactEmail.isDisplayed();
        supplierContactEmail.sendKeys(email);
        return this;
    }

    public AddSupplierPage getBillingAddress(String address) {
        billingAddress.isDisplayed();
        billingAddress.sendKeys(address);
        return this;
    }

    public AddSupplierPage getSelectAgreedCreditTerm() {
        selectAgreedCreditTerm.isDisplayed();
        selectAgreedCreditTerm.click();
        return this;
    }

    public AddSupplierPage getSelectAgreedCreditTermValue() {
        selectAgreedCreditTermValue.isDisplayed();
        selectAgreedCreditTermValue.click();
        return this;
    }

    public AddSupplierPage getFactoryName(String name) {
        factoryName.isDisplayed();
        factoryName.sendKeys(name);
        return this;
    }

    public AddSupplierPage getFactoryAddress(String address) {
        factoryAddress.isDisplayed();
        factoryAddress.sendKeys(address);
        return this;
    }

    public AddSupplierPage getContactPersonName(String name) {
        contactPersonName.isDisplayed();
        contactPersonName.sendKeys(name);
        return this;
    }

    public AddSupplierPage getContactPersonDesignation(String designation) {
        contactPersonDesignation.isDisplayed();
        contactPersonDesignation.sendKeys(designation);
        return this;
    }

    public AddSupplierPage getContactPersonPhoneNo(String phone) {
        contactPersonPhoneNo.isDisplayed();
        contactPersonPhoneNo.sendKeys(phone);
        return this;
    }

    public AddSupplierPage getContactPersonEmail(String email) {
        contactPersonEmail.isDisplayed();
        contactPersonEmail.sendKeys(email);
        return this;
    }

    public AddSupplierPage getHeaderAction() {
        businessProfile.isDisplayed();
        businessProfile.click();
        return this;
    }

    public AddSupplierPage getCountryOfOrigin(String country) {
        countryOfOrigin.isDisplayed();
        countryOfOrigin.sendKeys(country);
        return this;
    }

    public AddSupplierPage getYearlyBusinessVolume(String volume) {
        yearlyBusinessVolume.isDisplayed();
        yearlyBusinessVolume.sendKeys(volume);
        return this;
    }

    public AddSupplierPage getYearOfExperienceInThisBusiness(String year) {
        yearOfExperienceInThisBusiness.isDisplayed();
        yearOfExperienceInThisBusiness.sendKeys(year);
        return this;
    }

    public AddSupplierPage getNumberOfFactories(String number) {
        numberOfFactories.isDisplayed();
        numberOfFactories.sendKeys(number);
        return this;
    }

    public AddSupplierPage getNumberOfHeadcounts(String number) {
        numberOfHeadcounts.isDisplayed();
        numberOfHeadcounts.sendKeys(number);
        return this;
    }

    public AddSupplierPage getMajorCustomers(String customers) {
        majorCustomers.isDisplayed();
        majorCustomers.sendKeys(customers);
        return this;
    }

    public AddSupplierPage bankInformation() {
        bankInformation.isDisplayed();
        bankInformation.click();
        return this;
    }

    public AddSupplierPage getBankName(String name) {
        bankName.isDisplayed();
        bankName.sendKeys(name);
        return this;
    }

    public AddSupplierPage getBranch(String branchName) {
        branch.isDisplayed();
        branch.sendKeys(branchName);
        return this;
    }

    public AddSupplierPage getBankAddress(String address) {
        bankAddress.isDisplayed();
        bankAddress.sendKeys(address);
        return this;
    }

    public AddSupplierPage getBankAccountNo(String accountNo) {
        bankAccountNo.isDisplayed();
        bankAccountNo.sendKeys(accountNo);
        return this;
    }

    public AddSupplierPage getBankRoutingNo(String routingNo) {
        bankRoutingNo.isDisplayed();
        bankRoutingNo.sendKeys(routingNo);
        return this;
    }

    public AddSupplierPage getBankAccountType(String accountType) {
        bankAccountType.isDisplayed();
        bankAccountType.sendKeys(accountType);
        return this;
    }

    public AddSupplierPage getSwiftCode(String code) {
        swiftCode.isDisplayed();
        swiftCode.sendKeys(code);
        return this;
    }

    CommonMethod commonMethod = new CommonMethod();

    public AddSupplierPage getUploadFile() throws InterruptedException, AWTException {
        uploadFile.click();
        String filePath = commonMethod.getFilePath("Man.jpg");
        commonMethod.fileName(filePath);
        Thread.sleep(2000);
        return this;
    }

    public AddSupplierPage getTaxInformation() {
        taxInformation.isDisplayed();
        taxInformation.click();
        return this;
    }

    public AddSupplierPage getTradeLicenseNo(String licenseNo) {
        tradeLicenseNo.isDisplayed();
        tradeLicenseNo.sendKeys(licenseNo);
        return this;
    }

    public AddSupplierPage getTaxIdentificationNo(String taxNo) {
        taxIdentificationNo.isDisplayed();
        taxIdentificationNo.sendKeys(taxNo);
        return this;
    }

    public AddSupplierPage getTaxRegistrationNo(String registrationNo) {
        taxRegistrationNo.isDisplayed();
        taxRegistrationNo.sendKeys(registrationNo);
        return this;
    }

    public AddSupplierPage getVatCertificateFile() throws InterruptedException, AWTException {
        vatCertificateFile.click();
        String filePath = commonMethod.getFilePath("Man.jpg");
        commonMethod.fileName(filePath);
        Thread.sleep(2000);
        return this;
    }

    public AddSupplierPage getTinCertificateFile() throws InterruptedException, AWTException {
        tinCertificateFile.click();
        String filePath = commonMethod.getFilePath("Man.jpg");
        commonMethod.fileName(filePath);
        Thread.sleep(2000);
        return this;
    }

    public AddSupplierPage getOtherInformation() {
        otherInformation.isDisplayed();
        otherInformation.click();
        return this;
    }

    public AddSupplierPage getComments(String comments) {
        Comments.isDisplayed();
        Comments.sendKeys(comments);
        return this;
    }

    public AddSupplierPage getTradeLicenseFile() throws InterruptedException, AWTException {
        tradeLicenseFile.click();
        String filePath = commonMethod.getFilePath("Man.jpg");
        commonMethod.fileName(filePath);
        Thread.sleep(2000);
        return this;
    }

    public AddSupplierPage getBondLicenseFile() throws InterruptedException, AWTException {
        bondLicenseFile.click();
        String filePath = commonMethod.getFilePath("Man.jpg");
        commonMethod.fileName(filePath);
        Thread.sleep(2000);
        return this;
    }

    public AddSupplierPage getSaveBtn() {
        saveBtn.isDisplayed();
        saveBtn.click();
        return this;
    }

    public AddSupplierPage getSubmitBtn() {
        submitBtn.isDisplayed();
        submitBtn.click();
        return this;
    }

    public boolean isSuccessMsgDisplayed(){
        return successMsg.isDisplayed();
    }

    @FindBy(xpath = "//span[contains(text(),'New')]")
    WebElement newBtn;
  /*  public AddSupplierPage getNewBtn() throws InterruptedException {
        newBtn.isDisplayed();
        newBtn.click();
        return this;

    }*/
}
