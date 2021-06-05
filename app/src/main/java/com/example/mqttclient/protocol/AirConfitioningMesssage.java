package com.example.mqttclient.protocol.protocol;

public class AirConfitioningMesssage extends BaseMessage{
    public float value;
    public boolean state;
    public AirConfitioningMesssage(boolean state,float value){
        this.state=state;
        this.value=value;
        this.type=Type.AIR_CONDITIONING.index;
    }
}
