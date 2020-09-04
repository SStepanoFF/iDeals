@api
Feature: [API] User life cycle

  Scenario Outline: Create user
    When create user with <name> name and <job> job
    Then API response status code is 201
    And API create user response contains <name> name and <job> job

    Examples:
      | name   | job |
      | Sergii | QA  |
