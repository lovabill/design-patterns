package com.lovabill.designpattern.creational.builder.faceted;

class TrainEngineBuilder extends TrainBuilder {
    public TrainEngineBuilder(String train) {
        this.train = train;
    }

    public TrainEngineBuilder ofModel(String modelName) {
        train = train + "[" + modelName + "]";
        return this;
    }

    public TrainEngineBuilder poweredBy(String fuelType) {
        train = train + "{" + fuelType + "}";
        return this;
    }

}

