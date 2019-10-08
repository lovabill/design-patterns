package com.lovabill.designpattern.builder.faceted;

class TrainWagonBuilder extends TrainBuilder {
    public TrainWagonBuilder(String train) {
        this.train = train;
    }

    public TrainWagonBuilder withGoodsOf(String goodsType) {
        train = train + "~" + goodsType + "~";
        return this;
    }

    public TrainWagonBuilder withPassengersOfTotal(Integer maxCapacity) {
        train = train + "$MaxPeople:" + maxCapacity + "$";
        return this;
    }
}

