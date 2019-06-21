Feature: Register
Scenario: Successful Registration
Given The url of testmeapp
When User enters "AlexUser" as username
And User enters "Poorna" as firstname
And User enters "Hegde" as lastname
And User enters "Alex123" as password
And User enters "Alex123" as confirm password
And user clicks "female" as gender
And User enters "poorna@email.com" as email
And User enters "9486251367" as mobile_number
And User enters "01/01/2010" as dob
And User enters "Bangalore, Karnataka" as address
And User selects "What is your favour color?" as security question
And User enters "white" as security answer
And User clicks register button
Then User is in valid page