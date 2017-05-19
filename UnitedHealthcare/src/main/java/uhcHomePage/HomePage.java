package uhcHomePage;

import Base.Config;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;
import utility.ExtentReport.TestLogger;

/**
 * Created by smhoque on 5/17/17.
 */
public class HomePage extends Config {

    @FindBy(how = How.CSS, using = "#uhc-top-nav-menu li:nth-child(1)")
    public static WebElement home;
    @FindBy(how = How.CSS, using = "#uhc-top-nav-menu li:nth-child(2)")
    public static WebElement individualsANDfamilies;
    @FindBy(how = How.CSS, using = "#uhc-top-nav-menu li:nth-child(3)")
    public static WebElement employers;
    @FindBy(how = How.CSS, using = "#uhc-top-nav-menu li:nth-child(4)")
    public static WebElement medicare;
    @FindBy(how = How.CSS, using = "#uhc-top-nav-menu li:nth-child(4)")
    public static WebElement findAdoctor;

    public static WebElement getHome() {
        return home;
    }

    public static WebElement getIndividualsANDfamilies() {
        return individualsANDfamilies;
    }

    public static WebElement getEmployers() {
        return employers;
    }

    public static WebElement getMedicare() {
        return medicare;
    }

    public static WebElement getFindAdoctor() {
        return findAdoctor;
    }
    public WebElement clickhomeWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return home;
    }
    public WebElement IclickndividualsANDfamilies() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getIndividualsANDfamilies();
    }
    public WebElement clickemployers() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getEmployers();
    }
    public WebElement clickmedicare() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getMedicare();
    }
    public WebElement clickfindadoctor() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getFindAdoctor();
    }
}
