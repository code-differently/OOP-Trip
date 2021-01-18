package org.example;

import org.example.exception.InsufficientFundsException;

import java.util.List;

public class Traveler {
	private String name;
	private String passPortNo;
	private Double money;
	private List<Destination> placesVisited;
	private CovidResults covidResults;

	Traveler(){
	}

	public void bookATrip(Destination destination)throws InsufficientFundsException {

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

	public List<Destination> getPlacesVisited() {
		return placesVisited;
	}

	public void setPlacesVisited(List<Destination> placesVisited) {
		this.placesVisited = placesVisited;
	}

	public CovidResults getCovidResults() {
		return covidResults;
	}

	public void setCovidResults(CovidResults covidResults) {
		this.covidResults = covidResults;
	}
}
