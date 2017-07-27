@macroFilter
Feature: Separating out errors and warnings
Scenario: No errors or warnings when separating out error list
Given I have 0 macros
When I filter out errors and warnings for Macros
Then I need to have 0 errors
And I need to have 0 warnings