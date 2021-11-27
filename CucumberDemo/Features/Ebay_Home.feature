Feature: Ebay Page scenarios

  @P1 @P3
  Scenario: Checking Advanced search
    Given I am on Ebay Home Page
    When I Click on Advanced Link
    Then I navigate to advanced search

  @P4
  Scenario: search item count
    Given I am on Ebay Home Page
    When I search for 'iphone 11'
    Then I validate  84 search results

  @P9
  Scenario Outline: Navigate to tabs
    Given I am on Ebay Home Page
    When I click on '<tabs>'
    Then I validate the '<URL>' and '<PageName>'

    Examples: 
      | tabs        | URL                                                  | PageName                    |
      | Fashion     | https://www.ebay.com/b/Fashion/bn_7000259856         | Fashion That’s Made for You |
      | Sports      | https://www.ebay.com/b/Sporting-Goods/888/bn_1865031 | Sporting Goods              |
