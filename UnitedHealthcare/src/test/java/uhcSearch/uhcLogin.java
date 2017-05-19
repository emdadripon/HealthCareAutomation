package uhcSearch;

import Base.Config;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by smhoque on 5/7/17.
 */
public class uhcLogin extends Config {
    @Test
    public void search(){
        System.out.println(driver.getCurrentUrl());
        clickByXpath(".//*[@id='topnavmenu']/li[2]/a");
    }


}
