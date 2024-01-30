Feature: Search and place the order for product

Scenario: Search Experience for product search in both home and offers page

Given User is on GreenKart Landing Page
When User searched with shortname "tom" and extract the actual word
Then User searched for "tom" in offer page and extract the word
And validate the both name same or not
