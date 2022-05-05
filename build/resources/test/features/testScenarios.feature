@UserStory
  Feature: Check the download of a free template in the market section
  As a registered user
  I want to enter the opencart page
  To Download a free template in the marketplace section

@Scenario1
  Scenario: Verify that the marketplace section has free templates to download
    Given User registered enters the opencart page
      | userName | password |
      |  demo    | demo     |
    When User selects the 'Marketplace' section to download a free template
      | filterSearch |
      | Themes       |
    Then User verifies the results obtained to download the template
      | correctScenario|
      | Available Installs |

@Scenario2
  Scenario: Verify the failed purchase of a laptop on the YourStore page
      As a registered user - I want to enter the opencart page - To buy a laptop
    Given User registered enters the opencart page in the section your store
      | userName | password |
      |  demo    | admin    |
    When User looking for a laptop to buy
      | searchBox | writeNumber |
      |   Mac     |     2       |
    Then User checks if the product was added to the shopping cart to finalize the purchase
      | incompleteTest |
      |  Products marked with *** are not available in the desired quantity or not in stock! |
      #| Shopping Cart  |

@Scenario3
  Scenario: Verify that the results of the products section are according to the selected filter
        As a registered user - I want to enter the opencart page - To see the list of available products
      Given User registered log in opencart page
        | userName | password |
        |  admin    | admin     |
      When User selects the 'Products' option to search for available products
        | productName |
        | ipod        |
      Then User verify that the search result is consistent with the selected filter
        | checkFilteredProducts |
        | Showing 1 to 4 of 4 (1 Pages) |

@Scenario4
  Scenario: Check the flights on the website of the airline latam
      As a user - I want to enter the page of latam airlin - To check available flights
    Given User enters to the Latam's Airlines page
    When User selects the option 'one way' enters the data to continue
      | enterOrigin | enterDestination |
      | Pereira     |   Medellin       |
    Then User checks the result of the available flights according to the query made
      | testFinished |
      | vuelo de ida |





