package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TravelerTest {

	private Traveler traveler = new Traveler();

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
	public void setPlacesVisited() {

	}

	@Test
	public void setCovidResults() {
		CovidResults covidResults = new CovidResults(2021,0,11);
		traveler.setCovidResults(covidResults);
		Object actual = traveler.getCovidResults();
		Assert.assertEquals(covidResults, actual);
	}

	@Test
	public void bookATrip() {
	}
}