package fr.esgi.classes;

import java.util.Objects;

public enum GameScore {
    LOVE("0"),
    FIFTEEN("15"),
    THIRTY("30"),
    FORTY("40"),
    ADVANTAGE("Advantage"),

    WIN("Win");


    private final String scoreString;

    GameScore(String scoreString) {
        this.scoreString = scoreString;
    }

    public String getScoreString() {
        return scoreString;
    }

    public GameScore getNextScore(GameScore otherPlayer) {
        if (this == FORTY && otherPlayer == FORTY) {
            return ADVANTAGE;
        } else if (this == ADVANTAGE || this == FORTY) {
            return WIN;
        } else {
            return GameScore.values()[this.ordinal() + 1];
        }
    }

    public boolean isDeuceScore(GameScore opponentScore) {
        return (this == FORTY && opponentScore == FORTY);
    }
}
