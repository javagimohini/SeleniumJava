$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature02.feature");
formatterformatter{
  "line{
  "line": 1,
  "name": "Application tests that covers",
  "description": "Links Presence, Successful Registration, Unsuccessful Registration",
  "id": "application-tests-that-covers",
  "keyword": "{
  "line": 8formatter.before({
  "duration": 4812925139,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on the HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "Feature01.launchHomePage()"
});
formatter.result({
  "duration": 5307647061,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "out sc ex",
  "description": "",
  "id": "application-tests-that-covers;out-sc-ex",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@test3"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "I click on women button",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I should see WomenTitle displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Feature02.selectType()"
});
formatter.result({
  "duration": 3142899966,
  "status": "passed"
});
formatter.match({
  "location": "Feature02.validateWomenTitle()"
});
formatter.result({
  "duration": 25088697,
  "status": "passed"
});
formatter.after({
  "duration": 798628542,
  "status": "passed"
});
});serName01",
        "Password01"
      ],
      "line": 18,
      "id": "application-tests-that-covers;multiple-user-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5013968027,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on the HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "Feature01.launchHomePage()"
});
formatter.result({
  "duration": 7134339293,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Multiple User login",
  "description": "",
  "id": "application-tests-that-covers;multiple-user-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@test1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I click on SignIn button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should be on the Authentication page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I enter UserName01 and Password01",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on LogIn button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should be on the MyAccount page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I click on SignOut button",
  "keyword": "And "
});
formatter.match({
  "location": "Feature01.clickSignInBtn()"
});
formatter.result({
  "duration": 2124590883,
  "status": "passed"
});
formatter.match({
  "location": "Feature01.authenticationPageNavigation()"
});
formatter.result({
  "duration": 80217971,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "UserName01",
      "offset": 8
    },
    {
      "val": "Password01",
      "offset": 23
    }
  ],
  "location": "Feature02.setCredentialDetails(String,String)"
});
formatter.result({
  "duration": 355196630,
  "status": "passed"
});
formatter.match({
  "location": "Feature01.logIn()"
});
formatter.result({
  "duration": 1540650889,
  "status": "passed"
});
formatter.match({
  "location": "Feature01.myAccountPageNavigation()"
});
formatter.result({
  "duration": 69488959,
  "status": "passed"
});
formatter.match({
  "location": "Feature01.signOut()"
});
formatter.result({
  "duration": 1634084569,
  "error_message": "java.lang.AssertionError: The following asserts failed:\n\texpected [AUTHENTICATION] but found [AUTHENTICATIONN]\r\n\tat org.testng.asserts.SoftAssert.assertAll(SoftAssert.java:43)\r\n\tat stepDefinitions.Feature01.signOut(Feature01.java:165)\r\n\tat ✽.And I click on SignOut button(Feature02.feature:14)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1341382858,
  "status": "passed"
});
});