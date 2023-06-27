package fr.esgi.classes.features;

import fr.esgi.classes.context.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

public class ScoreDisplayerSteps {

    private final TestContext ctx;

    public ScoreDisplayerSteps(TestContext context) {
        this.ctx = context;
    }

    @When("the score is displayed")
    public void theScoreIsDisplayed() {
        ctx.game().updateScoreDisplayed();
    }

    @Then("the panel should display {string}")
    public void thePanelShouldDisplay(String scoreDisplayed) {
        Assertions.assertThat(ctx.game().score).isEqualTo(scoreDisplayed);
    }
}
