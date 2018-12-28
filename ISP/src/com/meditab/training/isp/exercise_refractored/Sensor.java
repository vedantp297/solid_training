package com.meditab.training.isp.exercise;

import java.util.Random;

public class Sensor
{
    public void register(proximity prox)
    {
        while (true) {
            if (isPersonClose()) {
                prox.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}
