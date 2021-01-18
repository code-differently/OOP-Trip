package org.example;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class CovidResults implements DateAddition{

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

	public Date addDays(Date date, int days)
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, days);
		return cal.getTime();
	}

}