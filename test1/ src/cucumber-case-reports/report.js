$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/case_study/login_page.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Successful login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Poorna in valid page",
  "keyword": "Given "
});
formatter.step({
  "name": "Poorna enters \u003cuname\u003e as uname",
  "keyword": "When "
});
formatter.step({
  "name": "Poorna enters \u003cpwd\u003e as pwd",
  "keyword": "And "
});
formatter.step({
  "name": "successful login",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "uname",
        "pwd"
      ]
    },
    {
      "cells": [
        "AlexUser",
        "Alex123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Successful login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Poorna in valid page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginCase.poorna_in_valid_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Poorna enters AlexUser as uname",
  "keyword": "When "
});
formatter.match({
  "location": "LoginCase.poorna_enters_AlexUser_as_uname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Poorna enters Alex123 as pwd",
  "keyword": "And "
});
formatter.match({
  "location": "LoginCase.poorna_enters_Alex_as_pwd(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "successful login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginCase.successful_login()"
});
formatter.result({
  "status": "passed"
});
});