package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DestinationTest {

	private Destination destination = new Destination();

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
	}

	@Test
	void allowToVisit() {
	}
}