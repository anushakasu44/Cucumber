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
#@ (Tags/Labels):To group Scenari os
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@youtubeURL
Feature: validating the youtubeURL


  @tag1
  Scenario: youtube URL validaton
    Given user opens the youtube browser 
    And  user clicks on search button
     When user navigates to results page and clicks on particular link
    Then user subscribe the channel and validates the URL 
    


