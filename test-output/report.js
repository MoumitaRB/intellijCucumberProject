$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/IdeaProjects/SeleniumCucumber/Features/OrangeHRMTagging.feature");
formatter.feature({
  "name": "OrangeHRM tagging concept",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verifying job title of the searched employee",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@End2End"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "User launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "OrangeHRMTaggingSteps.user_launch_Chrome_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User opens OrangeHRM homepage",
  "keyword": "When "
});
formatter.match({
  "location": "OrangeHRMTaggingSteps.user_opens_OrangeHRM_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters username as \"Admin\" and password as \"admin123\"",
  "keyword": "And "
});
formatter.match({
  "location": "OrangeHRMTaggingSteps.user_enters_username_as_and_password_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User  clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "OrangeHRMTaggingSteps.user_clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on PIM tab",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMTaggingSteps.user_clicks_on_PIM_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on Employee List tab",
  "keyword": "And "
});
formatter.match({
  "location": "OrangeHRMTaggingSteps.user_clicks_on_Employee_List_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters employee name in employee name box",
  "keyword": "And "
});
formatter.match({
  "location": "OrangeHRMTaggingSteps.user_enters_employee_name_in_employee_name_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click on search button",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMTaggingSteps.user_click_on_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Search the job title from the table",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMTaggingSteps.search_the_job_title_from_the_table()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "OrangeHRMTaggingSteps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});