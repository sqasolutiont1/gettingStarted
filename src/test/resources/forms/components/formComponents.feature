Feature:
  Background:
    Given Form Components. I navigate to the Components page
  Scenario:
    Then Form Components. I fill in email with data: "email@fg.rt"
    And Form Components. I fill in password with data: "123413242354"
    And Form Components. I attach file: "contacts.txt"
    And Form Components. I press Submit button.
    And Form Components. I wait for:"3" seconds


    Scenario: Selectors
      When Form Components. I select the selector
      And Form Components. I wait for:"3" seconds

      #Read values from attributes
      Scenario: Check boxes
        When Form Components. I check the Check Box
        And Form Components. Check Box should be checked
        When Form Components. I check the Check Box
        And Form Components. Check Box should be unchecked
