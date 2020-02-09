package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.KontaktPage;

public class NavigationBar extends BasePage {

    @FindBy(xpath = "//div[contains(@class,'header__navigation')]//a[contains(text(),'Kontakt')]")
    private WebElement buttonKontakt;


    public NavigationBar(WebDriver driver) {
        super(driver);
    }

    public KontaktPage openKontaktPage() {
        buttonKontakt.click();
        return new KontaktPage(driver);
    }
}
