package org.example.oopclasses;

import org.example.exceptions.InfectTestDateException;

import java.util.Date;

public class CovidResults {
    private Date date;
    private Boolean covidPositive;

    public CovidResults(Date date, Boolean covidPositive) {
        this.date = date;
        this.covidPositive = covidPositive;
    }


    public Date getDate() throws InfectTestDateException {
        return null;
    }
}
