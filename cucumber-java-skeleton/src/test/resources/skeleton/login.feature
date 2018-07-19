Feature: Login feature
Background:
Given The URL of GitHUb

Scenario: Valid GitHub user
When User enters uniqueuser as username 
And User enters ammu as  password
Then User clicks on Submit for GitHub page

Scenario: Invalid GitHub user
When User enters abcd as username 
And User enters Shivaji123$ as  password
Then User clicks on Submit for Sign In GitHub page
