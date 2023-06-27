package fr.esgi.classes;
public class Game {
    private  GameScore playerAScore;
    private  GameScore playerBScore;



    public Game(){
        playerAScore = GameScore.LOVE;
        playerBScore = GameScore.LOVE;
    }

    public String playerAScores() {
            if(playerBScore == GameScore.ADVANTAGE) {
                playerBScore = GameScore.FORTY;
            } else {
                playerAScore = playerAScore.getNextScore(playerBScore);
            }
        return getScore();
    }

    public String playerBScores() {
            if(playerAScore == GameScore.ADVANTAGE) {
                playerAScore = GameScore.FORTY;
            } else {
                playerBScore = playerBScore.getNextScore(playerAScore);
            }
        return getScore();
    }

    public String getScore() {
        if (playerAScore.isDeuceScore(playerBScore)) {
            return "Deuce";
        } else if (playerAScore == GameScore.ADVANTAGE) {
            return "Advantage A";
        } else if(playerBScore == GameScore.ADVANTAGE){
            return "Advantage B";
        } else if (playerAScore == GameScore.WIN) {
            return "Player A wins";
        } else if (playerBScore == GameScore.WIN) {
            return "Player B wins";
        } else {
            return playerAScore.getScoreString()+ "-" +  playerBScore.getScoreString();
        }
    }
}
