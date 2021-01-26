Feature: Search by keyword

  Scenario: register an user
    Given Actor doesn't have an account
    When he complete the form
    Then should be registered