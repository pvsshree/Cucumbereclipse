Feature:  Uberbooking feature

@smoke
Scenario:         Booking cab
Given User wants to select car "sedan" from app
When  User selects car "sedan" pick up point "Bangalore" and drop location "Pune"
 Then Driver starts the journey
 And Driver ends the journey
 Then User pays 1000 USD
 
 

 @Regression
 Scenario:         Booking cab
Given User wants to select car "SUV" from app
When  User selects car "SUV" pick up point "Bangalore" and drop location "Hyderabad"
 Then Driver starts the journey
 And Driver ends the journey
 Then User pays 1000 USD
 
 
 @Sanity
 Scenario:         Booking cab
Given User wants to select car "Exter" from app
When  User selects car "Exter" pick up point "Bangalore" and drop location "Hyderabad"
 Then Driver starts the journey
 And Driver ends the journey
 Then User pays 1000 USD