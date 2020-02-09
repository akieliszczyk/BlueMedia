import components.NavigationBar;
import config.TestConfig;
import model.BusinessClient;
import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.contaktPage.ContaktPage;
import provider.DataProvider;

public class FormTest extends TestConfig {
    HomePage homePage;
    ContaktPage contaktPage;
    NavigationBar navigationBar;
    BusinessClient businessClient;

    @Test
    public void completeTheFormTest() {
        businessClient = DataProvider.getBusinessClient();
        homePage = new HomePage(driver);
        homePage.isOpened()
                .getNavigationBar();
        navigationBar = new NavigationBar(driver);
        navigationBar.openKontaktPage();
        contaktPage = new ContaktPage(driver);
        contaktPage.isOpened()
                .selectKlientBiznesowyCheckbox()
                .enterData(businessClient)
                .chooseTopic(businessClient)
                .selectEmailAgreement()
                .selectAgreement();


    }


}
