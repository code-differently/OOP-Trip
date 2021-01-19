package org.example;

import org.example.exception.InfectTestDateException;
import org.example.exception.InfectionException;
import org.example.exception.InsufficientFundsException;
import org.example.exception.NoFlyListException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InsufficientFundsException, InfectionException, InfectTestDateException, NoFlyListException {
        Traveler traveler = new Traveler();
        Destination destination = new Destination();
        CovidResults covidResults = new CovidResults(2021,0,15);

        traveler.setMoney(2600.00);
        destination.setCostPerMile(100.00);
        destination.setDistance(26.00);
        traveler.setNoFlyList(false);
        covidResults.generateTest();
        traveler.setCovidResults(covidResults);
        destination.setRequireCovidTest(true);

        destination.allowToVisit(traveler);
    }
}
