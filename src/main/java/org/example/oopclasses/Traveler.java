package org.example.oopclasses;

import java.util.List;

public class Traveler {
    private String name;
    private String pasPortNo;
    private Double money;
    private List<Destination> placesVisited;
    private boolean noFlyList;
    private CovidResults covidResults;



    public Traveler(String name, String pasPortNo, Double money, List<Destination> placesVisited, boolean noFlyList, CovidResults covidResults) {
        this.name = name;
        this.pasPortNo = pasPortNo;
        this.money = money;
        this.placesVisited = placesVisited;
        this.noFlyList = noFlyList;
        this.covidResults = covidResults;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasPortNo() {
        return pasPortNo;
    }

    public void setPasPortNo(String pasPortNo) {
        this.pasPortNo = pasPortNo;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }


    public List<Destination> getPlacesVisited() {
        return placesVisited;
    }

    public void setPlacesVisited(List<Destination> placesVisited) {
        this.placesVisited = placesVisited;
    }

    public boolean isNoFlyList() {
        return noFlyList;
    }

    public void setNoFlyList(boolean noFlyList) {
        this.noFlyList = noFlyList;
    }

    public CovidResults getCovidResults() {
        return covidResults;
    }

    public void setCovidResults(CovidResults covidResults) {
        this.covidResults = covidResults;
    }

    public void bookATrip(Destination destination){

    }
}
