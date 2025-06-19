Feature: Registration Process on DemoQA

  Scenario: Validate the registration process on DemoQA site
    Given Launch DemoQA site "https://demoqa.com/automation-practice-form"
    When Enter first Name as "Deepak"
    When Enter Last Name as "Rai"
    Then Data should entered
