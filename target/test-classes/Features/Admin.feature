Feature: AdminPage

  Scenario: Verify job dropdown
    Given User should be on adminpage
    When User clicks on job dropdown
    And User clicks on every option of organization
    Then User should navigate to jobs respective pages

  Scenario: Verify organization dropdown
    Given User should be on adminpage
    When User clicks on organization dropdown
    And User clicks on every option of organization
    Then User should navigate to the every option of the organization

  Scenario: Verify qualifications dropdown
    Given User should be on adminpage
    When User clicks on qualifications dropdown
    And User clicks on every option of qualifications
    Then User should be navigated to the every option of qualifications
