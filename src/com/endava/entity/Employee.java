package com.endava.entity;

import java.time.*;
import java.util.*;

/**
 * Created by vcerbu on 3/27/2017.
 */
public class Employee extends Worker {


    private LocalDateTime hireDate;
    private Worker worker = new Worker();

    public Employee(LocalDateTime hireDate, Worker worker) {
        this.hireDate = hireDate;
        this.worker = worker;
    }

    public LocalDateTime getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDateTime hireDate) {
        this.hireDate = hireDate;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }
}
