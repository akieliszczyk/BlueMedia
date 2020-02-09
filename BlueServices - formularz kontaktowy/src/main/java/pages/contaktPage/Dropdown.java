package pages.contaktPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class Dropdown extends BasePage {

    @FindBy(className = "select2-selection__arrow")
    private WebElement dropdownChooseTopic;

    @FindBy(className = "select2-search__field")
    private WebElement textboxSearch;

    @FindBy(xpath = "//*[@class='select2-results__option']//li")
    private List<WebElement> dropdownOptions;


    public Dropdown(WebDriver driver) {
        super(driver);
    }

    public void selectOption(String optionName) {
        dropdownChooseTopic.click();
        for (WebElement option : dropdownOptions) {
            if (option.getText().equals(optionName)) {
                option.click();
                break;
            }
        }
    }
}
