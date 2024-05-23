package app.config;

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
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    @Bean
    public Driver driver() {
        return new Driver();
    }

    @Bean
    public BoardComputer boardComputer() {
        return new BoardComputer();
    }

    @Bean
    public TrafikControlUnit trafikControlUnit() {
        return new TrafikControlUnit();
    }

    @Bean
    public ControAreaAroundCar controAreaAroundCar() {
        return new ControAreaAroundCar();
    }

    @Bean
    public ControlСhangingLanes controlСhangingLanes() {
        return new ControlСhangingLanes();
    }

    @Bean
    public LightControlUnit lightControlUnit() {
        return new LightControlUnit();
    }

    @Bean
    public TurnSignals turnSignals() {
        return new TurnSignals();
    }

    @Bean
    public Headlights headlights() {
        return new Headlights();
    }

    @Bean
    AutomaticTransmission automaticTransmission() {
        return new AutomaticTransmission();
    }

    @Bean
    public Clutch clutch() {
        return new Clutch();
    }

    @Bean
    public Gas gas() {
        return new Gas();
    }

    @Bean
    public Transfer transfer() {
        return new Transfer();
    }


}
