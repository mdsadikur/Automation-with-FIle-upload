package AMS.Pages;

import AMS.BaseAMC;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserCreationPage extends BaseAMC {

    public UserCreationPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//label[contains(text(),'SQ Id')]")
    WebElement sqIdLabel;

    @FindBy(xpath = "//input[@id='sQId']")
    WebElement sqId;

    @FindBy(xpath = "//input[@id='userName']")
    WebElement userName;

    @FindBy(xpath ="//input[@id='email']")
    WebElement email;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "contactNumber")
    WebElement contactNumber;

    @FindBy(xpath = "/html/body/app-root/app-body/div/app-content-root/div/app-create-user/p-card/div/div/div/div/form/div/div[6]/p-calendar")
    WebElement joinDate;

    @FindBy(xpath = "//span[contains(text(),'20')]")
    WebElement joinDateValue;

    @FindBy(xpath = "//app-body/div[1]/app-content-root[1]/div[1]/app-create-user[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/p-calendar[1]")
    WebElement dateOfBirth;

    @FindBy(xpath = "//app-body/div[1]/app-content-root[1]/div[1]/app-create-user[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/p-calendar[1]/span[1]/div[1]/div[2]/button[1]")
    WebElement dateOfBirthValue;

    @FindBy(xpath = "//span[contains(text(),'Select User Type')]")
    WebElement selectUserType;

    @FindBy(xpath = "(//li[@class=\"p-ripple p-element p-dropdown-item\"])[1]")
    WebElement selectUserTypeValue;

    @FindBy(xpath = "//span[contains(text(),'Select Gender')]")
    WebElement selectGender;

    @FindBy(xpath = "(//li[@class=\"p-ripple p-element p-dropdown-item\"])[1]")
    WebElement selectGenderValue;

    @FindBy(xpath = "//span[contains(text(),'Select Stuff')]")
    WebElement selectStuff;

    @FindBy(xpath = "//span[contains(text(),'Management Staff')]")
    WebElement selectStuffValue;

    @FindBy(xpath = "//app-body/div[1]/app-content-root[1]/div[1]/app-create-user[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[11]/p-dropdown[1]/div[1]/span[1]")
    WebElement companyName;

    @FindBy(xpath = "(//li[@class=\"p-ripple p-element p-dropdown-item\"])[1]")
    WebElement companyNameValue;

    @FindBy(xpath = "//app-body/div[1]/app-content-root[1]/div[1]/app-create-user[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[12]/p-dropdown[1]/div[1]/span[1]")
    WebElement locationName;

    @FindBy(xpath = "(//li[@class=\"p-ripple p-element p-dropdown-item\"])[1]")
    WebElement locationNameValue;

    @FindBy(xpath = "//span[contains(text(),'Select Marital Status')]")
    WebElement mereitalStatus;

    @FindBy(xpath = "(//li[@class=\"p-ripple p-element p-dropdown-item\"])[1]")
    WebElement meretarialStatusValue;

    @FindBy(xpath = "//span[contains(text(),'Select Religion')]")
    WebElement religion;

    @FindBy(xpath = "(//li[@class=\"p-ripple p-element p-dropdown-item\"])[1]")
    WebElement religionValue;

    @FindBy(xpath = "//span[contains(text(),'Select Blood Group')]")
    WebElement bloodGroup;

    @FindBy(xpath = "(//li[@class=\"p-ripple p-element p-dropdown-item\"])[1]")
    WebElement bloodGroupValue;

    @FindBy(xpath = "//span[contains(text(),'Select Department')]")
    WebElement department;

    @FindBy(xpath = "//span[contains(text(),'Select Designation')]")
    WebElement designation;

    @FindBy(xpath = "//span[contains(text(),'Select Business Unit')]")
    WebElement businessUnit;

    @FindBy(xpath = "//span[contains(text(),'Select Supervisor')]")
    WebElement supervisor;

    @FindBy(xpath = "(//li[@class=\"p-ripple p-element p-dropdown-item\"])[1]")
    WebElement supervisorValue;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    WebElement saveBtn;

    public boolean isSQIdLabel() {
        return sqIdLabel.isDisplayed();
    }

    public UserCreationPage getSQId(String sqid) {
        sqId.isDisplayed();
        sqId.sendKeys(sqid);
        return this;
    }

    public UserCreationPage getUserName(String name) {
        userName.isDisplayed();
        userName.sendKeys(name);
        return this;
    }

    public UserCreationPage getEmail(String emailId) {
        email.isDisplayed();
        email.sendKeys(emailId);
        return this;
    }

    public UserCreationPage getPassword(String pass) {
        password.isDisplayed();
        password.sendKeys(pass);
        return this;
    }

    public UserCreationPage getContactNumber(String contact) {
        contactNumber.isDisplayed();
        contactNumber.sendKeys(contact);
        return this;
    }

/*    public static String[] getMonthYear(String monthYearValue){
        return monthYearValue.split(" ");
    }

    public static void selectDate(String exDate, String exMonth, String exYear){
        String monthYearValue = driver.findElement(By.className("ui-datepicker-title")).getText();

        while(!(getMonthYear(monthYearValue)[0].equals(exMonth) &&
                getMonthYear(monthYearValue)[1].equals(exYear))){
            driver.findElement(By.className("ui-datepicker-prev")).click();
            monthYearValue = driver.findElement(By.className("ui-datepicker-title")).getText();
        }
        driver.findElement(By.xpath("//a[text()='"+exDate+"']")).click();
        selectDate("10", "August", "2023");
    }*/

    public UserCreationPage getJoinDate() {
        joinDate.isDisplayed();
        joinDate.click();
        joinDateValue.click();
        return this;
    }

    public UserCreationPage getDateOfBirth() {
        dateOfBirth.isDisplayed();
        dateOfBirth.click();
        dateOfBirthValue.click();
        return this;
    }

    public UserCreationPage getSelectUserType() throws InterruptedException {
        selectUserType.isDisplayed();
        selectUserType.click();
        Thread.sleep(1000);
        return this;
    }

    public UserCreationPage getSelectUserTypeValue() {
        selectUserTypeValue.isDisplayed();
        selectUserTypeValue.click();
        return this;
    }

    public UserCreationPage getSelectGender() throws InterruptedException {
        selectGender.isDisplayed();
        selectGender.click();
        Thread.sleep(1000);
        return this;
    }

    public UserCreationPage getSelectGenderValue() {
        selectGenderValue.isDisplayed();
        selectGenderValue.click();
        return this;
    }

    public UserCreationPage getSelectStuff() throws InterruptedException {
        selectStuff.isDisplayed();
        selectStuff.click();
        Thread.sleep(1000);
        return this;
    }

    public UserCreationPage getSelectStuffValue() {
        selectStuffValue.isDisplayed();
        selectStuffValue.click();
        return this;
    }

    public UserCreationPage getCompanyName() throws InterruptedException {
        companyName.isDisplayed();
        companyName.click();
        Thread.sleep(1000);
        return this;
    }

    public UserCreationPage getCompanyNameValue() {
        companyNameValue.isDisplayed();
        companyNameValue.click();
        return this;
    }

    public UserCreationPage getLocationName() throws InterruptedException {
        locationName.isDisplayed();
        locationName.click();
        Thread.sleep(1000);
        return this;
    }

    public UserCreationPage getLocationNameValue() {
        locationNameValue.isDisplayed();
        locationNameValue.click();
        return this;
    }

    public UserCreationPage getMereitalStatus() throws InterruptedException {
        mereitalStatus.isDisplayed();
        mereitalStatus.click();
        Thread.sleep(1000);
        return this;
    }

    public UserCreationPage getMeretarialStatusValue() {
        meretarialStatusValue.isDisplayed();
        meretarialStatusValue.click();
        return this;
    }

    public UserCreationPage getReligion() throws InterruptedException {
        religion.isDisplayed();
        religion.click();
        Thread.sleep(1000);
        return this;
    }

    public UserCreationPage getReligionValue() {
        religionValue.isDisplayed();
        religionValue.click();
        return this;
    }

    public UserCreationPage getBloodGroup() throws InterruptedException {
        bloodGroup.isDisplayed();
        bloodGroup.click();
        Thread.sleep(1000);
        return this;
    }

    public UserCreationPage getBloodGroupValue() {
        bloodGroupValue.isDisplayed();
        bloodGroupValue.click();
        return this;
    }

    public UserCreationPage getSupervisor() throws InterruptedException {
        supervisor.isDisplayed();
        supervisor.click();
        Thread.sleep(1000);
        return this;
    }

    public UserCreationPage getSupervisorValue() {
        supervisorValue.isDisplayed();
        supervisorValue.click();
        return this;
    }

    public UserCreationPage getSaveBtn(){
        saveBtn.isDisplayed();
        saveBtn.click();
        return this;
    }
}
