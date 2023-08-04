Feature: login

Scenario: tenants login

Given user not logedin
When tanent user name is "tanentusername"
And  tanent password is  "11111"
Then tanent is login succeeds

Scenario: Owners login

Given user not logedin
When owner user name is "ownerusername"
And owner password is "22222"
Then owner login succeeds

Scenario: Administrator login

Given user not logedin
When admin user name is "Adminname"
And admin password is "33333"
Then Administrator login succeeds

Scenario: Wrong data

Given user not logedin
When wrong user name is "wrongname"
And wrong password is "wrongpassword"
Then show Wrong data massage  


