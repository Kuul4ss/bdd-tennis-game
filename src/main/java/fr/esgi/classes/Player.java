package fr.esgi.classes;

public record Player(String name, Score score) {

    public Player scorePoint(Score opponentScore) {
        return new Player(name, score.getNextScore(opponentScore));
    }
}
