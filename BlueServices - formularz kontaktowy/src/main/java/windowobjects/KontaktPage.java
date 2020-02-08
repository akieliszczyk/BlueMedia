package windowobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.Constant;

public class KontaktPage extends BasePage<WebDriver> {
    public KontaktPage(WebDriver driver) {
        super(driver);
    }

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

    @FindBy(xpath = "//div[contains(@class,\"bsf__radio\")]//input[contains(@data-request-data,\"id:1,post_id:370\")]")
    private WebElement checkboxKlientBiznesowy;

    @FindBy(id = "agreement_1")
    private WebElement checkboxAgreement;

    @FindBy(xpath = "//div[contains(@class,\"bsf__radio\")]//input[contains(@value,\"email\")]")
    private WebElement checkboxEmailAgreement;

    @FindBy(className = "select2-selection__arrow")
    private WebElement dropdownChooseTopic;

    @FindBy(className = "select2-search__field")
    private WebElement textboxSearch;

    @FindBy(className = "select2-selection__rendered")
    private WebElement dropdownPrzelewNatychmiastowy;


    public void selectKlientBiznesowyCheckbox() {
        checkboxKlientBiznesowy.click();
    }

    public void enterData() throws InterruptedException {

        checkboxKlientBiznesowy.click();
        textboxName.click();
        textboxName.sendKeys(Constant.UserData.imie_i_nazwisko);
        textboxEmail.click();
        textboxEmail.sendKeys(Constant.UserData.email);
        textboxPhone.click();
        textboxPhone.sendKeys(Constant.UserData.telefon);
        textboxAdditionalInformation.click();
        textboxAdditionalInformation.sendKeys(Constant.UserData.tresc);
        dropdownChooseTopic.click();
        Thread.sleep(1000);
        textboxSearch.sendKeys("P");
        Thread.sleep(1000);


        dropdownPrzelewNatychmiastowy.click();
        checkboxEmailAgreement.click();
        checkboxAgreement.click();

    }

    public void chooseTopic() {
        dropdownChooseTopic.click();
        dropdownPrzelewNatychmiastowy.click();
    }

    public void selectEmailAgreement() {
        checkboxEmailAgreement.click();
    }

    public void selectAgreement() {
        checkboxAgreement.click();
    }








}
