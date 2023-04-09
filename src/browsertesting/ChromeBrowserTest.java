package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {
//        1. Setup chrome browser

        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        WebDriver driver = new ChromeDriver();

//        2. Open URL
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
        // We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//        8. Close the browser
         driver.close();


    }
}
