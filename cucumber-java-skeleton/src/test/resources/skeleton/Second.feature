Feature: Git Hub login feature
Background:
Given The URL of Git Hub
@Regression
Scenario Outline: Login Scenario
When User enters <username> as username
And User enters <password> as password
And User Clicks on SignIn
Then User navigates to <result>

Examples: 
|username|password|result	|
|uniqueuser123|Shivaji123$|Git Hub	|
|uniqueuser123|abcd|SignIn Git Hub|