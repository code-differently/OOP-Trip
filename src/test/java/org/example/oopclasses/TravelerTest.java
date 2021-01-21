package org.example.oopclasses;

import org.example.exceptions.TravelRejectionException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TravelerTest {

    Traveler traveler;
    List<Destination> placesVisited;

    @Before
    public void setUp() throws TravelRejectionException {
        String name = "Tim";
        String passPort = "1234E";
        Double money = 50.0;
        List<Destination> placesVisited = new ArrayList<>();
        placesVisited.add(new Destination("Florida", 1000.0, 0.13, false));
        boolean noFlyList = false;
        CovidResults covidResults = new CovidResults(new Date(), false);
        traveler = new Traveler(name, passPort,money,placesVisited,noFlyList,covidResults);
    }
    @Test
    public void bookATrip() {
        String name = "Tim";
        String passPort = "1234E";
        Double money = 50.0;
        List<Destination> placesVisited = new ArrayList<>();
        placesVisited.add(new Destination("Florida", 1000.0, 0.13, false));
        boolean noFlyList = false;
        CovidResults covidResults = new CovidResults(new Date(), false);
        traveler = new Traveler(name, passPort,money,placesVisited,noFlyList,covidResults);

    }

    @Test
    public void getName() {
        String expected = "Tim";
        String actual = traveler.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setName() {
    }

    @Test
    public void getPasPortNo() {
        String expected = "1234E";
        String actual = traveler.getPasPortNo();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setPasPortNo() {
    }

    @Test
    public void getMoney() {
        Double expected = 50.0;
        Double actual = traveler.getMoney();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setMoney() {
    }

    @Test
    public void getPlacesVisited() {
    }

    @Test
    public void setPlacesVisited() {
    }

    @Test
    public void isNoFlyList() {
    }

    @Test
    public void setNoFlyList() {
    }

    @Test
    public void getCovidResults() {
    }

    @Test
    public void setCovidResults() {
    }


}