package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TravelerTest {

	private Traveler traveler = new Traveler();
	private Destination destination1 = new Destination();
	private Destination destination2 = new Destination();

	@Test
	public void setName() {
		traveler.setName("ryder");
		String expected = "ryder";
		String actual = traveler.getName();
		Assert.assertEquals(expected,actual);
	}

	@Test
	public void setPassPortNo() {
		traveler.setPassPortNo("11");
		String expected = "11";
		String actual = traveler.getPassPortNo();
		Assert.assertEquals(expected,actual);
	}

	@Test
	public void setMoney() {
		traveler.setMoney(25000.00);
		Double expected = 25000.00;
		Double actual = traveler.getMoney();
		Assert.assertEquals(expected,actual);
	}

	@Test
	public void setCovidResults() {
		CovidResults covidResults = new CovidResults(2021,0,11);
		traveler.setCovidResults(covidResults);
		Object actual = traveler.getCovidResults();
		Assert.assertEquals(covidResults, actual);
	}

	@Test
	public void setIsNoFlyList(){
		traveler.setNoFlyList(true);
		boolean actual = traveler.isNoFlyList();
		Assert.assertTrue(actual);
	}

	@Test
	public void setPlacesVisited() {
		ArrayList<Destination> places = new ArrayList<>();
		places.add(destination1);
		places.add(destination2);
		traveler.setPlacesVisited(places);
		int expected = places.size();
		int actual = traveler.getPlacesVisited().size();
		Assert.assertEquals(expected,actual);
	}

	@Test
	public void bookATrip() {

	}
}