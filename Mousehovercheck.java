package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mousehovercheck extends Main {
    @Test (priority = 10)
    private void mouseHover() {
        launchBrowser();
        try {
            driver.get("http://localhost:7080/hovers");
            Actions action = new Actions(driver);
            WebElement a = driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/img[1]"));
            action.moveToElement(a).build().perform();
            Thread.sleep(1000);


            action.moveToElement(driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[2]/img[1]"))).build()
                    .perform();
            Thread.sleep(1000);
            action.moveToElement(driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[3]/img[1]"))).build()
                    .perform();
        } catch (InterruptedException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }


    }


}
