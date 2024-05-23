package app.stuff.lighting;

import org.springframework.beans.factory.annotation.Autowired;

public class LightControlUnit {

    @Autowired
    private Headlights headlights;
    @Autowired
    private TurnSignals turnSignals;

    public Headlights getHeadlights() {
        return headlights;
    }

    public void setHeadlights(Headlights headlights) {
        this.headlights = headlights;
    }

    public TurnSignals getTurnSignals() {
        return turnSignals;
    }

    public void setTurnSignals(TurnSignals turnSignals) {
        this.turnSignals = turnSignals;
    }

    public void turnLightsAtStart() {

        headlights.turnLight();
        turnSignals.turnLeft();
    }
}
