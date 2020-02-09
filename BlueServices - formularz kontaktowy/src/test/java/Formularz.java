import components.NavigationBar;
import config.TestConfig;
import model.BusinessClient;
import org.junit.Test;
import pages.HomePage;
import pages.kontaktPage.KontaktPage;
import provider.DataProvider;

public class Formularz extends TestConfig {
    HomePage homePage;
    KontaktPage kontaktPage;
    NavigationBar navigationBar;
    BusinessClient businessClient;

    @Test
    public void completeTheForm() {
        businessClient = DataProvider.getBusinessClient();
        homePage = new HomePage(driver);
        homePage.getNavigationBar();
        navigationBar = new NavigationBar(driver);
        navigationBar.openKontaktPage();
        kontaktPage = new KontaktPage(driver)
                .selectKlientBiznesowyCheckbox()
                .enterData(businessClient)
                .chooseTopic(businessClient)
                .selectEmailAgreement()
                .selectAgreement();


    }


}
