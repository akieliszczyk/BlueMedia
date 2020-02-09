package scenarios;

import config.BaseTest;
import model.BusinessClient;
import org.junit.Test;
import pages.HomePage;
import provider.DataFactory;

public class FormTest extends BaseTest {
    HomePage homePage;
    BusinessClient businessClient;

    @Test
    public void completeTheFormTest() {
        businessClient = DataFactory.getBusinessClient();
        homePage = new HomePage(driver);
        homePage.isOpened()
                .getNavigationBar()
                .openKontaktPage()
                .isOpened()
                .selectKlientBiznesowyCheckbox()
                .enterData(businessClient)
                .selectEmailAgreement()
                .selectAgreement();
    }
}
