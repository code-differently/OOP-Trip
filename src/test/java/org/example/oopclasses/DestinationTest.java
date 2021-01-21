package org.example.oopclasses;

import org.example.exceptions.InsufficientFundsException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DestinationTest {

    Destination destination;
    @Before
    public void setUp() {
        destination = new Destination("Paris", 1000.0,0.13,false);
    }

    @Test
    public void allowToVisitTrue() {
        List<Destination> placesVisited = new ArrayList<>();
        placesVisited.add(destination);
        boolean noFlyList = false;
        CovidResults covidResults = new CovidResults(new Date(), false);
        Traveler traveler = new Traveler("Tim", "1234E", 600.0, placesVisited, false, covidResults);
        destination.allowToVisit(traveler);

        //This test passes if no exception is thrown
    }

    @Test(expected = InsufficientFundsException.class)
    public void allowToVisitFalse(){
        List<Destination> placesVisited = new ArrayList<>();
        placesVisited.add(destination);
        boolean noFlyList = false;
        CovidResults covidResults = new CovidResults(new Date(), false);
        Traveler traveler = new Traveler("Tim", "1234E", 50.0, placesVisited, false, covidResults);
        destination.allowToVisit(traveler);

        //This test passes if InsufficientFundsException is thrown.
    }
    @Test
    public void getName() {
        destination = new Destination("Paris", 1000.0,0.13,false);
        String expected = "Paris";
        String actual = destination.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setName() {
    }

    @Test
    public void getDistance() {
        Double expected = 1000.0;
        Double actual = destination.getDistance();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setDistance() {
    }

    @Test
    public void getCostPerMile() {

        Double expected = 0.13;
        Double actual = destination.getCostPerMile();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setCostPerMile() {
    }

    @Test
    public void getRequireCovidTest() {
        Boolean expected = false;
        Boolean actual = destination.getRequireCovidTest();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setRequireCovidTest() {
    }


}