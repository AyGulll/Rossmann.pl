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
        WebElement cancel=driver.findElement(By.xpath("//*[@id='onetrust-reject-all-handler']"));
        cancel.click();
        WebElement login=driver.findElement(By.xpath("//*[@class='NavUserButtons-module_dropBtn--qqaUv']"));
        login.click();
        WebElement daxilol=driver.findElement(By.xpath("//a[@title='Profil']//*[name()='svg']"));
        daxilol.click();
        WebElement mail=driver.findElement(By.xpath("//div[@class='login-form__wrapper']//div[1]//div[1]//input[1]"));
        mail.sendKeys("test1234@gmil.com");
        WebElement password=driver.findElement(By.xpath("//div[@id='__next']//div[2]//div[1]//input[1]"));
        password.sendKeys("54321Trewq!");
        WebElement rememberme=driver.findElement(By.id("//*[@name='stayLoggedIn']"));
        rememberme.click();

        MyFunction.wait(1);
        WebElement logout=driver.findElement(By.xpath(""));
        logout.click();

        MyFunction.wait(1);
        BekleveKapat();

    }
}
