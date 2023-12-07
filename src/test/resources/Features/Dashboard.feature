Feature: Dashboard

  Scenario: Verify all links
    Given User should be on dashboard page
    When User clicks on each link
    Then User should navigate to respective page

  Scenario: Verify profile drop down functionality
    Given User should be on dashboard page
    When User clicks on profile dropdown
    Then Verify user is navigated to respective option of profile dropdown

  Scenario: Verify quick launch links
    Given User should be on dashboard page
    When User clicks on each link of quick launch
    Then Verify user is navigated to each link of quick launch

  Scenario: Verify my actions links
    Given User should be on dashboard page
    When User clicks on each link of my actions
    Then Verify user is navigated to each link of my actions
