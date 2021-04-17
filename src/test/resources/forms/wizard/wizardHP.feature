Feature:
  # implement steps and stepDefinitions for:
  # Last name, press Next button, Street Address, City, State, ZIP, Submit button.
  Background:
    Given I navigate to the page
  Scenario Outline: one
    When I am on the first step
    And I fill out First name: "<First name>"
    Then I fill out Last name: "<Last name>"
    And I press Next button
#    And I wait for:"3" seconds
    Then I am on the second step
    And I fill out Street Address: "<Street address>"
    Then I fill out City: "<City>"
    Then I fill out State: "<State>"
    Then I fill out ZIP: "<ZIP>"
    And I press Next button
    And I wait for:"3" seconds
#    Then I see all information
#    And I press Submit Button
#    Then I see notification
    Examples:
      | First name |Last name| Street address                      |City   |State   |ZIP   |
      |    Vlad    |Ka       | This is our awesome street address! |My City|My State|my Zip|
#      |    Vlad1   |Ka1      |
#      |    Vlad2   |Ka2      |
#      |    Vlad3   |Ka3      |
#      |    Vlad4   |Ka4      |
#      |    Vlad5   |Ka4      |

