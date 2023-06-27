package fr.esgi.classes;

public enum Score {
    LOVE("0"),
    FIFTEEN("15"),
    THIRTY("30"),
    FORTY("40"),
    ADVANTAGE("Advantage"),

    WIN("Win");


    private final String scoreString;

    Score(String scoreString) {
        this.scoreString = scoreString;
    }

    public String getScoreString() {
        return scoreString;
    }

    public Score getNextScore(Score otherPlayer) {
        if (this == FORTY && otherPlayer == FORTY) {
            return ADVANTAGE;
        } else if (this == ADVANTAGE || this == FORTY) {
            return WIN;
        } else {
            return Score.values()[this.ordinal() + 1];
        }
    }

    public boolean isDeuceScore(Score opponentScore) {
        return (this == FORTY && opponentScore == FORTY);
    }
}
