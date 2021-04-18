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
    Then Wizard. I see all information:"<First name>","<Last name>","<Street address>","<City>","<State>","<ZIP>"
    And Wizard. I wait for:"3" seconds

#    And I press Submit Button
#    Then I see notification
    Examples:
      | First name |Last name| Street address                     |City   |State   |ZIP   |
      |    Vlad    |Ka       | This is our awesome street address!|My City|My State|my Zip|
      |    Vlad 2   |Ka   46    | This is our awesome street address!1|My City2|My State2|my Zip2|
      |    Vlad  3  |Ka  45     | This is our awesome street address!2|My City3|My State3|my Zip3|
      |    Vlad 5 4  |Ka 34      | This is our awesome street address!3|My City4|My State4|my Zip4|
      |    Vlad 7   |Ka   345    | This is our awesome street address!4|My City5|My State5|my Zip5|
      |    Vlad   6 |Ka  345     | This is our awesome street address!5|My City6|My State6|my Zip6|
      |    Vlad 7   |Ka 354      | This is our awesome street address!6|My City7|My State7|my Zip7|


