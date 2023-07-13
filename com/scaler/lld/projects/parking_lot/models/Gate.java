package com.scaler.lld.projects.parking_lot.models;

public class Gate {

    protected BaseModel baseModel;
    private String gateName;

    public BaseModel getBaseModel() {
        return baseModel;
    }

    public String getGateName() {
        return gateName;
    }

    public Gate(BaseModel baseModel, String gateName) {
        this.baseModel = baseModel;
        this.gateName = gateName;
    }
}
