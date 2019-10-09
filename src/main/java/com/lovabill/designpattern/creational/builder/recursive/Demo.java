package com.lovabill.designpattern.creational.builder.recursive;

class Demo {
    public static void main(String[] args) {
        String myTrain = new ZooTrainBuilder()
                .withEngine("[Diesel-Engine]")
                .withWagon("[Passengers]")
                .withWagon("[Passengers]")
                .withWagon("[Mail]")
                .withWagon("[Goods]")
                .withZooWagon("[Elephants]")
                .withZooWagon("[Lions]")
                .build();
        System.out.println(myTrain);
    }
}
