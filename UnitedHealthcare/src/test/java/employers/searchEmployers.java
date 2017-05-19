package employers;

import Base.Config;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import uhcHomePage.HomePage;
import utility.ExtentReport.ApplicationLog;

/**
 * Created by smhoque on 5/19/17.
 */
public class searchEmployers extends Config {
    @Test
    public void homeSearch(){
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickemployers();

    }
}
