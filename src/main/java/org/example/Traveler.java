package org.example;

import org.example.exception.InsufficientFundsException;
import org.example.exception.TravelerRejectionException;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Traveler {
	private String name;
	private String passPortNo;
	private Double money;
	private List<Destination> placesVisited;
	private CovidResults covidResults;
	private boolean noFlyList;


	Traveler(){
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassPortNo() {
		return passPortNo;
	}

	public void setPassPortNo(String passPortNo) {
		this.passPortNo = passPortNo;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public CovidResults getCovidResults() {
		return covidResults;
	}

	public void setCovidResults(CovidResults covidResults) {
		this.covidResults = covidResults;
	}

	public boolean isNoFlyList() {
		return noFlyList;
	}

	public void setNoFlyList(boolean noFlyList) {
		this.noFlyList = noFlyList;
	}
	public List<Destination> getPlacesVisited() {
		return placesVisited;
	}

	public void setPlacesVisited(List<Destination> placesVisited) {
		this.placesVisited = placesVisited;
	}


	public void bookATrip(Destination destination)throws TravelerRejectionException {

	}
}
