package app.stuff.engine;

import org.springframework.beans.factory.annotation.Autowired;

public class AutomaticTransmission {

    @Autowired
    private Gas gas;
    @Autowired
    private Clutch clutc;
    @Autowired
    private Transfer transfer;


    public Gas getGas() {
        return gas;
    }

    public void setGas(Gas gas) {
        this.gas = gas;
    }

    public Clutch getClutc() {
        return clutc;
    }

    public void setClutc(Clutch clutc) {
        this.clutc = clutc;
    }

    public Transfer getTransfer() {
        return transfer;
    }

    public void setTransfer(Transfer transfer) {
        this.transfer = transfer;
    }

    public void startDriving() {
        clutc.turnClutch();
        transfer.putFirstGear();
        clutc.offClutch();
        gas.pressGas();
    }
}
