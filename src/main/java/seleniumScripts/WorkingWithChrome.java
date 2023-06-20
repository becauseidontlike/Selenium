package seleniumScripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {
        ChromeDriver driver;
        String url = "https://www.shecodes.io/";

        public void invokeBrowser() {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\wiole\\Downloads\\chromedriver_win32\\chromedriver.exe");
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

