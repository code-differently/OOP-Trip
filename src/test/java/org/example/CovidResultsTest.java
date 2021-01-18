package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.converter.DefaultArgumentConverter;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class CovidResultsTest {
	private CovidResults covidResults = new CovidResults(2021,0,10);

	@Test
	public void getDateTest(){
		Date actual = covidResults.getDate();
		Date expected = new Date(2021,0,10);

		Assert.assertEquals(expected,actual);
	}

	@Test
	public void testGenerateTest(){
		covidResults.generateTest();
		Assert.assertNotNull(covidResults.getCovidPositive());
	}
}