Feature: Search Product
Scenario: Search headphone
Given Alex has valid login credential
When Alex enters "Head" in search field
When Alex selects the product and search
When Alex clicks on Add to cart
When Alex clicks on cart
And Alex clicks on checkout
And Alex clicks on ProceedToPay
And Alex clicks on "IDBI Bank"
And Alext clicks on Continue
And Alex enters "123458" as u
And Alex enters "Pass@458" as pas
And Alex clicks on login
And Alex enters "Trans@458" as transaction password
And Alex clicks on PayNow
Then Alex gets Payment details
 