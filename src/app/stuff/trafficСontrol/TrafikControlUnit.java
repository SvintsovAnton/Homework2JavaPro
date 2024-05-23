package app.stuff.trafficСontrol;

import org.springframework.beans.factory.annotation.Autowired;

public class TrafikControlUnit {

    @Autowired
    private ControAreaAroundCar controAreaAroundCar;
    @Autowired
    private ControlСhangingLanes controlСhangingLanes;

    public ControAreaAroundCar getControAreaAroundCar() {
        return controAreaAroundCar;
    }

    public void setControAreaAroundCar(ControAreaAroundCar controAreaAroundCar) {
        this.controAreaAroundCar = controAreaAroundCar;
    }

    public ControlСhangingLanes getControlСhangingLanes() {
        return controlСhangingLanes;
    }

    public void setControlСhangingLanes(ControlСhangingLanes controlСhangingLanes) {
        this.controlСhangingLanes = controlСhangingLanes;
    }

    public void leavingParkingLot() {
        controAreaAroundCar.zoneControl();
        controlСhangingLanes.changingLanes();

    }
}
