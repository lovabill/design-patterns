package com.lovabill.designpattern.creational.prototype;

class Location {
    public String city, continent;

    public Location(String city, String continent) {
        this.city = city;
        this.continent = continent;
    }

    public Location(Location other) {
        this(other.city, other.continent); //Does the work of cloning.
    }

    public Location clone() {
        return new Location(this); //Does the work of cloning.
    }

    @Override
    public String toString() {
        return "Location{" +
                ", city='" + city + '\'' +
                ", continent='" + continent + '\'' +
                '}';
    }
}

class Employee {
    public String name;
    public Location address;

    public Employee(String name, Location address) {
        this.name = name;
        this.address = address;
    }

    public Employee(Employee other) { //Does the work of cloning.
        name = other.name;
        address = new Location(other.address);
    }

    public Employee clone() {
        return new Employee(this); //Does the work of cloning.
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}

/**
 * The simpliest way to deep copy an object is using a copy method written either as a constructor
 * or a method that copies all immutable objects.
 */
class CopyConstructorDemo {
    public static void main(String[] args) {
        Employee john = new Employee("John", new Location("London", "Europe"));

        Employee stavros = john.clone();
        stavros.name = "Stavros";
        stavros.address.city = "Athens";


        Employee katia = new Employee(john);
        katia.name = "Katia";
        katia.address.city = "Madrid";

        System.out.println(john);
        System.out.println(stavros);
        System.out.println(katia);
    }
}