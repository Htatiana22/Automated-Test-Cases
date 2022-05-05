@UserStory
    Feature: Verify the result obtained from a flight query on the 'Latam Airlines' website
        As a user
        I want to enter the page of latam airlines
        To check available flights

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