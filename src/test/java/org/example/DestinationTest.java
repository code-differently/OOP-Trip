package org.example;

import org.example.exception.InfectTestDateException;
import org.example.exception.InfectionException;
import org.example.exception.InsufficientFundsException;
import org.example.exception.NoFlyListException;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DestinationTest {

	private Destination destination = new Destination();
	private Traveler traveler = new Traveler();
	private CovidResults covidResults = new CovidResults(2021,0,11);

	@Test
	void setName() {
		destination.setName("Madrid, Spain");
		String expected = "Madrid, Spain";
		String actual = destination.getName();
		Assert.assertEquals(expected,actual);
	}

	@Test
	void setDistance() {
		destination.setDistance(3688.00);
		Double expected = 3688.00;
		Double actual = destination.getDistance();
		Assert.assertEquals(expected,actual);

	}

	@Test
	void setCostPerMile() {
		destination.setCostPerMile(20.00);
		Double expected = 20.00;
		Double actual = destination.getCostPerMile();
		Assert.assertEquals(expected,actual);
	}

	@Test
	void setRequireCovidTest() {
		destination.setRequireCovidTest(true);
		Assert.assertTrue(destination.getRequireCovidTest());
	}

	@Test
	void testAllowToVisitMoney(){
		traveler.setMoney(2600.00);
		destination.setCostPerMile(100.00);
		destination.setDistance(27.00);
		Assertions.assertThrows(InsufficientFundsException.class,
				()->destination.allowToVisit(traveler));
	}

	@Test
	void testAllowToVisitNoFly(){
		traveler.setMoney(2600.00);
		destination.setCostPerMile(100.00);
		destination.setDistance(26.00);

		traveler.setNoFlyList(true);
		Assertions.assertThrows(NoFlyListException.class,
				()->destination.allowToVisit(traveler));
	}

	@Test
	void testAllowToVisitInfected(){
		traveler.setMoney(2600.00);
		destination.setCostPerMile(100.00);
		destination.setDistance(26.00);
		traveler.setNoFlyList(false);
		covidResults.generateTest();

		traveler.setCovidResults(covidResults);
		System.out.println(traveler.getCovidResults().getCovidPositive());

		if(covidResults.getCovidPositive()){
			Assertions.assertThrows(InfectionException.class,
					()->destination.allowToVisit(traveler));
		}
	}

	@Test
	void testAllowToVisitTestDate(){
		traveler.setMoney(2600.00);
		destination.setCostPerMile(100.00);
		destination.setDistance(26.00);
		traveler.setNoFlyList(false);
		covidResults.generateTest();
		traveler.setCovidResults(covidResults);
		destination.setRequireCovidTest(true);

		//automatically enter 5 as my input
		String input = "5";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);

		Assertions.assertThrows(InfectTestDateException.class,
				()->destination.allowToVisit(traveler));
	}
}