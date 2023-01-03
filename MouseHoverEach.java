package org.example;

import graphql.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverEach extends Main {
    @Test (priority = 11)
    private void validateMouseHoverOnEachImageWithAdditionalInfo() {

        driver.get("http://localhost:7080/hovers");
        Actions action = new Actions(driver);
        WebElement w = driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/img[1]"));
        action.moveToElement(w).build().perform();
        WebElement first = driver.findElement(By.xpath("//h5[contains(text(),'name: user1')]"));
        Assert.assertTrue(first.isDisplayed());
        //Thread.sleep(1000);

    }
}
