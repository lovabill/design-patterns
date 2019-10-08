package com.lovabill.designpattern.builder.fluent;

class ZooTrainBuilder extends TrainBuilder<ZooTrainBuilder> {

    private static final String LINK = "^-^";
    private static final String BARRIER = "|";

    public ZooTrainBuilder withZooWagon(String animalCage) {
        train = train + LINK + BARRIER + animalCage + BARRIER;
        return self();
    }

    @Override
    protected ZooTrainBuilder self() {
        return this;
    }
}
