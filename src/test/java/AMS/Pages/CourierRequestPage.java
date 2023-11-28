package AMS.Pages;

import AMS.BaseAMC;
import AMS.Util.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class CourierRequestPage extends BaseAMC {


    public CourierRequestPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'Courier Request')]")
    WebElement courierRequest;

    @FindBy(xpath = "//span[contains(text(),'Choose SBU')]")
    WebElement chooseSBU;

    @FindBy(xpath = "(//li[@class=\"p-ripple p-element p-dropdown-item\"])[1]")
    WebElement chooseSBUvalue;

    @FindBy(xpath = "//span[contains(text(),'Const Center')]")
    WebElement constCenter;

    @FindBy(xpath = "(//li[@class=\"p-ripple p-element p-dropdown-item\"])[1]")
    WebElement constCenterValue;

    @FindBy(xpath = "//span[contains(text(),'Choose Type')]")
    WebElement chooseType;

    @FindBy(xpath = "//span[contains(text(),'Inbound')]")
    WebElement chooseTypeValue;

    @FindBy(xpath = "//span[contains(text(),'Item Type')]")
    WebElement itemType;

    @FindBy(xpath = "//span[contains(text(),'Sample')]")
    WebElement itemTypeValue;

    @FindBy(xpath = "//textarea[@placeholder=\"Add item description here...\"]")
    WebElement itemDescription;

    @FindBy(xpath = "//span[contains(text(),'Customer Brand')]")
    WebElement customerBrand;

    @FindBy(xpath = "(//span[@class=\"ng-star-inserted\"])[1]")
    WebElement customerBrandValue;

    @FindBy(xpath = "//span[contains(text(),'Brand Origin Country')]")
    WebElement destinationCountry;

    @FindBy(xpath = "(//li[@class=\"p-ripple p-element p-dropdown-item\"])[1]")
    WebElement destinationCountryValue;

    @FindBy(xpath = "//span[contains(text(),'Choose season')]")
    WebElement chooseSeason;

    @FindBy(xpath = "(//li[@class=\"p-ripple p-element p-dropdown-item\"])[1]")
    WebElement chooseSeasonValue;

    @FindBy(xpath = "/html/body/app-root/app-body/div/app-content-root/div/ng-component/app-page-wrapper/div/div/p-card/div/div/div[2]/courier-request-create-form/form/div[2]/div[4]/input")
    WebElement weight;

    @FindBy(xpath = "//input[@placeholder=\"Receiver Name\"]")
    WebElement recevierName;

    @FindBy(xpath = "//input[@placeholder=\"Receiver Designation\"]")
    WebElement recevierDesignation;

    @FindBy(xpath = "//input[@placeholder=\"Sender No\"]")
    WebElement senderNo;

    @FindBy(xpath = "//input[@placeholder=\"Proposed Delivery Date\"]")
    WebElement proposedDeliveryDate;

    @FindBy(xpath = "//span[contains(text(),'22')]")
    WebElement proposedDeliveryDateValue;

    @FindBy(xpath = "//textarea[@placeholder=\"Pickup Address\"]")
    WebElement receiverAddress;

    @FindBy(xpath = "//textarea[@placeholder=\"Add remarks here...\"]")
    WebElement remarks;

    @FindBy(xpath = "/html/body/app-root/app-body/div/app-content-root/div/ng-component/app-page-wrapper/div/div/p-card/div/div/div[2]/courier-request-create-form/form/div[4]/div[7]/div/p-fileupload/div/span")
    WebElement uploadInvoiceFile;

    @FindBy(xpath = "/html/body/app-root/app-body/div/app-content-root/div/ng-component/app-page-wrapper/div/div/p-card/div/div/div[2]/courier-request-create-form/form/div[4]/div[8]/div/p-fileupload/div/span")
    WebElement uploadAWBFile;

    @FindBy(xpath = "//span[contains(text(),'Preview')]")
    WebElement preview;

    @FindBy(xpath = "//span[contains(text(),'Submit')]")
    WebElement submit;

    public boolean isCourierRequest() {
        return courierRequest.isDisplayed();
    }

    public CourierRequestPage getChooseSBU() {
        chooseSBU.isDisplayed();
        chooseSBU.click();
        return this;
    }

    public CourierRequestPage getChooseSBUvalue() {
        chooseSBUvalue.isDisplayed();
        chooseSBUvalue.click();
        return this;
    }

    public CourierRequestPage getConstCenter() {
        constCenter.isDisplayed();
        constCenter.click();
        return this;
    }

    public CourierRequestPage getConstCenterValue() {
        constCenterValue.isDisplayed();
        constCenterValue.click();
        return this;
    }

    public CourierRequestPage getChooseType() {
        chooseType.isDisplayed();
        chooseType.click();
        return this;
    }

    public CourierRequestPage getChooseTypeValue() {
        chooseTypeValue.isDisplayed();
        chooseTypeValue.click();
        return this;
    }

    public CourierRequestPage getItemType() {
        itemType.isDisplayed();
        itemType.click();
        return this;
    }

    public CourierRequestPage getItemTypeValue() {
        itemTypeValue.isDisplayed();
        itemTypeValue.click();
        return this;
    }

    public CourierRequestPage getItemDescription(String itemDescriptionValue) {
        itemDescription.isDisplayed();
        itemDescription.sendKeys(itemDescriptionValue);
        return this;
    }

    public CourierRequestPage getCustomerBrand() {
        customerBrand.isDisplayed();
        customerBrand.click();
        return this;
    }

    public CourierRequestPage getCustomerBrandValue() {
        customerBrandValue.isDisplayed();
        customerBrandValue.click();
        return this;
    }

    public CourierRequestPage getDestinationCountry() {
        destinationCountry.isDisplayed();
        destinationCountry.click();
        return this;
    }

    public CourierRequestPage getDestinationCountryValue() {
        destinationCountryValue.isDisplayed();
        destinationCountryValue.click();
        return this;
    }

    public CourierRequestPage getChooseSeason() {
        chooseSeason.isDisplayed();
        chooseSeason.click();
        return this;
    }

    public CourierRequestPage getChooseSeasonValue() {
        chooseSeasonValue.isDisplayed();
        chooseSeasonValue.click();
        return this;
    }

    public CourierRequestPage getWeight(String weightValue) {
        weight.isDisplayed();
        weight.sendKeys(weightValue);
        return this;
    }

    public CourierRequestPage getRecevierName(String recevierNameValue) {
        recevierName.isDisplayed();
        recevierName.sendKeys(recevierNameValue);
        return this;
    }

    public CourierRequestPage getRecevierDesignation(String recevierDesignationValue) {
        recevierDesignation.isDisplayed();
        recevierDesignation.sendKeys(recevierDesignationValue);
        return this;
    }

    public CourierRequestPage getSenderNo(String senderNoValue) {
        senderNo.isDisplayed();
        senderNo.sendKeys(senderNoValue);
        return this;
    }

    public CourierRequestPage getProposedDeliveryDate() {
        proposedDeliveryDate.isDisplayed();
//        proposedDeliveryDate.sendKeys("10/12/2023");
        proposedDeliveryDate.click();
        return this;
    }

  /*  public static String[] getMonthYear(String monthYearValue){
        return monthYearValue.split(" ");
    }

    public CourierRequestPage getProposedDeliveryDateValue() throws InterruptedException {
        proposedDeliveryDate.isDisplayed();
        proposedDeliveryDate.click();
        Thread.sleep(2000);
        String exMonth = "December";
        String exYear = "2023";
        String exDate = "10";

        while (true){
            String monthYearValue = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-body[1]/div[1]/app-content-root[1]/div[1]/ng-component[1]/app-page-wrapper[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[2]/courier-request-create-form[1]/form[1]/div[4]/div[3]/p-calendar[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).getText();
            System.out.println(monthYearValue);
            if (getMonthYear(monthYearValue)[0].equals(exMonth) &&
                    getMonthYear(monthYearValue)[1].equals(exYear)){
                break;
            }else {
                driver.findElement(By.xpath("/html/body/app-root/app-body/div/app-content-root/div/ng-component/app-page-wrapper/div/div/p-card/div/div/div[2]/courier-request-create-form/form/div[4]/div[3]/p-calendar/span/div/div/div/div[1]/button[2]")).click();
            }
        }

        driver.findElement(By.xpath("//tbody/tr/td[contains(text(), "+exDate+")]")).click();

        return this;
    }*/

    public CourierRequestPage getProposedDeliveryDateValue() {
        proposedDeliveryDateValue.isDisplayed();
        proposedDeliveryDateValue.click();
        return this;
    }

/*    public static String[] getMonthYear(String monthYearValue){
        return monthYearValue.split(" ");
    }

    public  CourierRequestPage getProposedDeliveryDate(){
        proposedDeliveryDate.isDisplayed();
        proposedDeliveryDate.click();

        String monthYearValue = driver.findElement(By.xpath("/html/body/app-root/app-body/div/app-content-root/div/ng-component/app-page-wrapper/div/div/p-card/div/div/div[2]/courier-request-create-form/form/div[4]/div[3]/p-calendar/span/div/div/div/div[1]/div")).getText();

        String exMonth = null;
        String exYear = null;
        while(!(getMonthYear(monthYearValue)[0].equals(exMonth) &&
                getMonthYear(monthYearValue)[1].equals(exYear))){
            driver.findElement(By.xpath("/html/body/app-root/app-body/div/app-content-root/div/ng-component/app-page-wrapper/div/div/p-card/div/div/div[2]/courier-request-create-form/form/div[4]/div[3]/p-calendar/span/div/div/div/div[1]/button[2]")).click();
            monthYearValue = driver.findElement(By.xpath("/html/body/app-root/app-body/div/app-content-root/div/ng-component/app-page-wrapper/div/div/p-card/div/div/div[2]/courier-request-create-form/form/div[4]/div[3]/p-calendar/span/div/div/div/div[1]/div")).getText();
        }
        String exDate = null;
        driver.findElement(By.xpath("//span[text()='"+exDate+"']")).click();
        selectDate("10", "December", "2023");
        return this;
    }

    private void selectDate(String number, String august, String number1) {
    }*/






    public CourierRequestPage getReceiverAddress(String receiverAddressValue) {
        receiverAddress.isDisplayed();
        receiverAddress.sendKeys(receiverAddressValue);
        return this;
    }

    public CourierRequestPage getRemarks(String remarksValue) {
        remarks.isDisplayed();
        remarks.sendKeys(remarksValue);
        return this;
    }

    CommonMethod commonMethod = new CommonMethod();



    public CourierRequestPage getUploadInvoiceFile() throws InterruptedException, AWTException {
        uploadInvoiceFile.click();
        String filePath=commonMethod.getFilePath("Man.jpg");
        commonMethod.fileName(filePath);
        Thread.sleep(2000);
        return this;

    }

/*    public CourierRequestPage getUploadInvoiceFile() throws InterruptedException {
        String relativeFilePath = "\\src\\test\\File\\Man.jpg";

        String projectFolderPath = System.getProperty("user.dir");
        String absoluteFilePath = projectFolderPath + relativeFilePath;

        uploadInvoiceFile.sendKeys(absoluteFilePath);
        Thread.sleep(2000);
        return this;

    }*/

    public CourierRequestPage getUploadAWBFile() throws InterruptedException, AWTException {
        uploadAWBFile.click();
        String filePath=commonMethod.getFilePath("Man.jpg");
        commonMethod.fileName(filePath);
        Thread.sleep(2000);
        return this;
    }

    public CourierRequestPage getPreview() {
        preview.isDisplayed();
        preview.click();
        return this;
    }

    public CourierRequestPage getSubmit() {
        submit.isDisplayed();
        submit.click();
        return this;
    }






}
