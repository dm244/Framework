Feature: amazon search

Scenario: Search a product

Given I have a seach page on amazon page
When I search a product with the name "apple i phone "
Then Product with name "apple i phone" should display



