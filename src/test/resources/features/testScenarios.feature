@UserStory
  Feature: Check the result obtained from the 'Marketplace', 'Yourstore' and 'Products' modules

  Background:
    Given User registered enters the opencart page
      | userName | password |
      |  demo    | demo     |

@Scenario1
  Scenario: Verify that the marketplace section has free templates to download
    As a registered user - I want to enter the opencart page - To Download a free template in the marketplace section
    When User selects the 'Marketplace' section to download a free template
      | filterSearch |
      | Themes       |
    Then User verifies the results obtained to download the template
      | correctScenario|
      | Available Installs |

@Scenario2
  Scenario: Verify the failed purchase of a laptop on the YourStore page
      As a registered user - I want to enter the opencart page - To buy a laptop
    When User selects the 'Yourstore' module to buy a laptop
      | searchBox | writeNumber |
      |   Mac     |     2       |
    Then User checks if the product was added to the shopping cart to finalize the purchase
      | incompleteTest |
      |  Products marked with *** are not available in the desired quantity or not in stock! |

@Scenario3
  Scenario: Verify that the results of the products section are according to the selected filter
        As a registered user - I want to enter the opencart page - To see the list of available products
      When User selects the 'Products' option to search for available products
        | productName |
        | ipod        |
      Then User verify that the search result is consistent with the selected filter
        | checkFilteredProducts |
        | Showing 1 to 4 of 4 (1 Pages) |






