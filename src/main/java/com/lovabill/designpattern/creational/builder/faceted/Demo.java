package com.lovabill.designpattern.creational.builder.faceted;

public class Demo {
    public static void main(String[] args) {
        String train = new TrainBuilder()
                .withEngine()
                .ofModel("GP18")
                .poweredBy("Diesel")
                .withWagons()
                .withGoodsOf("Coal")
                .withGoodsOf("Grain")
                .withPassengersOfTotal(120)
                .build();
        System.out.println(train);
    }
}
