package pages;

import components.NavigationBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(id = "main_nav_trigger")
    private WebElement mainWindow;

    private NavigationBar navigationBar;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public NavigationBar getNavigationBar() {
        return new NavigationBar(driver);
    }

    public boolean isOpened() {
        return mainWindow.isDisplayed();
    }





}
