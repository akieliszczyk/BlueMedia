import config.TestConfig;
import org.junit.Test;
import windowobjects.HomePage;
import windowobjects.KontaktPage;

public class Formularz extends TestConfig {

    @Test
    public void openNEXTPage() {
        new HomePage(driver)
                .openKontaktPage();

    }

    @Test
    public void completeTheForm() throws InterruptedException {
        new KontaktPage(driver)
                .enterData();


    }


}
