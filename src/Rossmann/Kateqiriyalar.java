package Rossmann;

import Rossmann.Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Kateqiriyalar extends BaseDriver {



    @Test
    public void test(){

        WebElement search=driver.findElement(By.xpath(""));
        search.sendKeys("hair product");

    }

}
