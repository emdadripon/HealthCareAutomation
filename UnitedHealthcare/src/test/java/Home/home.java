package Home;

import Base.Config;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import uhcHome.Home;
import uhcHomePage.HomePage;
import utility.ExtentReport.ApplicationLog;

/**
 * Created by smhoque on 5/17/17.
 */
public class home extends Config {

    @Test
    public void homeSearch(){
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickemployers();

    }


}
