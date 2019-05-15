$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM login feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM login test scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user should navigate to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 11166587329,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_username_and_password()"
});
formatter.result({
  "duration": 310606915,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.clicks_on_login_button()"
});
formatter.result({
  "duration": 4467521329,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_should_navigate_to_home_page()"
});
formatter.result({
  "duration": 197709216,
  "status": "passed"
});
});