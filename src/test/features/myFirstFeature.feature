@helppage2
Feature: Registration1

    Background:
        Given I enter url "https://www.easyjet.com/en/"
        And I accepted the cookies
        When I clicked on help menu

    @login
    Scenario: Scenario1
#        Given I enter url "https://www.easyjet.com/en/"
#        And I accepted the cookies
#        When I clicked on help menu
        And I clicked on help topic "Help Homepage"
        Then I should see "What would you like to know?" header text

@smoke
    Scenario Outline: Scenario2
#        Given I enter url "https://www.easyjet.com/en/"
#        And I accepted the cookies
#        When I clicked on help menu
        And I clicked on help topic "<helpTopic>"
        Then I should see "<headerText>" header text


        Examples:
            | helpTopic     | headerText                   |
            | Help Homepage | What would you like to know? |
            | Bag allowance | Cabin bags and hold luggage  |
