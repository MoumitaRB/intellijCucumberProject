package stepDefinition;

import cucumber.api.java.en.*;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class OrangeHRMsteps {
    WebDriver driver;

    @Given("I launch chrome browser")
    public void i_lauch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver","C:\\Work\\drivers\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
    }

    @When("I open orangeHRM home page")
    public void i_open_orangeHRM_home_page() {
        driver.get("https://opensource-demo.orangehrmlive.com");

    }

    @Then("I verify that the logo present on the page")
    public void i_verify_that_the_logo_present_on_the_page() {
         boolean dispalystatus=driver.findElement(By.xpath("//div[@id='divLogo']//img")).isDisplayed();
        Assert.assertEquals(true,dispalystatus);

    }
    @And("close  browser")
    public void close_browser() {
        driver.close();
    }

    @When("Enter username and password")
    public void enter_username_and_password() {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");

    }

    @When("click on login button")
    public void click_on_login_button() {
        driver.findElement(By.id("btnLogin")).click();
    }

    @Then("User must successfully login to the Dashboard page")
    public void user_must_successfully_login_to_the_Dashboard_page() {

      String text=driver.findElement(By.xpath("//b[contains(text(),'Dashboard')]")).getText();
      Assert.assertEquals(text,"Dashboard");
    }

    @When("Enter username {string} and password {string}")
    public void enter_username_and_password(String uname, String pwd) {
        driver.findElement(By.id("txtUsername")).sendKeys(uname);
        driver.findElement(By.id("txtPassword")).sendKeys(pwd);
    }
    @When("Enter username  and password from data table")
    public void enter_username_and_password_from_data_table(DataTable credentials) {
      List<List<String>> data= credentials.asLists(String.class);
      driver.findElement(By.id("txtUsername")).sendKeys(data.get(0).get(0));
      driver.findElement(By.id("txtPassword")).sendKeys(data.get(0).get(1));

    }

}
