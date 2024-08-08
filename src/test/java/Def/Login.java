package Def;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

public class Login {

    WebDriver driver = new ChromeDriver();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver.get("https://demowebshop.tricentis.com/login");
    }

    @When("I enter valid credentials")
    public void i_enter_valid_credentials() {
        WebElement emailField = driver.findElement(By.id("Email"));
        WebElement passwordField = driver.findElement(By.id("Password"));
        emailField.sendKeys("valid@example.com");
        passwordField.sendKeys("validPassword");
    }

    @When("I enter invalid credentials")
    public void i_enter_invalid_credentials() {
        WebElement emailField = driver.findElement(By.id("Email"));
        WebElement passwordField = driver.findElement(By.id("Password"));
        emailField.sendKeys("invalid@example.com");
        passwordField.sendKeys("invalidPassword");
    }

    @When("I submit the login form")
    public void i_submit_the_login_form() {
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
        loginButton.click();
    }

    @Then("I should see the welcome message")
    public void i_should_see_the_welcome_message() {
        WebElement welcomeMessage = driver.findElement(By.className("welcome-message"));
        assertTrue(welcomeMessage.isDisplayed());
    }

    @Then("I should see an error message")
    public void i_should_see_an_error_message() {
        WebElement errorMessage = driver.findElement(By.className("message-error"));
        assertTrue(errorMessage.isDisplayed());
    }
}


