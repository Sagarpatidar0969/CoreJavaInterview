package com.javabasics;

import java.time.LocalDate;
import java.time.Period;

public class DateAgeCalculate {

// here is a code of age cal
	public static void main(String[] args) {

		LocalDate today = LocalDate.now();

		LocalDate empBiryth = LocalDate.of(2003, 10, 13);

		Period p = Period.between(empBiryth, today);

		System.out.println("employe age : " + p.getYears());

	}

}