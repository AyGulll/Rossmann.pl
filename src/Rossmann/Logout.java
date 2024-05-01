package Rossmann;

import Rossmann.Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Logout extends BaseDriver {

    @Test

    public void LogoutTest(){
        driver.get("https://www.rossmann.pl/");
        WebElement login=driver.findElement(By.xpath(""));
        login.click();

    }
}
