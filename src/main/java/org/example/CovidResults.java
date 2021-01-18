package org.example;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class CovidResults {

	private Date date;
	private Boolean covidPositive;

	CovidResults(int year,int month,int day){
		this.date = new Date(year, month,day);
	}

	CovidResults(){}

	public Date getDate() {
		return date;
	}

	public Boolean getCovidPositive() {
		return covidPositive;
	}


	public boolean generateTest(){
		Random random = new Random();
		covidPositive = random.nextBoolean();
		return covidPositive;
	}

	public Date addDays()
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(this.date);
		cal.add(Calendar.DATE, 3);
		return cal.getTime();
	}


	public Date addDays(int day)
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, day);
		return cal.getTime();
	}

}