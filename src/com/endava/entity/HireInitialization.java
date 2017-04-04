package com.endava.entity;

import com.endava.enums.Country;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vcerbu on 4/3/2017.
 */
public class HireInitialization {

    public static List<Employee> hiringList = new ArrayList<Employee>();
    public static List<Worker> workersList = new ArrayList<Worker>();
    List<Country> countriesList1 = new ArrayList<>();
    List<Country> countriesList2 = new ArrayList<>();
    List<Country> countriesList3 = new ArrayList<>();
    List<Country> countriesList4 = new ArrayList<>();
    List<Country> countriesList5 = new ArrayList<>();
    Worker worker1 = new Worker("James", "Bond", 33, true, countriesList1);
    Worker worker2 = new Worker("Tom", "Land", 25, true, countriesList2);
    Worker worker3 = new Worker("Christian", "Lazy", 53, false, countriesList3);
    Worker worker4 = new Worker("John", "Port", 19, false, countriesList4);
    Worker worker5 = new Worker("Iulius", "Caesar", 40, true, countriesList5);
    Worker worker6 = new Worker("Andrian", "Mars", 30, false, countriesList1);

    {
        countriesList1.add(Country.Austria);
        countriesList1.add(Country.Moldova);
        countriesList2.add(Country.GreatBritain);
        countriesList2.add(Country.Poland);
        countriesList2.add(Country.Canada);
        countriesList3.add(Country.Italy);
        countriesList3.add(Country.Greece);
        countriesList3.add(Country.Romania);
        countriesList4.add(Country.France);
        countriesList4.add(Country.Egypt);
        countriesList4.add(Country.Belgium);
        countriesList4.add(Country.Cuba);
        countriesList5.add(Country.Portugal);
        countriesList5.add(Country.Sudan);
        countriesList5.add(Country.Austria);

        workersList.add(worker1);
        workersList.add(worker2);
        workersList.add(worker3);
        workersList.add(worker4);
        workersList.add(worker5);
        workersList.add(worker6);

        hiringList.add(new Employee(LocalDateTime.of(1990, Month.APRIL, 8, 12, 30), worker1));
        hiringList.add(new Employee(LocalDateTime.of(2015, Month.JULY, 22, 8, 15), worker2));
        hiringList.add(new Employee(LocalDateTime.of(2000, Month.FEBRUARY, 15, 10, 10), worker3));
        hiringList.add(new Employee(LocalDateTime.of(1980, Month.JULY, 15, 9, 30), worker4));
        hiringList.add(new Employee(LocalDateTime.of(1998, Month.MARCH, 17, 15, 15), worker5));
        hiringList.add(new Employee(LocalDateTime.of(1985, Month.OCTOBER, 20, 11, 25), worker6));
        hiringList.add(new Employee(LocalDateTime.of(1990, Month.NOVEMBER, 15, 10, 30), worker1));
        hiringList.add(new Employee(LocalDateTime.of(1999, Month.DECEMBER, 20, 8, 45), worker2));
        hiringList.add(new Employee(LocalDateTime.of(2017, Month.JULY, 5, 10, 30), worker3));
        hiringList.add(new Employee(LocalDateTime.of(2015, Month.MARCH, 27, 17, 30), worker4));
        hiringList.add(new Employee(LocalDateTime.of(2001, Month.JUNE, 7, 10, 15), worker5));
        hiringList.add(new Employee(LocalDateTime.of(1970, Month.SEPTEMBER, 20, 20, 20), worker6));
        hiringList.add(new Employee(LocalDateTime.of(2001, Month.MAY, 15, 10, 30), worker1));
        hiringList.add(new Employee(LocalDateTime.of(1996, Month.JUNE, 12, 8, 25), worker2));
        hiringList.add(new Employee(LocalDateTime.of(1980, Month.APRIL, 20, 10, 10), worker3));
        hiringList.add(new Employee(LocalDateTime.of(1993, Month.JULY, 18, 9, 30), worker4));
        hiringList.add(new Employee(LocalDateTime.of(2008, Month.MARCH, 25, 14, 15), worker5));
        hiringList.add(new Employee(LocalDateTime.of(2007, Month.AUGUST, 28, 17, 25), worker6));
        hiringList.add(new Employee(LocalDateTime.of(1990, Month.NOVEMBER, 15, 10, 40), worker1));
        hiringList.add(new Employee(LocalDateTime.of(1989, Month.JANUARY, 10, 8, 55), worker2));
    }
}
