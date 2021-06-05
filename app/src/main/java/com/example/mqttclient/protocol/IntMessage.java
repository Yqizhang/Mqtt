package com.example.mqttclient.protocol.protocol;

public class IntMessage extends BaseMessage{
    public int value;
    public IntMessage(int value){
        this.value=value;
        this.type=Type.BOOL.index;
    }
}
