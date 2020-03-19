#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@sanity

Feature: login button validation
 
@sanity
  Scenario Outline: login with correct username and password
    Given I navigate to home page
    And I click on register link
    When I enter <Firstname> and <LastName>
    And I click on signin button
    Then I can able to login sucessfully

    Examples: 
      | Firstname     |     LastName    | 
      | anushakasu44 |     anushakasu  | 
      | anushareddy55  |     anushareddy | 
