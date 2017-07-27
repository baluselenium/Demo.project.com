@AmazonSuite
Feature:Amazon operation

@T-AmazonLogin
Scenario: Login to Amazon user account
Given I navigate to Amazon login page
Then I enter valid login credential for amazon
Then I should navigate to logged in page