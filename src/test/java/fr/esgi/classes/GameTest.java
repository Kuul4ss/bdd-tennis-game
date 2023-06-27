package fr.esgi.classes;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@SelectClasspathResource("features")
@CucumberOptions(glue = "fr.esgi.classes",features = "src/test/resources/features/game.feature")
public class GameTest {
}