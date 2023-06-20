package TestoweProby;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testLogowanie {
        ChromeDriver driver;
        String url = "https://www.demo.guru99.com/v4/";

        @Test
        public void invokeBrowser() {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\wiole\\OneDrive\\Pulpit\\tester_automatyzujący\\kody\\Selenium\\lib\\chromedriver.exe");
            driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.get(url);
        }

        @Test
        public void verifyTitle() {
            String expectedT = "Guru99 Bank Home Page";

            String actualT = driver.getTitle();

            Assert.assertEquals(actualT, expectedT);
        }
        @Test
        public void verifyLoginTo() {
            WebElement userId = driver.findElement(By.name("uid"));

            WebElement userPassword = driver.findElement(By.name("password"));

            WebElement loginBut = driver.findElement(By.name("btnLogin"));

            userId.sendKeys("mngr509439");
            userPassword.sendKeys("manedEt");

            loginBut.click();
        }

        @Test
        public void addCustomer() {
            WebElement addCustomerLink = driver.findElement(By.linkText("New Customer"));

            addCustomerLink.click();
            driver.findElement(By.xpath("//input[@value='f']")).click();
            driver.findElement(By.name("name")).sendKeys("test");
            driver.findElement(By.name("dob")).sendKeys("09/03/2000");
            driver.findElement(By.name("addr")).sendKeys("test");
            driver.findElement(By.name("city")).sendKeys("test");
            driver.findElement(By.name("state")).sendKeys("test");
            driver.findElement(By.name("pinno")).sendKeys("test");
            driver.findElement(By.name("telephoneno")).sendKeys("123456789");
            driver.findElement(By.name("emailid")).sendKeys("abc@test.com");
            driver.findElement(By.name("password")).sendKeys("test");
            driver.findElement(By.name("sub")).click();

        }
    @Test(priority = 400)
    public void getCustomerId() {
        String customerID = driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
        System.out.println("Customer ID: " + customerID);
    }

}
