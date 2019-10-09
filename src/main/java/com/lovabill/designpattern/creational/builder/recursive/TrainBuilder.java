package com.lovabill.designpattern.creational.builder.recursive;

class TrainBuilder<T extends TrainBuilder<T>> {
    private static final String LINK = ">-<";
    protected String train = "";

    protected T self() {
        return (T) this;
    }

    public T withEngine(String engine) {
        train = engine + train;
        return self();
    }

    public T withWagon(String engine) {
        train = train + LINK + engine;
        return self();
    }

    public String build() {
        return train;
    }
}
