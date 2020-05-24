@api
Feature: [API] Convert date to UTC+0

  @issues:ISSUE-6,ISSUE-8,ISSUE-9,ISSUE-14,ISSUE-15
  Scenario Outline: Convert date to UTC+0 positive cases
    When submit API request with <inputDate> date
    Then API response status code is 200
    And API result date is <resultDate>

    Examples:
      | inputDate                        | resultDate                        |
      | 2                                | Thu Feb 01 2001 00:00:00 GMT+0000 |
      | Dec 31                           | Mon Dec 31 2001 00:00:00 GMT+0000 |
      | 03.31                            | Sat Mar 31 2001 00:00:00 GMT+0000 |
      | 02.29.2020                       | Sat Feb 29 2020 00:00:00 GMT+0000 |
      | 04/30/2019 00: +0                | Tue Apr 30 2019 00:00:00 GMT+0000 |
      | 4,1,1000 00:00:00                | Tue Apr 01 1000 00:00:00 GMT+0000 |
      | 5\15\2021 00:00:01               | Sat May 15 2021 00:00:01 GMT+0000 |
      | 06-30-2000 23:59:59              | Fri Jun 30 2000 23:59:59 GMT+0000 |
      | 07-1 23:59:59                    | Sun Jul 01 2001 23:59:59 GMT+0000 |
      | 8 1:                             | Wed Aug 01 2001 01:00:00 GMT+0000 |
      | jan 1 1999                       | Fri Jan 01 1999 00:00:00 GMT+0000 |
      | February 28                      | Wed Feb 28 2001 00:00:00 GMT+0000 |
      | 2000                             | Sat Jan 01 2000 00:00:00 GMT+0000 |
      | 1 2 123                          | Sat Jan 02 0123 00:00:00 GMT+0000 |
      | 2001 Dec 31 23:59:59             | Mon Dec 31 2001 23:59:59 GMT+0000 |
      | jan 1 2:3:4                      | Mon Jan 01 2001 02:03:04 GMT+0000 |
      | 2020 1 march 15:00:59 utc+8      | Sun Mar 01 2020 07:00:59 GMT+0000 |
      | 31dec2020 23:00:00 UTC-001       | Fri Jan 01 2021 00:00:00 GMT+0000 |
      | 1, 2002, Jan 00:01:02 UTC +1     | Mon Dec 31 2001 23:01:02 GMT+0000 |
      | 1/2002/Jan 00:01:02 UTC +11      | Mon Dec 31 2001 13:01:02 GMT+0000 |
      | 2001-Jan-1 00:01:02 UTC +11      | Sun Dec 31 2000 13:01:02 GMT+0000 |
      | 2020mar1 1:02:03 GMT+24          | Sat Feb 29 2020 01:02:03 GMT+0000 |
      | 2020/February/28 23:02:03 GMT-24 | Sat Feb 29 2020 23:02:03 GMT+0000 |
      | 2020 28Feb 23:0:00 gmt-1         | Sat Feb 29 2020 00:00:00 GMT+0000 |
      | 2019march1 0:02:03 GMT+1         | Thu Feb 28 2019 23:02:03 GMT+0000 |
      | 2019-28-Feb 23:0:00 gmt-1        | Fri Mar 01 2019 00:00:00 GMT+0000 |
      | 07-1-2020 0:02:03 GMT+1          | Tue Jun 30 2020 23:02:03 GMT+0000 |
      | Jun 30 2020 23:02:03 GMT-1       | Wed Jul 01 2020 00:02:03 GMT+0000 |
      | 1 oct 0012                       | Mon Oct 01 0012 00:00:00 GMT+0000 |
      | 12.31.1004 24:00:00              | Tue Jan 01 1005 00:00:00 GMT+0000 |
      | Feb                              | Thu Feb 01 2001 00:00:00 GMT+0000 |


  @issues:ISSUE-2,ISSUE-4,ISSUE-5,ISSUE-10,ISSUE-11,ISSUE-12,ISSUE-13
  Scenario Outline: Convert date to UTC+0 negative cases
    When submit API request with <inputDate> date
    Then API response status code is 200
    And API result date is Invalid date

    Examples:
      | inputDate                         |
      | 02.29.2019                        |
      | Text                              |
      |                                   |
      | Feb 29                            |
      | 05.00                             |
      | 1.1.2001 +1                       |
      | 13.1.2000                         |
      | dec 2001-Jan-1                    |
      | 5 2001-Jan-1                      |
      | 2001 1Feb2013                     |
      | 2020 28Feb1                       |
      | 0.3                               |
      | 0 feb                             |
      | 0                                 |
      | 1 dec 0000                        |
      | Text 2                            |
      | 2 ma                              |
      | !~@#$%^&*()_+}{"?>:<              |
      | Mar 02 2020 24:00:01              |
      | Mar 02 2020 23:60:00              |
      | Mar 02 2020 23:59:60              |
      | Thu Apr 01 2001 00:00:00 GMT+0000 |