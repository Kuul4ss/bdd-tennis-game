Feature: Score Displayer

  Rule: When scores was displayed, they should be formatted

    Scenario: Display standard score
      Given player A named "Nadal"
      And the score of player A was FIFTEEN
      And player B named "Federer"
      And the score of player B was LOVE
      When the score is displayed
      Then the panel should display "15-0"

    Scenario: Display advantage for player A
      Given player A named "Nadal"
      And the score of player A was ADVANTAGE
      And player B named "Federer"
      And the score of player B was FORTY
      When the score is displayed
      Then the panel should display "Advantage A"

    Scenario: Display advantage for player B
      Given player A named "Nadal"
      And the score of player A was FORTY
      And player B named "Federer"
      And the score of player B was ADVANTAGE
      When the score is displayed
      Then the panel should display "Advantage B"

    Scenario: Display deuce
      Given player A named "Nadal"
      And the score of player A was FORTY
      And player B named "Federer"
      And the score of player B was FORTY
      When the score is displayed
      Then the panel should display "Deuce"

    Scenario: Display win for player A
      Given player A named "Nadal"
      And the score of player A was WIN
      And player B named "Federer"
      And the score of player B was FORTY
      When the score is displayed
      Then the panel should display "Player A wins"

    Scenario: Display win for player B
      Given player A named "Nadal"
      And the score of player A was FORTY
      And player B named "Federer"
      And the score of player B was WIN
      When the score is displayed
      Then the panel should display "Player B wins"