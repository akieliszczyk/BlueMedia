package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "main_nav_trigger")
    private WebElement mainWindow;

    @FindBy(xpath = "//div[contains(@class,'header__navigation')]//a[contains(text(),'Kontakt')]")
    private WebElement buttonKontakt;

    public boolean isOpened() {
        return mainWindow.isDisplayed();
    }

    public KontaktPage openKontaktPage() {
        buttonKontakt.click();
        return new KontaktPage(driver);
    }




}
