import config.TestConfig;
import org.junit.Test;
import windowobjects.HomePage;
import windowobjects.KontaktPage;

public class Formularz extends TestConfig {
    HomePage homePage;
    KontaktPage kontaktPage;

    @Test
    public void completeTheForm() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.openKontaktPage();

        kontaktPage = new KontaktPage(driver);
        kontaktPage.selectKlientBiznesowyCheckbox();
        kontaktPage.enterData();
        kontaktPage.chooseTopic();
        kontaktPage.selectEmailAgreement();
        kontaktPage.selectAgreement();



    }


}
