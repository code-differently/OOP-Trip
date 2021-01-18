package org.example;

import java.util.Date;
import java.util.Random;

public class CovidResults {

	private Date date;
	private Boolean covidPositive;

	CovidResults(int year,int month,int day){
		this.date = new Date(year, month,day);
	}

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

}