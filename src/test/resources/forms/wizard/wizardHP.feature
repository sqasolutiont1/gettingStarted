Feature:
  # implement steps and stepDefinitions for:
  # Last name, press Next button, Street Address, City, State, ZIP, Submit button.
  Background:
    Given Wizard. I navigate to the page
  Scenario Outline: one
    When Wizard. I am on the first step
    And Wizard. I fill out First name: "<First name>"
    Then Wizard. I fill out Last name: "<Last name>"
    And Wizard. I press Next button
    Then Wizard. I am on the second step
    And Wizard. I fill out Street Address: "<Street address>"
    Then Wizard. I fill out City: "<City>"
    Then Wizard. I fill out State: "<State>"
    Then Wizard. I fill out ZIP: "<ZIP>"
    And Wizard. I press Next button
    Then Wizard. I am on the final step
    Then Wizard. I see all information
    And Wizard. I wait for:"3" seconds

#    And I press Submit Button
#    Then I see notification
    Examples:
      | First name |Last name| Street address                      |City   |State   |ZIP   |
      |    Vlad    |Ka       | This is our awesome street address!|My City|My State|my Zip|
#      |    Vlad1   |Ka1      |
#      |    Vlad2   |Ka2      |
#      |    Vlad3   |Ka3      |
#      |    Vlad4   |Ka4      |
#      |    Vlad5   |Ka4      |

