package fr.esgi.classes;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GameSteps {

    private Game game;
    private String currentScore;

    @Given("a tennis game")
    public void createNewGame() {
        game = new Game();
    }

    @When("player A scores")
    public void playerAScores() {
        currentScore = game.playerAScores();
    }

    @When("player B scores")
    public void playerBScores() {
        currentScore = game.playerBScores();
    }

    @Then("the score should be {string}")
    public void checkScore(String expectedScore) {
        Assert.assertEquals(expectedScore, currentScore);
    }
}
