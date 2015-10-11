package com.cisc181.core;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@Test
	public void Test() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date dateOfBirth6 = null;
		Date hireDate6 = null;
		boolean personException = false;
		boolean phoneNumberException = false;
		
		// To set date of invalid date of birth to throw exception
		try {
			dateOfBirth6 = dateFormat.parse("1800-03-21");
			hireDate6 = dateFormat.parse("2009-09-01");
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		// To create a new instance of staff, and assign invalid date of birth and phone number
		Staff staff6 = new Staff("Shuge", "Abu", "Wang", dateOfBirth6, "102 Stone Gate Blvd", "3025674569",
				"shuge@gmail.com", "9AM to 10AM", 5, 9900, hireDate6, eTitle.Miss);
		
		// To catch exception if age is grater than 100 by using custom exception 'PersonException'
		try {
			staff6.PrintAge();
		} catch (PersonException e) {
			personException = true;
			System.out.println("Sorry, date of birth can't be more than 100 years before");
		}
		
		// To catch exception if the format of phone number isn't correct by using custom exception 'PersonException'
		try {
			staff6.PrintPhoneNumber();
		} catch (PersonException e) {
			phoneNumberException = true;
			System.out.println("Sorry, please enter vaild phone number");
		}
		
		// To test two exceptions
		assertTrue(personException);
		assertTrue(phoneNumberException);
	}

	@Test
	public void test() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date dateOfBirth1 = null;
		Date hireDate1 = null;
		Date dateOfBirth2 = null;
		Date hireDate2 = null;
		Date dateOfBirth3 = null;
		Date hireDate3 = null;
		Date dateOfBirth4 = null;
		Date hireDate4 = null;
		Date dateOfBirth5 = null;
		Date hireDate5 = null;

		try {
			dateOfBirth1 = dateFormat.parse("1994-11-27");
			hireDate1 = dateFormat.parse("2010-11-27");
			dateOfBirth2 = dateFormat.parse("1956-10-12");
			hireDate2 = dateFormat.parse("2011-05-26");
			dateOfBirth3 = dateFormat.parse("1978-05-09");
			hireDate3 = dateFormat.parse("2010-04-11");
			dateOfBirth4 = dateFormat.parse("1991-12-25");
			hireDate4 = dateFormat.parse("2015-01-17");
			dateOfBirth5 = dateFormat.parse("1973-03-21");
			hireDate5 = dateFormat.parse("2009-09-01");

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// To create 5 instance of staff, and assign them with specific data
		Staff staff1 = new Staff("Longzhao", "", "Hong", dateOfBirth1, "2206 Stone Gate Blvd", "1234567890",
				"hlz911@gmail.com", "3PM to 5PM", 2, 5000, hireDate1, eTitle.Mr);
		Staff staff2 = new Staff("Mengxi", "", "Jiang", dateOfBirth2, "702 Stone Gate Blvd", "3025218799",
				"mengxi@gmail.com", "11AM to 1PM", 3, 10000, hireDate2, eTitle.Miss);
		Staff staff3 = new Staff("Xin", "", "Li", dateOfBirth3, "702 Stone Gate Blvd", "3025776344", "xinli@gmail.com",
				"2PM to 3PM", 1, 12000, hireDate3, eTitle.Mr);
		Staff staff4 = new Staff("Jianbo", "", "Pei", dateOfBirth4, "4506 Stone Gate Blvd", "9178894567",
				"jianbopei@gmail.com", "1PM to 2PM", 4, 8000, hireDate4, eTitle.Mr);
		Staff staff5 = new Staff("Shuge", "Abu", "Wang", dateOfBirth5, "102 Stone Gate Blvd", "3025674563",
				"shuge@gmail.com", "9AM to 10AM", 5, 9900, hireDate5, eTitle.Miss);
		
		// Add 5 staffs' instances to an arrayList
		ArrayList<Staff> personList = new ArrayList<Staff>();
		personList.add(staff1);
		personList.add(staff2);
		personList.add(staff3);
		personList.add(staff4);
		personList.add(staff5);
		
		// To calculate staffs' average salary
		double avg = (staff1.getSalary() + staff2.getSalary() + staff3.getSalary() + staff4.getSalary()
				+ staff5.getSalary()) / 5;
		
		// To test average salary
		assertEquals(avg, 8980, 0.1);
	}
}
