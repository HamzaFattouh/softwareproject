Feature: login

Scenario: tenants login

Given: login page
When: Enter tenants username and password
Then: open tanents page

Scenario: Owners login

Given: login page
When: Enter owner username and password
Then: open owners page

Scenario: Administrator login

Given: login page
When: Enter Administrator username and password
Then: open Administrator page

Scenario: Wrong data

Given: login page
When: Enter unvalid username and password
Then: show Wrong data massage 