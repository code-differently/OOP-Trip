package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.converter.DefaultArgumentConverter;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class CovidResultsTest {
	private CovidResults covidResults = new CovidResults();

	@Test
	public void getDateTest(){
		Date date = new Date(2021, 0, 10);
		covidResults.setDate(date);
		Object actual = covidResults.getDate();

		Assert.assertEquals(date,actual);
	}

	@Test
	public void setCovidPositive() {
		covidResults.setCovidPositive(true);
		boolean actual = covidResults.getCovidPositive();

		Assert.assertTrue(actual);
	}
}