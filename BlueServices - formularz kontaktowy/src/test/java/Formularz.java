import config.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.KontaktPage;

public class Formularz extends TestConfig {
    HomePage homePage;
    KontaktPage kontaktPage;

    @Test
    public void completeTheForm() throws InterruptedException {
        homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isOpened());
        homePage.openKontaktPage();
        kontaktPage = new KontaktPage(driver);
        Assert.assertTrue(kontaktPage.isOpened());
        kontaktPage.selectKlientBiznesowyCheckbox();
        kontaktPage.enterData();
        kontaktPage.chooseTopic();
        kontaktPage.selectEmailAgreement();
        kontaktPage.selectAgreement();



    }


}
