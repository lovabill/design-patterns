package com.lovabill.designpattern.builder.simple;

class TrainBuilder {
    private static final String LINK = ">-<";
    private String train = "";

    public TrainBuilder withEngine(String engine) {
        train = engine + train;
        return this;
    }

    public TrainBuilder withWagon(String engine) {
        train = train + LINK + engine;
        return this;
    }

    public String build() {
        return train;
    }
}