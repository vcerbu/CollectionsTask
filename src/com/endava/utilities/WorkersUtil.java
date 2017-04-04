package com.endava.utilities;

import com.endava.entity.Employee;
import com.endava.entity.HireInitialization;
import com.endava.entity.Worker;
import com.endava.enums.Country;

import java.time.*;
import java.util.*;

/**
 * Created by vcerbu on 3/27/2017.
 */
public class WorkersUtil {

    public static HashSet<Worker> workersReadyForTrip(LocalDateTime startDate, LocalDateTime endDate) {
        HashSet<Worker> workersReadyForTrip = new HashSet<>();
        for (Employee employee : HireInitialization.hiringList) {
            if ((employee.getWorker().isReadyForTrip()) &&
                    (employee.getHireDate().isBefore(endDate)) && employee.getHireDate().isAfter(startDate))
                workersReadyForTrip.add(employee.getWorker());
        }
        return workersReadyForTrip;
    }

    public static boolean checkIfWorkerCanVisit(Worker worker, Country country) {
        System.out.println("Can " + worker.getFirstName() + " visit " + country + "?");
        for (Worker work : HireInitialization.workersList) {
            if (worker.getCountriesList().contains(country))
                return true;
        }
        return false;
    }
//


    public static Map<Country, Set<Worker>> getWorkersWithCountriesWhichTheyCanVisit() {
        NavigableMap<Country, Set<Worker>> countryVisitedByListOfWorkers = new TreeMap<Country, Set<Worker>>();
        for (Worker worker : HireInitialization.workersList) {//for every worker
            for (Country country : worker.getCountriesList()) {//select his list of countries
                Set<Worker> workers = countryVisitedByListOfWorkers.get(country);//select set of workers assigned to this country from Map countryVisitedByListOfWorkers
                if (workers == null) {//if there is no set of workers assigned to this country
                    workers = new HashSet<>();//create a new set of workers
                    countryVisitedByListOfWorkers.put(country, workers);//add to map the country and the set of workers
                }//else
                workers.add(worker);//add worker to set of workers referred to countryVisitedByListOfWorkers
            }
        }
        return Collections.unmodifiableMap(countryVisitedByListOfWorkers.descendingMap());//make the map unmodifiable and sort descending by country
    }

}
