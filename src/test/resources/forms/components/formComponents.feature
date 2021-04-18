Feature:
  Background:
    Given Form Components. I navigate to the Components page
  Scenario:
    Then Form Components. I fill in email with data: "email@fg.rt"
    And Form Components. I wait for:"3" seconds
    #Then Form Components. I fill password with data: "<>"
