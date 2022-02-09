package StepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginDef
{
    WebDriver driver;

    @Given("^user is on login page$")
    public void user_is_on_login_page()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
    }
    @Then("^user is clicking on forgot password button$")
    public void user_is_clicking_on_forgot_password_button()
    {
        driver.findElement(By.partialLinkText("Forgot your password?")).click();
        driver.navigate().back();
    }

    @Then("^user enters username in username textbox$")
    public void user_enters_username_in_username_textbox()
    {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

    }
    @Then("^user enters password in password textbox$")
    public void user_enters_password_in_password_textbox()
    {
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    }
    @When("^user clicks on login button$")
    public void user_clicks_on_login_button()
    {
        driver.findElement(By.id("btnLogin")).click();
    }
    @Then("^user is on Homepage$")
    public void user_is_on_Homepage()
    {
        Assert.assertEquals("OrangeHRM",driver.getTitle());
    }
    @Then("^user is logging out$")
    public void user_is_logging_out()
    {
        driver.findElement(By.partialLinkText("Welcome")).click();
        driver.findElement(By.partialLinkText("Logout")).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    @Then("^Closing browser$")
    public void Closing_browser()
    {
        driver.quit();
    }

}




