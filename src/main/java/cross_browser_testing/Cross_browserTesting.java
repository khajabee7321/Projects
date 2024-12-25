package cross_browser_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cross_browserTesting {
public static void main(String[] args) throws InterruptedException {
    WebDriver driver = null;
    String browser = "chrome"; // You can change this to "firefox", "edge", etc.

    // Using switch case to select browser
    switch (browser.toLowerCase()) {
        case "chrome":
            driver = new ChromeDriver();
            driver.get("https://educonnectindia.com/");
            Thread.sleep(4000);
            driver.close();
            //break;
        case "firefox":
            driver = new FirefoxDriver();
            driver.get("https://educonnectindia.com/");
            Thread.sleep(4000);
            driver.close();
            //break;
        case "edge":
            driver = new EdgeDriver();
            driver.get("https://educonnectindia.com/");
            Thread.sleep(4000);
            driver.close();
            break;
        default:
            System.out.println("Unsupported browser");
            return;
    } 
    
    try {
        // Common test steps for all browsers
        driver.get("https://educonnectindia.com/");
        System.out.println("Page title: " + driver.getTitle());

        // Example assertion (can be improved based on your test case)
        if (driver.getTitle().equals("Edu Connect")) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed.");
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        if (driver != null) {
            driver.quit(); // Close the browser after test execution
        }
    }
	
}
}
