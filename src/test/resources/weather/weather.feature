Feature:
  Scenario:
    When Weather. I navigate to "http://www.weather.com"
    Then Weather. I see the main page
    And Weather. I am clicking on :"Today"
    And Weather. I am clicking on :"Hourly"
    And Weather. I am clicking on :"10 Day"
    And Weather. I am clicking on :"Weekend"
    Then Weather. I search for: "Austin"
    Then Weather. I read and save the values from the City's Names and Temperature
    Then I check if data in json file is exactly was I was expecting to see:
      | Austin TX | 76
