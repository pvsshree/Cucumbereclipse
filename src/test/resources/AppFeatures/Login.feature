Feature: Login Feature
Scenario Outline: Login Fail - Possible combination
Given User is on Application landing page
When User clicks on login button
Then user is displayed login screen
When User enters "<Username>" in username field
And User enters "<Password>" in password field
And User clicks on login button
Then User gets login failed error message

Examples:
|Username           |  Password          |
|incorrectusername  |  123456            |
|abc@gmail.com      |  incorrectusername |
|incorrectusername  |  incorrectusername |