
@Credit
Feature:Credit operation

@T-Credit

Scenario: Payment scenarios

Given An account with sufficient balance who does not have credit card
When  I navigate to Credit card
Then  You can make credit payment

Given An account with insufficient balance who does not have credit card
When  I navigate to Debit card
Then  You can make debit payment

Given An account with no balance who does not have credit card
When  I navigate to Chip card

Then  You can make chip payment