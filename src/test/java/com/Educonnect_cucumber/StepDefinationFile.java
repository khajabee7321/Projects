package com.Educonnect_cucumber;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationFile {
public static Logger Log = Logger.getLogger(StepDefinationFile.class.getName());

	

	WebDriver driver;
	//String Expected =driver.getTitle();
	String Actual ="Student_Login";

	@Given("the user navigates to the login page")
	public void the_user_navigates_to_the_login_page() {
DOMConfigurator.configure("log4j2.xml");
		driver=new ChromeDriver();
		driver.get("https://educonnectindia.com/Studentlogin");
		Log.info("application is open");
	    
	
	}

	@When("the user enters {string} and {string}")
	public void the_user_enters_and(String username, String password) throws InterruptedException {
		DOMConfigurator.configure("log4j.xml");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		
	
	}

	@When("User click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		DOMConfigurator.configure("log4j2.xml");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		System.out.println(driver.getTitle());
		Log.info("Login is completed");
	
	}

	@When("Verify the Title of the page")
	public void verify_the_title_of_the_page() {
		   DOMConfigurator.configure("log4j2.xml");
		   if(driver.getTitle().equals("Student Login - Educonnect")) {
			   System.out.println("Title matched+  Testcase is pass");
		   }
		   else {
			   System.out.println(driver.getTitle());
			   System.out.println("Title not matched+   Testcase is fail");
               Log.info("Title not matched+   Testcase is fail");

		   }		
	}

	@Then("the user should be logged in successfully and redirected to the dashboard")
	public void the_user_should_be_logged_in_successfully_and_redirected_to_the_dashboard() {
		System.out.println("Home page is displayed.");
		Log.info("home page is displayed.");
		driver.close();		
	}

//ContactUs
	
	
	@Given("OpenApplication")
	public void open_application() throws InterruptedException {
	    driver=new ChromeDriver();
	    driver.get("https://educonnectindia.com/");
	    driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	    Thread.sleep(3000);
	    Actions ac=new Actions(driver);
	    ac.keyDown(Keys.TAB);
	    ac.build().perform();
	    Thread.sleep(2000);
	    ac.keyDown(Keys.TAB);
	    ac.build().perform();
	    Thread.sleep(2000);
	    ac.keyDown(Keys.TAB);
	    ac.build().perform();
	    Thread.sleep(2000);
	    ac.keyDown(Keys.TAB);
	    ac.build().perform();
	    Thread.sleep(2000);
	    ac.keyDown(Keys.TAB);
	    ac.build().perform();
	    Thread.sleep(2000);
//	    ac.keyDown(Keys.TAB);
//	    ac.build().perform();
//	    Thread.sleep(2000);
	    ac.sendKeys(Keys.ENTER);
	    ac.build().perform();

	    
//	    WebElement contactus=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/a[1]"));
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//        js.executeScript("arguments[0].click();", contactus);
	    

	    
	}

	
	
	@When("Fill the all fields")
	public void fill_the_all_fields() throws InterruptedException {
		Thread.sleep(5000);
	   // driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[2]/a[4]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div[2]/div[1]/form/div/input[1]")).sendKeys("khajabee");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div[2]/div[1]/form/div/input[2]")).sendKeys("kcgrch@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div[2]/div[1]/form/div/input[3]")).sendKeys("8888888888");
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div[2]/div[1]/form/div/button")).click();
        System.out.println("Form Submitted successfully.");
	}

	@Then("Close Application")
	public void close_application() {
		driver.close();	
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////////////////


	@Given("the Open Vital page is displayed")
	public void the_open_vital_page_is_displayed() throws InterruptedException {
  driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("http://vitalmiles.com/");
  Thread.sleep(5000);
  System.out.println("vital mile is open");
  Log.info("Vital mile is open");
	
	
	}

	@Given("I click on the contact us button")
	public void i_click_on_the_contact_us_button() throws InterruptedException {
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"root\"]/nav[2]/ul/li[4]/a")).click();
    Thread.sleep(2000);
    Log.info("Contact Us link is clicked");
    
	
	
	}

	@When("I enter the first name {string} and last name {string}")
	public void i_enter_the_first_name_and_last_name(String firstname, String lastname) throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys(firstname);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys(lastname);
	Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("7678989000");
    
  
	
	}

	@When("I enter the email {string} and message {string}")
	public void i_enter_the_email_and_message(String email, String message) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"message\"]")).sendKeys(message);
		
       
	
	}

	@Then("I click on the submit button")
	public void i_click_on_the_submit_button() throws InterruptedException {
  Thread.sleep(3000);
  driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div/div/form/div/div[7]/button")).click();
  Thread.sleep(3000);
  Log.info( "Form subbimitted successfully.");
  driver.close();
  
	
	}
	
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@When("Enter Firstname")
	public void enter_firstname() throws InterruptedException {
		Thread.sleep(2000);
		Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("testing");
	}
    
	@When("Enter Contact Number")
	public void enter_contact_number() throws InterruptedException {
	    driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("7890000000");
	    Thread.sleep(2000);
		
	}

	@When("Upload resume")
	public void upload_resume() throws AWTException, InterruptedException {
	    WebElement resume=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/form/div[5]/label"));
	    resume.click();
	    try {
            // Give time for the dialog to open
            Thread.sleep(2000); // Consider using WebDriverWait instead
            System.out.println(driver.getTitle());
            // Create a Robot instance
            Robot robot = new Robot();

            // Set the file path to the clipboard
            String filePath = "C:\\Users\\ASUS\\Downloads\\images_resumes_1734569990227 (12).pdf"; // Change to your file path
            StringSelection stringSelection = new StringSelection(filePath);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

            // Simulate Ctrl + V to paste the file path
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            // Press Enter to upload the file
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
  Log.info("resume is uploaded.");
        // Wait for the file to upload (you can adjust this depending on the page's behavior)
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(4000);
        //.close();	
	}


@When("Click on Career link")
public void click_on_career_link() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"root\"]/nav[2]/ul/li[3]/a")).click();


}


@When("Click on submit button")
public void click_on_submit_button() {
          //driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/form/div[6]/button")).click();
	      driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/form/div[6]/butto")).click();

}
@Then("Close application3")
public void close_application3() {
driver.close();


}
}
