package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static WebDriver driver;

    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    static String browser = "FireFox";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge"))
        {
            driver = new EdgeDriver();
        }
        else {
            System.out.println("Wrong Browser Name");

        }

        //  2. Open URL
        driver.get(baseUrl);

        // Maximize the browser
        driver.manage().window().maximize();



        //        3. Print the title of the page
        System.out.println("Title of the Page:" + driver.getTitle());
//        4. Print the current url
        System.out.println("Current URL :" + driver.getCurrentUrl());
//        5. Print the page source
        System.out.println("Page Source :" + driver.getPageSource());
//        6. Enter the email to email field

        driver.findElement(By.name("username")).sendKeys("Admin");

//        7. Enter the password to password field

        driver.findElement(By.name("password")).sendKeys("admin123");


//        8. Close the browser
        driver.close();



    }

}

