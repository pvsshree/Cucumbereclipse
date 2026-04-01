Feature:
In order to check my order details
As a registered user I want to specify the features of order details page


Background:
Given A user should be registered user
Given User should be on Amazon login page
When User enters username
And User enters password
And User clicks on login button
Then USer navigates to order page

@User1
Scenario: Check previous order details
When user clicks on order link
Then user navigates to order page


@User2
Scenario: Check open order details
When user clicks on open order link
Then user navigates open to order page

@User3
Scenario: Check cancelled order details
When user clicks on cancelled order link
Then user navigates to cancelled order page


