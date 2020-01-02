$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/srima/workspace1/CUCUMBERREPORTS/src/test/java/FeatureFile/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Test Functionaltiy",
  "description": "",
  "id": "login-test-functionaltiy",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Testing guru  webpage",
  "description": "",
  "id": "login-test-functionaltiy;testing-guru--webpage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of the page is guruhomeapge",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "enter the username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_login_page()"
});
formatter.result({
  "duration": 32815762800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_the_page_is_guruhomeapge()"
});
formatter.result({
  "duration": 28225900,
  "error_message": "org.junit.ComparisonFailure: expected:\u003cOrangeHRM[]\u003e but was:\u003cOrangeHRM[1]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepDefinition.LoginStepDefinition.title_of_the_page_is_guruhomeapge(LoginStepDefinition.java:47)\r\n\tat ✽.When title of the page is guruhomeapge(C:/Users/srima/workspace1/CUCUMBERREPORTS/src/test/java/FeatureFile/login.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefinition.enter_the_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});