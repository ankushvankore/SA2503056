Feature: Amazon Links

  Background: 
    Given Launch Amazon site

  Scenario: Test Sell link
    When Click on Sell link
    Then Sell page should display

  Scenario: Test Bestsellers link
    When Click on BestSellers link
    Then Bestsellers page should display

  Scenario: Test Mobiles link
    When Click on Mobiles link
    Then Mobiles page should display

  Scenario: Test Todays deal link
    When Click on Todays deal link
    Then Todays deal page should display
