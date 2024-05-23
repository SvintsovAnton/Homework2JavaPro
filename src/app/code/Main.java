package app.code;

import app.stuff.driver.Driver;
import app.stuff.engine.AutomaticTransmission;
import app.stuff.engine.Clutch;
import app.stuff.engine.Gas;
import app.stuff.engine.Transfer;
import app.stuff.lighting.Headlights;
import app.stuff.lighting.LightControlUnit;
import app.stuff.lighting.TurnSignals;
import app.stuff.onBoardComputer.BoardComputer;
import app.stuff.trafficСontrol.ControAreaAroundCar;
import app.stuff.trafficСontrol.ControlСhangingLanes;
import app.stuff.trafficСontrol.TrafikControlUnit;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {


    public static void main(String[] args) {
        // Автомобиль на автопилоте
        // Решение без Spring

//        ControlСhangingLanes controlСhangingLanes = new ControlСhangingLanes();
//        ControAreaAroundCar controAreaAroundCar = new ControAreaAroundCar();
//        TrafikControlUnit trafikControlUnit = new TrafikControlUnit();
//        trafikControlUnit.setControlСhangingLanes(controlСhangingLanes);
//        trafikControlUnit.setControAreaAroundCar(controAreaAroundCar);
//
//        Headlights headlights = new Headlights();
//        TurnSignals turnSignals = new TurnSignals();
//        LightControlUnit lightControlUnit = new LightControlUnit();
//        lightControlUnit.setHeadlights(headlights);
//        lightControlUnit.setTurnSignals(turnSignals);
//
//
//        Gas gas = new Gas();
//        Transfer transfer = new Transfer();
//        Clutch clutch = new Clutch();
//        AutomaticTransmission automaticTransmission = new AutomaticTransmission();
//        automaticTransmission.setClutc(clutch);
//        automaticTransmission.setGas(gas);
//        automaticTransmission.setTransfer(transfer);
//
//        BoardComputer boardComputer = new BoardComputer();
//        boardComputer.setTrafikControlUnit(trafikControlUnit);
//        boardComputer.setLightControlUnit(lightControlUnit);
//        boardComputer.setAutomaticTransmission(automaticTransmission);
//
//        Driver driver = new Driver();
//        driver.setBoardComputer(boardComputer);
//
//        driver.modeLetsGo();


        //Решение со Spring

        AbstractApplicationContext context = new AnnotationConfigApplicationContext("app.config");
        Driver driver = context.getBean(Driver.class);
        driver.modeLetsGo();

    }
}
