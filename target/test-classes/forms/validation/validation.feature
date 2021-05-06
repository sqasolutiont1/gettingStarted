Feature:

  Background:
    Given Validation. I navigate to the Validation page

  Scenario:
    When Validation. I fill out Name:"wefrwerre"
    Then Validation. I fill out UserName:"werwer"
    Then Validation. I fill out Email:"werwe@ertert.rt"
    And Validation. I press on Submit
    And Validation. I print Alert
    And Validation. I wait for:"3" seconds

