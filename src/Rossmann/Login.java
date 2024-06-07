package Rossmann;

import Rossmann.Utility.BaseDriver;
import Rossmann.Utility.MyFunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login<JavascriptExecutor> extends BaseDriver {
    public static WebDriver driver;

    @Test

        public void LoginTest(){
    }

    {
           driver=new ChromeDriver();
           driver.get("https://www.rossmann.pl/");
           driver.manage().window().maximize();
           MyFunction.wait(2);
           WebElement profil=driver.findElement(By.xpath("//*[@class='NavUserButtons-module_dropBtn--qqaUv']"));
           profil.click();
           WebElement cancel=driver.findElement(By.xpath("//*[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']"));
           cancel.click();
           WebElement createaccount=driver.findElement(By.xpath("//a[@title='Profil']//*[name()='svg']"));
          createaccount.click();
           WebElement mailadress=driver.findElement(By.xpath("//input[@id='login-user']"));
           mailadress.sendKeys("test1234@gmil.com");
           WebElement password=driver.findElement(By.xpath("//input[@id='login-password']"));
           password.sendKeys("54321Trewq!");

           WebElement robot=driver.findElement(By.xpath("//label[@class='checkbox is-valid']//span[@class='checkbox']"));
           robot.click();
           WebElement hesabyarat=driver.findElement(By.xpath("//*[@class='btn btn-white shadow']"));
           hesabyarat.click();
           WebElement adress=driver.findElement(By.xpath("//*[@id=\"email\"]"));
           adress.sendKeys("test1234@gmil.com");
           WebElement haslo=driver.findElement(By.xpath("//input[@id='password']"));
           haslo.sendKeys("54321Trewq!");
           JavascriptExecutor js = (JavascriptExecutor) driver;
           WebElement checkbox2=driver.findElement(By.xpath("//div[@id='__next']//label[1]//span[1]"));
           checkbox2.click();
          WebElement checkbox3=driver.findElement(By.xpath("//label[@class='checkbox my-2 is-valid'][1]"));
          checkbox3.click();
           WebElement notrobot=driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']"));
           notrobot.click();
           WebElement createaccount1=driver.findElement(By.xpath("//button[@type='submit']"));
           createaccount1.click();

           //WebElement firstElement = driver.findElement(By.xpath("(//*[@class='your-class-name'])[1]")); // İlk elementi seçer
        //WebElement secondElement = driver.findElement(By.xpath("(//*[@class='your-class-name'])[2]")); // İkinci elementi seçer

           BekleveKapat();

       }

}
