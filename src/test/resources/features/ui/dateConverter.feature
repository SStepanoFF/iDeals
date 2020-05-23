@ui
Feature: [UI] Convert date to UTC+0

  Scenario Outline: Convert date to UTC+0
    Given open Date Converter page
    And enter <inputDate> to the input field
    When click Submit button
    Then result date is <resultDate>

    Examples:
      | inputDate | resultDate                        |
      | 1         | Mon Jan 01 2001 00:00:00 GMT+0000 |
