Feature: Check visa requirement

  Background: Open uk visa url
    Given I am on the UK Visa web page

  Scenario Outline:  User provides nationality, purpose of visa
    Given I provide a nationality of '<countryName>'
    And I select the reason for visa as '<purpose>'
    When I submit the form
    Then I will be informed '<message>'
    Examples:
      | countryName | purpose  | message                                    |
      | Japan       | Tourism  | You won’t need a visa to come to the UK    |

  Scenario Outline:  User provides nationality, purpose of visa
    Given I provide a nationality of '<countryName>'
    And I select the reason for visa as '<purpose>'
    And I state I am travelling or visiting a partner or family as '<visitFamily>'
    When I submit the form
    Then I will be informed '<message>'
    Examples:
      | countryName | purpose  | visitFamily | message                                 |
      | Russia      | Tourism  | No          | You’ll need a visa to come to the UK    |

  Scenario Outline:  User provides nationality, purpose of visa
    Given I provide a nationality of '<countryName>'
    And I select the reason for visa as '<purpose>'
    And I state I am intending to stay for more than 6 months : true
    When I submit the form
    Then I will be informed '<message>'
    Examples:
      | countryName | purpose  | message                                |
      | Japan       | Study    | You’ll need a visa to study in the UK  |