@regression @login_tests
Feature: Amazon Demo Functionalities

  Background: 
    Given user is on the main Amazon page

  @smoke_tests
  Scenario: Amazon demo valid login
    # Given user is on the login page
    When verify amazon page title
    And verify dropdown value is by default "All Departments"
    And select department "Home & Kitchen" and search "coffee mug"
    And verify you are on "coffee mug" search result page
    Then verify that you are in "Home & Kitchen" department page
