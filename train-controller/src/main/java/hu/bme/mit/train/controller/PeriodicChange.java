package hu.bme.mit.train.controller;

import java.util.TimerTask;

/**
 * Created by breacons on 13/03/17.
 */
public class PeriodicChange extends TimerTask {
    TrainControllerImpl controller;
    PeriodicChange(TrainControllerImpl controller){
        this.controller = controller;
    }

    public void run() {
        controller.followSpeed();
    }
}