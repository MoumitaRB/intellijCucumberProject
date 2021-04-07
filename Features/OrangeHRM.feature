Feature:OrangeHRMLogin
  #Test1
  Scenario: Logo presence on OrangeHRM home page
    Given I launch chrome browser
    When I open orangeHRM home page
    Then I verify that the logo present on the page
    And  close  browser

    #Simple login test2
  Scenario:Login to OrangeHRM by valid credentials
    Given I launch chrome browser
    When I open orangeHRM home page
    And Enter username and password
    And click on login button
    Then User must successfully login to the Dashboard page
    And close  browser

    # test3:Simple login test with passing parameters to steps
  Scenario:Login to OrangeHRM by valid credentials
    Given I launch chrome browser
    When I open orangeHRM home page
    And Enter username "Admin" and password "admin123"
    And click on login button
    Then User must successfully login to the Dashboard page
    And close  browser

     # test4:Simple login DDT-passing multiple parameters using scenario outline and example keywords
  Scenario Outline:Login to OrangeHRM by multiple credentials
    Given I launch chrome browser
    When I open orangeHRM home page
    And Enter username "<username>" and password "<password>"
    And click on login button
    Then User must successfully login to the Dashboard page
    And close  browser

    Examples:
      | username | password |
      | Admin    | admin123 |
      | admin | admin12   |

     # test5:Simple login DDT-passing parameters using data table

  Scenario:Login to OrangeHRM with data table parameters
    Given I launch chrome browser
    When I open orangeHRM home page
    And Enter username  and password from data table
    | Admin | admin123 |
    And click on login button
    Then User must successfully login to the Dashboard page
    And close  browser
