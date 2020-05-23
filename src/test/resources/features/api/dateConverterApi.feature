@api
Feature: [API] Convert date to UTC+0

  Scenario Outline: Convert date to UTC+0 positive cases
    When submit API request with <inputDate> date
    Then API response status code is 200
    And API result date is <resultDate>

    Examples:
      | inputDate                         | resultDate                        |
      | 1                                 | Mon Jan 01 2001 00:00:00 GMT+0000 |
      | Dec 31                            | Mon Dec 31 2001 00:00:00 GMT+0000 |
      | 03.31                             | Sat Mar 31 2001 00:00:00 GMT+0000 |
      | 02.29.2020                        | Sat Feb 29 2020 00:00:00 GMT+0000 |
      | 04/30/2019 00: +0                 | Tue Apr 30 2019 00:00:00 GMT+0000 |
      | 4,1,1000 00:00:00                 | Tue Apr 01 1000 00:00:00 GMT+0000 |
      | 5\15\2021 00:00:01                | Sat May 15 2021 00:00:01 GMT+0000 |
      | 06-30-2000 23:59:59               | Fri Jun 30 2000 23:59:59 GMT+0000 |
      | 07-1 23:59:59                     | Sun Jul 01 2001 23:59:59 GMT+0000 |
      | 8 1:                              | Wed Aug 01 2001 01:00:00 GMT+0000 |
      | Sun Apr 01 2001 00:00:00 GMT+0000 | Sun Apr 01 2001 00:00:00 GMT+0000 |
      | jan 1 1999                        | Fri Jan 01 1999 00:00:00 GMT+0000 |
      | February 28                       | Wed Feb 28 2001 00:00:00 GMT+0000 |
      | 2000                              | Sat Jan 01 2000 00:00:00 GMT+0000 |
      | 1 2 123                           | Sat Jan 02 0123 00:00:00 GMT+0000 |
      | 2001 Dec 31 23:59:59              | Mon Dec 31 2001 23:59:59 GMT+0000 |