package com.company;


public class Main {

    public static void main(String[] args) {
        // this exercise is part of a learning course on udemy where the main function is pre-defined and hidden
        // In order to test in in our dev environment, I have set this simple main method calling the other 2
            double kmh = 1.5d;
            toMilesPerHour(kmh);
            printConversion(kmh);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return(long) (Math.round(kilometersPerHour / 1.609));
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + (Math.round(kilometersPerHour / 1.609)) + " mi/h");
        }
    }
}
