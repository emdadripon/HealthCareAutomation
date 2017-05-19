package uhcHome;

import Base.Config;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.ExtentReport.TestLogger;

/**
 * Created by smhoque on 5/17/17.
 */
public class Home extends Config {
    @FindBy(how = How.CSS, using = ".top-menu")
    public static WebElement home;

    public static WebElement getHome() {
        return home;
    }

    public WebElement getHomeElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return home;
    }
}
