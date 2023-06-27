package fr.esgi.classes;

public class ScoreDisplayer {

    ScoreDisplayer() {
    }

    public String displayScore(Player playerA, Player playerB) {
        if (playerA.score().isDeuceScore(playerB.score())) {
            return "Deuce";
        } else if (playerA.score() == Score.ADVANTAGE) {
            return "Advantage A";
        } else if(playerB.score() == Score.ADVANTAGE){
            return "Advantage B";
        } else if (playerA.score() == Score.WIN) {
            return "Player A wins";
        } else if (playerB.score() == Score.WIN) {
            return "Player B wins";
        } else {
            return new StringBuilder().append(playerA.score().getScoreString())
                    .append("-")
                    .append(playerB.score().getScoreString())
                    .toString();
        }
    }

}
