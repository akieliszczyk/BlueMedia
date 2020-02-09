package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.Constant;

public class KontaktPage extends BasePage {
    public KontaktPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[contains(@class,\"age-container\")]//h1[contains(text(),\"Dobrze być w kontakcie.\")]")
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

    public boolean isOpened() {
        return mainwindow.isDisplayed();
    }

    public void selectKlientBiznesowyCheckbox() {
        checkboxKlientBiznesowy.click();
    }

    public void enterData() {

        checkboxKlientBiznesowy.click();
        textboxName.click();
        textboxName.sendKeys(Constant.UserData.imie_i_nazwisko);
        textboxEmail.click();
        textboxEmail.sendKeys(Constant.UserData.email);
        textboxPhone.click();
        textboxPhone.sendKeys(Constant.UserData.telefon);
        textboxAdditionalInformation.click();
        textboxAdditionalInformation.sendKeys(Constant.UserData.tresc);
    }

    public void chooseTopic() {
        dropdownChooseTopic.click();
        textboxSearch.sendKeys("Przelewy natychmiastowe", Keys.ENTER);
    }

    public void selectEmailAgreement() {
        checkboxEmailAgreement.click();
    }

    public void selectAgreement() {
        checkboxAgreement.click();
    }








}
