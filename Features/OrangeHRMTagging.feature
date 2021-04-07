Feature: OrangeHRM tagging concept

  @Sanity
  Scenario: Verify Login test
    Given User launch Chrome browser
    When User opens OrangeHRM homepage
    And User enters username as "Admin" and password as "admin123"
    And User  clicks on login button
    Then User must successfully verify dashboard page
    Then Close browser

    @Regression
  Scenario: Search employee from directory
    Given User launch Chrome browser
    When User opens OrangeHRM homepage
    And User enters username as "Admin" and password as "admin123"
    And User  clicks on login button
    Then User click on directory tab
    And User enter employee name in search box
    And User click on search button
    Then User verifying employee name in the table
    #Then Click on logout button
    And Close browser


      @End2End
    Scenario:Verifying job title of the searched employee
      Given User launch Chrome browser
      When User opens OrangeHRM homepage
      And User enters username as "Admin" and password as "admin123"
      And User  clicks on login button
      Then User clicks on PIM tab
      And User clicks on Employee List tab
      And User enters employee name in employee name box
      Then User click on search button
      Then Search the job title from the table
      And Close browser