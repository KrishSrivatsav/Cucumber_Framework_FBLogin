Feature: Login into Application


Scenario Outline: Positive Test validating login
Given Initialize the browser with chrome
And Navigate to "https://www.facebook.com/" site
When User enters username <username> and password <password> and logs in
Then Home page is populated
And Verify that user is sucessfully logged in

Examples:
|username                     |password    |
|krackerkrish@gmail.com       |vaalukrish  |