$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Amazon operation",
  "description": "",
  "id": "amazon-operation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AmazonSuite"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Login to Amazon user account",
  "description": "",
  "id": "amazon-operation;login-to-amazon-user-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@T-AmazonLogin"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I navigate to Amazon login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter valid login credential for amazon",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I should navigate to logged in page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});