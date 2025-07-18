Feature: User Registration
  I want to check that the user can register in our website.

  Scenario Outline: User Registration
    Given The user in home page
    When I click on register link
    And I entered the user data
    Then The registration page displayed successfully


    Examples: