Feature: Login
Scenario Outline: Successful login
Given Poorna in valid page
When Poorna enters <uname> as uname
And Poorna enters <pwd> as pwd
Then successful login
Examples:
|uname|pwd|
|AlexUser|Alex123|