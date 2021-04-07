package stepDefinition;

import cucumber.api.java.en.*;


public class Taggingsteps {

    @Given("This is valid login test")
    public void this_is_valid_login_test() {
       System.out.println("This is login test");
    }

    @Given("This is valid logout test")
    public void this_is_valid_logout_test() {
        System.out.println("This is logout test");
    }

    @Given("This is search test")
    public void this_is_search_test() {
        System.out.println("This is search test");
    }

    @Given("This is advanced search test")
    public void this_is_advanced_search_test() {
        System.out.println("This is advanced search test");
    }

    @Given("This is prepaid recharge test")
    public void this_is_prepaid_recharge_test() {
        System.out.println("This is prepaid recharge test");
    }

    @Given("This is postpaid recharge test")
    public void this_is_postpaid_recharge_test() {
        System.out.println("This is postpaid recharge test");
    }


}
