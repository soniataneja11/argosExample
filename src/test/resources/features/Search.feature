Feature: Search on Argos HomePage
  As a User
  I want to go to Argos Website
  So that i can search products

  Scenario: Search for Nike Products in search box
    Given Users is on Argos Web Page
    When  User enter the "Nike" in Search Box
    And   User click on Search button
    Then  User must see nike products in search results and Verify it









