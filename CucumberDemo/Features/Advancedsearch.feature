Feature: Ebay Page scenarios

  @P3 @setg @Test
  Scenario: Checking if Logo works
    Given I am on Ebay Advanced Page
    When I Click on Ebay Logo
    Then I navigate to Ebay home page

  @P5
  Scenario: Usage of Advanced search using Data tables
    Given I am on Ebay Advanced Page
    When I enter the details
      | keyword | exclude | start | end   |
      | phone   | iphone  |  5000 | 50000 |
  
