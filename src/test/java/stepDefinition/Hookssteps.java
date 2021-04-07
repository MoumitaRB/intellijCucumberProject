package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Hookssteps {
    WebDriver driver;
    @Before
    public void setUp()throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","C:\\Work\\drivers\\chromedriver_win32\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
    }
    @After
    public void tearDown()
    {
        driver.quit();
    }
    @Given("user is on add customer page")
    public void user_is_on_add_customer_page() {
        driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']//b[text()='Admin']")).click();
        driver.findElement(By.id("btnAdd")).click();

    }



    @When("user fills the customer details")
    public void user_fills_the_customer_details() {
        driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("John Smith");
        driver.findElement(By.id("systemUser_userName")).sendKeys("john_smith1698");

    }



    @Then("customer is added")
    public void customer_is_added() {

        driver.findElement(By.id("btnSave")).click();

    }



    @Given("user is on edit customer page")
    public void user_is_on_edit_customer_page() {

        System.out.println("user is on edit customer page");
    }



    @When("user edits the contact detailed")
    public void user_edits_the_contact_detailed() {
        System.out.println("user edits the contact details");
    }



    @Then("contact detailed updated")
    public void contact_detailed_updated() {
        System.out.println("user updated the contact details");
    }



    @Given("user is on delete customer page")
    public void user_is_on_delete_customer_page()
    {
        driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']//b[text()='Admin']")).click();

    }



    @When("user deletes the customer")
    public void user_deletes_the_customer()throws InterruptedException
    {
        System.out.println("user deletes the customer");
        List<WebElement> rows=driver.findElements(By.xpath("//table//tbody//tr"));
        for(int r=1; r<=rows.size(); r++)
        {
           String act_text= driver.findElement(By.xpath("//table//tbody//tr["+r+"]//td[2]")).getText();
           if(act_text.equals("john_smith1698"))
           {
               driver.findElement(By.xpath("//table//tbody//tr["+r+"]//td[1]")).click();
               driver.findElement(By.xpath("//input[@id='btnDelete']")).click();
               driver.findElement(By.id("dialogDeleteBtn")).click();
           }

        }
        Thread.sleep(3000);
    }




    @Then("customer deleted")
    public void customer_deleted()throws InterruptedException
    {
        //System.out.println("user deleted the contact details");
        List<WebElement> rows=driver.findElements(By.xpath("//table//tbody//tr"));
        for(int r=1; r<=rows.size(); r++)
        {
            String act_text= driver.findElement(By.xpath("//table//tbody//tr["+r+"]//td[2]")).getText();
            if(act_text.equals("john_smith1698"))
            {
                System.out.println("deleted the customer is unsuccessful");
            }
            else
            {
                System.out.println("user deleted the customer successfully");
            }

        }
        Thread.sleep(10000);


    }

}
