package pages.contaktPage;

import model.BusinessClient;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ContaktPage extends BasePage {


    @FindBy(className = "hp__main__subtitle")
    private WebElement mainwindow;

    @FindBy(id = "name")
    private WebElement textboxName;

    @FindBy(id = "email_c")
    private WebElement textboxEmail;

    @FindBy(id = "phone")
    private WebElement textboxPhone;

    @FindBy(id = "company_name")
    private WebElement textboxCompanyName;

    @FindBy(id = "body")
    private WebElement textboxAdditionalInformation;

    @FindBy(id = "select2-subject-container")
    private WebElement listTopic;

    @FindBy(xpath = "//input[contains(@data-request-data,\"id:1,post_id:370\")]")
    private WebElement checkboxKlientBiznesowy;

    @FindBy(id = "agreement_1")
    private WebElement checkboxAgreement;

    @FindBy(xpath = "//input[contains(@value,\"email\")]")
    private WebElement checkboxEmailAgreement;

    @FindBy(className = "select2-selection__arrow")
    private WebElement dropdownChooseTopic;

    @FindBy(className = "select2-search__field")
    private WebElement textboxSearch;

    @FindBy(className = "select2-selection__rendered")
    private WebElement dropdownPrzelewNatychmiastowy;

    private Dropdown dropdown;

    public ContaktPage(WebDriver driver) {
        super(driver);
        dropdown = new Dropdown(driver);
    }
    public boolean isOpened() {
        return mainwindow.isDisplayed();
    }

    public ContaktPage selectKlientBiznesowyCheckbox() {
        checkboxKlientBiznesowy.click();
        return this;

    }

    public ContaktPage enterData(BusinessClient businessClient) {

        checkboxKlientBiznesowy.click();
        textboxName.click();
        textboxName.sendKeys(businessClient.getFullName());
        textboxEmail.click();
        textboxEmail.sendKeys(businessClient.getEmail());
        textboxPhone.click();
        textboxPhone.sendKeys(businessClient.getPhone());
        textboxAdditionalInformation.click();
        textboxAdditionalInformation.sendKeys(businessClient.getDescription());
        return this;
    }

    public ContaktPage chooseTopic(BusinessClient businessClient) {
        dropdown.selectOption(businessClient.getSubject());
        return this;
    }

    public ContaktPage selectEmailAgreement() {
        checkboxEmailAgreement.click();
        return this;
    }

    public ContaktPage selectAgreement() {
        checkboxAgreement.click();
        return this;
    }








}
