Feature: User registration
Scenario: User register with different data
Given User is on registration page
When User enters following details
|Om|abc	|abc@gmail.com	|8888|Pune|
|Radhe|xyz	|xyz@gmail.com	|5555|Mumbai|
|krishna|pqr	|pqr@gmail.com	|4444|Raver|
Then User registration should be successful


Scenario: User register with different data with coloumns
Given User is on registration page
When User enters following details with coloumns
|Firstname|Lastname|Email|Phone|City|
|Om|abc	|abc@gmail.com	|8888|Pune|
|Radhe|xyz	|xyz@gmail.com	|5555|Mumbai|
|krishna|pqr	|pqr@gmail.com	|4444|Raver|
Then User registration should be successful