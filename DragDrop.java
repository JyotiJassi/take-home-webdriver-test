package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragDrop extends Main {
    @Test (priority = 4)
    private void dragDrop() {
        launchBrowser();
        driver.get("http://localhost:7080/drag_and_drop");
        Actions ac = new Actions(driver);
        WebElement source = driver.findElement(By.id("column-a"));
        WebElement target = driver.findElement(By.id("column-b"));
        ac.dragAndDrop(source, target).build().perform();

    }
}
