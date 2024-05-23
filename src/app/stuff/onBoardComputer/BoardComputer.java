package app.stuff.onBoardComputer;

import app.stuff.engine.AutomaticTransmission;
import app.stuff.lighting.LightControlUnit;
import app.stuff.trafficСontrol.TrafikControlUnit;
import org.springframework.beans.factory.annotation.Autowired;

public class BoardComputer {

    @Autowired
    private AutomaticTransmission automaticTransmission;
    @Autowired
    private LightControlUnit lightControlUnit;
    @Autowired
    private TrafikControlUnit trafikControlUnit;

    public AutomaticTransmission getAutomaticTransmission() {
        return automaticTransmission;
    }

    public void setAutomaticTransmission(AutomaticTransmission automaticTransmission) {
        this.automaticTransmission = automaticTransmission;
    }

    public LightControlUnit getLightControlUnit() {
        return lightControlUnit;
    }

    public void setLightControlUnit(LightControlUnit lightControlUnit) {
        this.lightControlUnit = lightControlUnit;
    }

    public TrafikControlUnit getTrafikControlUnit() {
        return trafikControlUnit;
    }

    public void setTrafikControlUnit(TrafikControlUnit trafikControlUnit) {
        this.trafikControlUnit = trafikControlUnit;
    }

    public void firstStart() {
        trafikControlUnit.leavingParkingLot();
        lightControlUnit.turnLightsAtStart();
        automaticTransmission.startDriving();
    }

}
