package com.lovabill.designpattern.creational.builder.simple;

/**
 * Use a builder to construct an object piece by piece.
 */
class Demo {
    public static void main(String[] args) {
        String myTrain = new TrainBuilder()
                .withEngine("[Diesel-Engine]")
                .withWagon("[Passengers]")
                .withWagon("[Passengers]")
                .withWagon("[Mail]")
                .withWagon("[Goods]")
                .build();
        System.out.println(myTrain);
    }
}
