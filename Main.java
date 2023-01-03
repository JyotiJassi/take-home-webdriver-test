package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Main {
    public WebDriver driver;
    public String baseUrl="http://localhost:7080/login";
    @BeforeTest
    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver","D:\\\\eclipse\\\\eclipse\\\\ChromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
        driver=new ChromeDriver();

    }
    @Test
    public void VerifyHomepageTitle() throws InterruptedException{
        System.out.println("Home page verify");
       // driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
    }
    @Test (priority = 1)
    public void login()
    {
        driver.get(baseUrl);
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        String expectedUrl= driver.getCurrentUrl();
        String actualUrl="The Internet";
        if(actualUrl.equalsIgnoreCase(expectedUrl)) {
            System.out.println("Test passed"); }
        else
        {
            System.out.println("Test failed");
        }
    }
    @Test
        public void f() throws InterruptedException {

       /* driver.get("http://localhost:7080/context_menu");
        Actions action = new Actions(driver);
        Webelement link =driver.findElement(By.id("hot-spot"));
        action.doubleClick(link).perform();
        //Switch to the alert box and click on OK button
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert Text\n" +alert.getText());
        alert.accept();
        //Closing the driver instance
        //driver.quit();
        driver.close();  */
    }
    @AfterTest
    public void afterTest() {
        //driver.quit();
    }







}