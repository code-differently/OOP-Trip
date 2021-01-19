package org.example;

import org.example.exception.InfectTestDateException;
import org.example.exception.TravelerRejectionException;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;

public class TravelerTest {

	private Traveler traveler = new Traveler();
	private Destination destination1 = new Destination();
	private Destination destination2 = new Destination();
	private CovidResults covidResults = new CovidResults();

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
	public void bookATripException(){

		//automatically enter 5 as my input
		String input = "5";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		traveler.setMoney(2600.00);
		destination1.setCostPerMile(100.00);
		destination1.setDistance(26.00);
		traveler.setNoFlyList(false);
		covidResults.generateTest();
		traveler.setCovidResults(covidResults);
		destination1.setRequireCovidTest(true);

		Assertions.assertThrows(TravelerRejectionException.class,
				()->traveler.bookATrip(destination1));
	}

	@Test
	public void bookATripList() throws TravelerRejectionException {
		//automatically enter 1 as my input of last test date
		String input = "1";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);

		//setting traveler affordable expenses
		traveler.setMoney(2600.00);
		destination1.setCostPerMile(100.00);
		destination1.setDistance(25.00);

		//traveler isNot on the lise
		traveler.setNoFlyList(false);

		//randomly generate results and prints out
		//test pass only when true
		covidResults.generateTest();
		traveler.setCovidResults(covidResults);
		System.out.println(covidResults.getCovidPositive());

		//destination requires CovidTest
		destination1.setRequireCovidTest(true);

		//tracking list of places visited
		ArrayList<Destination> places = new ArrayList<>();
		traveler.setPlacesVisited(places);

		traveler.bookATrip(destination1);

		int expected = places.size();
		int actual = traveler.getPlacesVisited().size();

		Assert.assertEquals(expected,actual);

	}
}