Feature: Tennis Game

  Rule: When a player score a point his score should be incremented

    Scenario: Player score a point and have 0
      Given player A named "Nadal"
      And the score of player A was LOVE
      And player B named "Federer"
      And the score of player B was LOVE
      When player A score a point
      Then score of player A should be FIFTEEN
      And score of player B should be LOVE

    Scenario: Player score a point and have 15
      Given player A named "Nadal"
      And the score of player A was FIFTEEN
      And player B named "Federer"
      And the score of player B was LOVE
      When player A score a point
      Then score of player A should be THIRTY
      And score of player B should be LOVE

    Scenario: Player score a point and have 30
      Given player A named "Nadal"
      And the score of player A was THIRTY
      And player B named "Federer"
      And the score of player B was LOVE
      When player A score a point
      Then score of player A should be FORTY
      And score of player B should be LOVE

    Scenario: Player score a point and have 40
      Given player A named "Nadal"
      And the score of player A was FORTY
      And player B named "Federer"
      And the score of player B was LOVE
      When player A score a point
      Then score of player A should be WIN
      And score of player B should be LOVE


  Rule: When a player score a point with 40-40 equality, advantage should be declared

    Scenario: Player score a point and have 40 equals to player B
      Given player A named "Nadal"
      And the score of player A was FORTY
      And player B named "Federer"
      And the score of player B was FORTY
      When player A score a point
      Then score of player A should be ADVANTAGE
      And score of player B should be FORTY


  Rule: when equality of advantage is declared, reset score to 40-40

    Scenario: Player A score a point and have 40, player B have advantage
      Given player A named "Nadal"
      And the score of player A was FORTY
      And player B named "Federer"
      And the score of player B was ADVANTAGE
      When player A score a point
      Then score of player A should be FORTY
      And score of player B should be FORTY




