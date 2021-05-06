Feature:

  Background:
    Given Data Table. I navigate to Data Table Page

  Scenario Outline: Search for Name and See the results
    When Data Table. I search for "<Search>"
    Then Data Table. I see "<NumberOfRows>" rows
    And Data Table. I see "<Data>"
    Examples:
      | Search     | Data                                               | NumberOfRows |
      | Airi Satou | Airi Satou Accountant Tokyo 33 2008/11/28 $162,700 | 1            |
      | Airi Sato  | Airi Satou Accountant Tokyo 33 2008/11/28 $162,700 | 1            |
      | Airi Sat   | Airi Satou Accountant Tokyo 33 2008/11/28 $162,700 | 1            |
      | Airi       | Airi Satou Accountant Tokyo 33 2008/11/28 $162,700 | 1            |
      | Air        | Airi Satou Accountant Tokyo 33 2008/11/28 $162,700 | 1            |

  Scenario: Check Pagination
    When Data Table. I check the default pagination: "10"
    Then Data Table. I see "10" rows

