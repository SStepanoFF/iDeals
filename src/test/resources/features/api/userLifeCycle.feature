@api
Feature: [API] User life cycle


  Scenario Outline: Create user
    When create user with <name> name and <job> job
    Then API response status code is 201
    And API create user response contains <name> name and <job> job

    Examples:
      | name   | job |
      | Sergii | QA  |


  Scenario: GET user
    When get user with id=2
    Then API response status code is 200
    And API get user response has parameters:
      | id        | 2                                                                                                                           |
      | email     | janet.weaver@reqres.in                                                                                                      |
      | firstName | Janet                                                                                                                       |
      | lastName  | Weaver                                                                                                                      |
      | avatar    | https://s3.amazonaws.com/uifaces/faces/twitter/josephstein/128.jpg                                                          |
      | company   | StatusCode Weekly                                                                                                           |
      | url       | http://statuscode.org/                                                                                                      |
      | text      | A weekly newsletter focusing on software development, infrastructure, the server, performance, and the stack end of things. |


  Scenario Outline: PATCH Update user
    When PATCH update user with id=2 by data:
      | name    | <newName> |
      | company | <company> |
    Then API response status code is 200
    And API response contains entries:
      | name    | <newName> |
      | company | <company> |
    And API user Update Date is correct

    Examples:
      | newName | company |
      | NewName | iDeals  |


  Scenario Outline: PUT Update user
    When PUT update user with id=12 by data:
      | name    | <newName> |
      | company | <company> |
    Then API response status code is 200
    And API response contains entries:
      | name    | <newName> |
      | company | <company> |
    And API user Update Date is correct

    Examples:
      | newName | company |
      | NewName | iDeals  |


  Scenario: Delete user
    When delete user with id=2
    Then API response status code is 204
