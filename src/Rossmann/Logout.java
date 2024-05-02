package Rossmann;

import Rossmann.Utility.BaseDriver;
import Rossmann.Utility.MyFunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Logout extends BaseDriver {

    @Test

    public void LogoutTest(){
        driver.get("https://www.rossmann.pl/");
        WebElement login=driver.findElement(By.xpath(""));
        login.click();

        WebElement mail=driver.findElement(By.xpath(""));
        mail.sendKeys("abilovaygul@gmail.com");

        WebElement password=driver.findElement(By.xpath(""));
        password.sendKeys("YXt4_A@s-CYK!6g");
        WebElement clickgiris=driver.findElement(By.id(""));
        clickgiris.click();
        MyFunction.wait(1);
        WebElement logout=driver.findElement(By.xpath(""));
        logout.click();

        MyFunction.wait(1);

    }
}
