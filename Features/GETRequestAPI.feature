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
@smoke
Feature: Validating weather API
  

  @smoke
  Scenario: validate status code and status line 
    Given user specifies base URI
    And user creates request object and gets the response by creating response object
    When user gets the responsebody
    And user gets the response of status code and status line validation 
    Then user should able to get succesfull message dislayed 
    

  