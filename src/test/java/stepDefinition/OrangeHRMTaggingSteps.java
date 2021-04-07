package stepDefinition;

import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

public class OrangeHRMTaggingSteps {
    public WebDriver driver;

    @Given("User launch Chrome browser")
    public void user_launch_Chrome_browser() {
        System.setProperty("webdriver.chrome.driver","C:\\Work\\drivers\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();


    }

    @When("User opens OrangeHRM homepage")
    public void user_opens_OrangeHRM_homepage()throws InterruptedException {
       driver.get("https://opensource-demo.orangehrmlive.com");
       driver.manage().window().maximize();
       Thread.sleep(3000);
    }

    @When("User enters username as {string} and password as {string}")
    public void user_enters_username_as_and_password_as(String username, String password) {
        driver.findElement(By.id("txtUsername")).sendKeys(username);
        driver.findElement(By.id("txtPassword")).sendKeys(password);


    }

    @When("User  clicks on login button")
    public void user_clicks_on_login_button()throws InterruptedException {
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(3000);

    }

    @Then("User must successfully verify dashboard page")
    public void user_must_successfully_verify_dashboard_page()throws InterruptedException {
        String act_title=driver.getTitle();
        if(act_title.equals("OrangeHRM"))
        {
            Assert.assertTrue(true);
        }
        else
        {
            Assert.assertTrue(false);
        }
        Thread.sleep(3000);
    }

    @Then("Close browser")
    public void close_browser() {
        driver.quit();
    }

    @Then("User click on directory tab")
    public void user_click_on_directory_tab()throws InterruptedException {
        driver.findElement(By.xpath("//b[contains(text(),'Directory')]")).click();
        Thread.sleep(3000);
    }

    @Then("User enter employee name in search box")
    public void user_enter_employee_name_in_search_box() {
        driver.findElement(By.id("searchDirectory_emp_name_empName")).sendKeys("Fiona Grace");
    }

    @Then("User click on search button")
    public void user_click_on_search_button()throws InterruptedException {
       driver.findElement(By.id("searchBtn")).click();
       Thread.sleep(2000);
    }

    @Then("User verifying employee name in the table")
    public void user_verifying_employee_name_in_the_table() throws InterruptedException{
       String act_name= driver.findElement(By.xpath("//b[contains(text(),'Fiona Grace')]")).getText();
       if(act_name.equals("Fiona Grace"))
       {
           Assert.assertTrue(true);
       }
       else
       {
           Assert.assertTrue(false);
       }
       Thread.sleep(3000);
    }

//    @Then("Click on logout button")
//    public void click_on_logout_button()throws InterruptedException {
//        driver.findElement(By.id("welcome")).click();
//        //driver.findElement(By.linkText("Logout")).click();
//        WebElement ele=driver.findElement(By.linkText("Logout"));
//        JavascriptExecutor js= (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click()",ele );
//        Thread.sleep(3000);
//    }

    @Then("User clicks on PIM tab")
    public void user_clicks_on_PIM_tab()throws InterruptedException {
       driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
       Thread.sleep(2000);

    }

    @Then("User clicks on Employee List tab")
    public void user_clicks_on_Employee_List_tab()throws InterruptedException {
        driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']")).click();
        Thread.sleep(2000);

    }

    @Then("User enters employee name in employee name box")
    public void user_enters_employee_name_in_employee_name_box() throws InterruptedException{
        driver.findElement(By.name("empsearch[employee_name][empName]")).sendKeys("Jasmine Morgan");
        Thread.sleep(2000);
    }

    @Then("Search the job title from the table")
    public void search_the_job_title_from_the_table()throws InterruptedException {
       List<WebElement> rownum=driver.findElements(By.xpath("//table[@id='resultTable']//tbody//tr"));
       for(int r=1; r<=rownum.size(); r++)
        {
            String act_name=driver.findElement(By.xpath("//table[@id='resultTable']//tbody//tr["+r+"]//td[3]")).getText();
            if(act_name.equals("Jasmine"))
            {
               String act_jobtitle= driver.findElement(By.xpath("//table[@id='resultTable']//tbody//tr["+r+"]//td[5]")).getText();
               if(act_jobtitle.equals("Account Clerk"))
               {
                   Assert.assertTrue(true);
               }
               else
               {
                   Assert.assertTrue(false);
               }
            }

        }
       Thread.sleep(3000);
    }

}
