package com.lovabill.designpattern.builder.faceted;

class TrainBuilder {
    protected String train = "";

    public TrainEngineBuilder withEngine() {
        return new TrainEngineBuilder(train);
    }

    public TrainWagonBuilder withWagons() {
        return new TrainWagonBuilder(train);
    }

    public String build() {
        return train;
    }
}
