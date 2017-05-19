package Perform;

import Base.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by smhoque on 5/8/17.
 */
public class Regitration extends Config{
    @Test(priority = 1, description = "This test will verify user can resgister cigma account")
    public void search(){
        System.out.println(driver.getCurrentUrl());
        clickByXpath(".//*[@id='1386067114266']/div[4]/div/div[1]/div/div[1]/div/div[1]/ul/li[1]/a/span");
    }
   /* public void cigmaRegistration(){
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath(".//*[@id='login']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='userForm']/fieldset[3]/div/a[1]")).click();

        driver.findElement(By.xpath(".//*[@id='fname']")).sendKeys("Sm");
        driver.findElement(By.xpath(".//*[@id='lname']")).sendKeys("hoque");

        WebElement month_select = driver.findElement(By.id("month"));
        Select select = new Select(month_select);
        select.selectByIndex(4);
    }
    */
}
