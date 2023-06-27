package fr.esgi.classes.context;

import fr.esgi.classes.Game;

public record TestContext(Game game) {

    public TestContext() {
        this(new Game());
    }
}
