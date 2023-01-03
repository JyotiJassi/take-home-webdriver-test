package org.example;

import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.testng.annotations.Test;
import org.testng.xml.LaunchSuite;

public class JavaScriptError extends Main{
    @Test (priority = 9)

    private void findJavaScriptError() {


        launchBrowser();
        driver.get("http://localhost:7080/javascript_error");
        LogEntries log = driver.manage().logs().get(LogType.BROWSER);
        for (LogEntry entry : log) {
            System.out.println(entry + "Hello");
        }
    }

}
