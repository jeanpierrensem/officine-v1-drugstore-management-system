package com.losto.utilities.shared;

import javafx.application.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.transform.*;

import java.text.*;
import java.util.*;

public class ClockApp extends BorderPane {
private final Text txtTime = new Text();
private Rotate rotateSecondHand = new Rotate(0,0,0);
    private Rotate rotateMinuteHand = new Rotate(0,0,0);
    private Rotate rotateHourHand = new Rotate(0,0,0);


    public Text getTxtTime() {
        return txtTime;
    }

    public Rotate getRotateSecondHand() {
        return rotateSecondHand;
    }

    public void setRotateSecondHand(Rotate rotateSecondHand) {
        this.rotateSecondHand = rotateSecondHand;
    }

    public Rotate getRotateMinuteHand() {
        return rotateMinuteHand;
    }

    public void setRotateMinuteHand(Rotate rotateMinuteHand) {
        this.rotateMinuteHand = rotateMinuteHand;
    }

    public Rotate getRotateHourHand() {
        return rotateHourHand;
    }

    public void setRotateHourHand(Rotate rotateHourHand) {
        this.rotateHourHand = rotateHourHand;
    }

    public Thread getTimer() {
        return timer;
    }

    public void setTimer(Thread timer) {
        this.timer = timer;
    }

    private Thread timer = new Thread( () -> {
        SimpleDateFormat dt = new SimpleDateFormat("HH:mm:SS");
        Date now  = new Date();
        String time  = dt.format(now);
        Platform.runLater(() -> {
            //updating live UI object requires JavaFX App Thread
            rotateSecondHand.setAngle(now.getSeconds()*6-90);
            rotateMinuteHand.setAngle(now.getSeconds()*6-90);
            rotateHourHand.setAngle(now.getSeconds()*30-90);
            txtTime.setText(time);
            try {
                //running long operation not on UI thread
                Thread.sleep(1000);
            } catch (InterruptedException ex){

            }
        });
    }


    );

}
