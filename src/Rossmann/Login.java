package Rossmann;

import Rossmann.Utility.BaseDriver;
import Rossmann.Utility.MyFunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login extends BaseDriver {
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
           WebElement cancel=driver.findElement(By.xpath("//*[@id='onetrust-close-btn-container']"));
           cancel.click();
           WebElement login=driver.findElement(By.xpath("//*[@class='w-full Button-module_button--6GOIQ Button-module_primary--0q51X']"));
           login.isSelected();
         WebElement createaccount=driver.findElement(By.xpath("//a[@title='Profil']//*[name()='svg']"));
          createaccount.click();
           WebElement mailadress=driver.findElement(By.xpath("//*[@id='login-user']"));
           mailadress.sendKeys("abilovaygul@gmail.com");
           WebElement password=driver.findElement(By.id("login-password"));
           password.sendKeys("YXt4_A@s-CYK!6g");
         //  WebElement clickbutton=driver.findElement(By.id("id attribute is not available for this element"));
          //  clickbutton.click();

           WebElement robot=driver.findElement(By.xpath("//label[@class='checkbox is-valid']//span[@class='checkbox']"));
           robot.click();
           WebElement hesabyarat=driver.findElement(By.xpath("//*[@class='btn btn-white shadow']"));
           hesabyarat.click();
           WebElement adress=driver.findElement(By.xpath("//*[@id=\"email\"]"));
           adress.sendKeys("abilovaygul@gmail.com");
           WebElement haslo=driver.findElement(By.xpath("//input[@id='password']"));
           haslo.sendKeys("YXt4_A@s-CYK!6g");
           WebElement checkbox=driver.findElement(By.id("id attribute is not available for this element"));
           checkbox.click();
           WebElement checkbox2=driver.findElement(By.xpath("//div[@id='__next']//label[1]//span[1]"));
           checkbox2.click();
           WebElement checkbox3=driver.findElement(By.xpath("//label[2]//span[1]"));
           WebElement notrobot=driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']"));
           notrobot.click();
           WebElement createaccount1=driver.findElement(By.xpath("//button[@type='submit']"));
           createaccount1.click();

           BekleveKapat();

       }

}
