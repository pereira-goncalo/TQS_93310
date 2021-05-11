Feature: Basic Arithmetic

  Background: A Calculator
    Given a calculator I just turned on

  Scenario: Addition
    When I add 2 and 3
    Then the result is 5

  Scenario: Subtraction
    When I subtract 2 to 7
    Then the result is 5

  Scenario Outline: Several additions
    When I add <a> and <b>
    Then the result is <c>

  Examples: Single digits
    | a | b | c |
    | 1 | 3 | 4 |
    | 5 | 5 | 10 |