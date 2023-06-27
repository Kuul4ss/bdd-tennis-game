package fr.esgi.classes;
public class Game {

    private ScoreDisplayer scoreDisplayer;

    public Player playerA;
    public Player playerB;

    public String score;

    public Game(){
        scoreDisplayer = new ScoreDisplayer();
    }

    public void scorePointPlayerA() {
        if(playerB.score() == Score.ADVANTAGE) {
            playerB = new Player(playerB.name(), Score.FORTY);
        }
        else {
            playerA = playerA.scorePoint(playerB.score());
        }
    };

    public void scorePointPlayerB() {
        if(playerA.score() == Score.ADVANTAGE) {
            playerA = new Player(playerA.name(), Score.FORTY);
        }
        else {
            playerB = playerB.scorePoint(playerA.score());
        }
    };

    public void updateScoreDisplayed() {
        this.score = scoreDisplayer.displayScore(playerA, playerB);
    }
}
