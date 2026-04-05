Feature: Calculate billing amount

Scenario Outline: Billing amount

Given User is on billing page
When User enters billingamount "<billingamount>"
When User enters taxamount "<taxamount>"
And User clicks on calculate button
Then It gives final amount "<finalamount>"

Examples:
|billingamount           |  taxamount          |finalamount|
|1000                    |  10                  |1010|
|500                    |  20                  |520|
|100                    |  5.5                  |105.5|