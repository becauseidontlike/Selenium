package seleniumScripts;


import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {
        ChromeDriver driver;
        String url = "http://demo.guru99.com/v4";

        public void invokeBrowser() {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\wiole\\OneDrive\\Pulpit\\tester_automatyzujący\\kody\\Selenium\\lib\\chromedriver.exe");

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(url);
        }

        public void getTitle() {
            String titleOfThePage = driver.getTitle();
            System.out.println("Title of the page is... " + titleOfThePage);
        }

        public void closeThePage() {
            //driver.close();
            driver.quit();
        }

        public static void main(String[] args) {
            WorkingWithChrome wc = new WorkingWithChrome();
            wc.invokeBrowser();
            wc.getTitle();
            wc.closeThePage();
        }
}

