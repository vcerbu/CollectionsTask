package com.endava.entity;

import com.endava.enums.Country;

import java.util.*;

/**
 * Created by vcerbu on 3/27/2017.
 */
public class Worker {

    private String firstName;
    private String lastName;
    private int age;
    private boolean readyForTrip;
    private List<Country> countriesList = new ArrayList<Country>();

    public Worker() {
    }

    public Worker(String firstName, String lastName, int age, boolean readyForTrip, List<Country> countriesList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.readyForTrip = readyForTrip;
        this.countriesList = countriesList;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isReadyForTrip() {
        return readyForTrip;
    }

    public void setReadyForTrip(boolean readyForTrip) {
        this.readyForTrip = readyForTrip;
    }

    public List<Country> getCountriesList() {
        return countriesList;
    }

    public void setCountriesList(List<Country> countriesList) {
        this.countriesList = countriesList;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", readyForTrip=" + readyForTrip +
                ", countriesList=" + countriesList +
                '}' + "\n";
    }
}
