Feature: Signin feature

  @Regression
  Scenario Outline: Verify Login page for the application

    Given User Logged In
    And Enter Username "<username>" and Password "<password>"
    When User Logged in to the Home page
    And New Coupon Created
    Then Coupon Validated then Edited
    And Coupon Deleted

 Examples:
    |username| |password|
    |admin        | |Admin@123        |



