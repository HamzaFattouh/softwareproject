Feature: login

Scenario: tenants login

Given: Enter tenants username and password
Then: open tanents page

Scenario: Owners login

Given: Enter owner username and password
Then: open owners page

Scenario: Administrator login

Given: Enter Administrator username and password
Then: open Administrator page

Scenario: Wrong data

Given: Enter unvalid username and password
Then: show Wrong data massage 