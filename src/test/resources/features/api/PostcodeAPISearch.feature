Feature: Postcode status check
  Scenario Outline: User checks postcode api response status
    Given User set postcode service api endpoint
    When User send a Get HTTP request to search postcode : '<postcode>'
    Then User should receive response status 200

    Examples:
    | postcode |
    | SW1P4JA  |