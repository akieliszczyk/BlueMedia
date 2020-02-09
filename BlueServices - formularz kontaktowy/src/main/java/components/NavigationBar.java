package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.contaktPage.ContaktPage;

public class NavigationBar extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Kontakt')]")
    private WebElement buttonKontakt;


    public NavigationBar(WebDriver driver) {
        super(driver);
    }

    public ContaktPage openKontaktPage() {
        buttonKontakt.click();
        return new ContaktPage(driver);
    }
}
