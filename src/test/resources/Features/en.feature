Feature: search on site
  Scenario: use the search
    Given user open site
    When user write 'serenity'
    And push the button
    Then search displayed