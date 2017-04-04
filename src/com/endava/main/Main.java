package com.endava.main;

import com.endava.entity.HireInitialization;
import com.endava.utilities.WorkersUtil;
import com.endava.enums.Country;

import java.time.LocalDateTime;
import java.time.Month;

/**
 * Created by vcerbu on 3/27/2017.
 */
public class Main {
    public static void main(String[] args) {
        HireInitialization hireInitialization = new HireInitialization();
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println(WorkersUtil.workersReadyForTrip(LocalDateTime.of(1996, Month.JUNE, 12, 8, 25), LocalDateTime.of(2017, Month.APRIL, 20, 10, 10)));
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println(WorkersUtil.checkIfWorkerCanVisit(HireInitialization.workersList.get(0), Country.Greece));
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println(WorkersUtil.getWorkersWithCountriesWhichTheyCanVisit());
    }
}
