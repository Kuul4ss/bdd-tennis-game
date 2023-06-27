package fr.esgi.classes.features;

import fr.esgi.classes.Player;
import fr.esgi.classes.Score;
import fr.esgi.classes.context.TestContext;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

public class GameSteps {

    private final TestContext ctx;

    public GameSteps(TestContext context) {
        this.ctx = context;
    }

    @ParameterType("LOVE|FIFTEEN|THIRTY|FORTY|ADVANTAGE|WIN")
    public Score score(String scoreName) {
        return Score.valueOf(scoreName);
    }

    @Given("player A named {string}")
    public void playerANamed(String playerName) {
        ctx.game().playerA = new Player(playerName, Score.LOVE);
    }

    @And("the score of player A was {score}")
    public void theScoreOfPlayerAWas(Score score) {
        ctx.game().playerA = new Player(ctx.game().playerA.name(), score);
    }

    @And("player B named {string}")
    public void playerBNamed(String playerName) {
        ctx.game().playerB = new Player(playerName, Score.LOVE);
    }

    @And("the score of player B was {score}")
    public void theScoreOfPlayerBWas(Score score) {
        ctx.game().playerB = new Player(ctx.game().playerB.name(), score);
    }

    @When("player A score a point")
    public void playerAScoreAPoint() {
        ctx.game().scorePointPlayerA();
    }

    @Then("score of player A should be {score}")
    public void scoreOfPlayerAShouldBe(Score score) {
        Assertions.assertThat(ctx.game().playerA.score()).isEqualTo(score);
    }

    @And("score of player B should be {score}")
    public void scoreOfPlayerBShouldBe(Score score) {
        Assertions.assertThat(ctx.game().playerB.score()).isEqualTo(score);
    }


}


