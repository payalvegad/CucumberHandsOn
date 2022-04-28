$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Retail.feature");
formatter.feature({
  "name": "Signin feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify Login page for the application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User Logged In",
  "keyword": "Given "
});
formatter.step({
  "name": "Enter Username \"\u003cusername\u003e\" and Password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User Logged in to the Home page",
  "keyword": "When "
});
formatter.step({
  "name": "New Coupon Created",
  "keyword": "And "
});
formatter.step({
  "name": "Coupon Validated then Edited",
  "keyword": "Then "
});
formatter.step({
  "name": "Coupon Deleted",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "",
        "password"
      ]
    },
    {
      "cells": [
        "admin",
        "",
        "Admin@123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify Login page for the application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Logged In",
  "keyword": "Given "
});
formatter.match({
  "location": "mainClass.user_navigated_to_the_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Username \"admin\" and Password \"Admin@123\"",
  "keyword": "And "
});
formatter.match({
  "location": "mainClass.enter_Username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Logged in to the Home page",
  "keyword": "When "
});
formatter.match({
  "location": "mainClass.user_navigated_to_the_Homepage_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "New Coupon Created",
  "keyword": "And "
});
formatter.match({
  "location": "mainClass.couponCreation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Coupon Validated then Edited",
  "keyword": "Then "
});
formatter.match({
  "location": "mainClass.couponCreationValidation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Coupon Deleted",
  "keyword": "And "
});
formatter.match({
  "location": "mainClass.DeleteCoupon()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});