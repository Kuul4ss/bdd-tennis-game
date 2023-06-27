Feature: Tennis Game

  Scenario: Scoring with player B winning
    Given a tennis game
    When player B scores
    Then the score should be "0-15"


  Scenario: Scoring with player A winning
    Given a tennis game
    When player B scores
    Then the score should be "0-15"


  Scenario: Scoring a tennis game with A winning
    Given a tennis game
    When player A scores
    Then the score should be "15-0"

    When player A scores
    Then the score should be "30-0"

    When player B scores
    Then the score should be "30-15"

    When player A scores
    Then the score should be "40-15"

    When player B scores
    Then the score should be "40-30"

    When player B scores
    Then the score should be "Deuce"

    When player A scores
    Then the score should be "Advantage A"

    When player B scores
    Then the score should be "Deuce"

    When player A scores
    Then the score should be "Advantage A"

    When player A scores
    Then the score should be "Player A wins"


