Feature:

  Scenario:
    When Basic Tables. I navigate to basic Tables
    Then Basic Tables. I read the Header of the Table
      | # | First Name | Last Name | Username |
    Then Basic Tables. I check the values in the table
      | 1 | Mark  | Otto     | @mdo     |
      | 2 | Jacob | Thornton | @fat     |
      | 3 | Larry | the Bird | @twitter |
    And Basic Tables. I check the whole table
      | # | First Name | Last Name | Username |
      | 1 | Mark       | Otto      | @mdo     |
      | 2 | Jacob      | Thornton  | @fat     |
      | 3 | Larry      | the Bird  | @twitter |


    Scenario: With Data from the Files
      When Basic Tables. I navigate to basic Tables
      And Basic Tables. I check the whole table. Asserting from the File
