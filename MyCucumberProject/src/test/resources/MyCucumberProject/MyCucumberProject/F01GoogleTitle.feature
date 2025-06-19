Feature: Google Title

  Scenario: To validate Google title
    Given Launch Google
    When Read the title
    And Display the title
    Then Title should be Google
