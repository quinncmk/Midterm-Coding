package com.cisc181.core;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import com.cisc181.eNums.eMajor;

import javassist.bytecode.stackmap.BasicBlock.Catch;

public class Student_Test {
	@Test
	public void Data() {
		// To create 3 UUID for course UUID 
		UUID courseUUID1 = UUID.randomUUID();
		UUID courseUUID2 = UUID.randomUUID();
		UUID courseUUID3 = UUID.randomUUID();
		
		// To create 3 new instance of course, and assign them with specific data
		Course course1 = new Course(courseUUID1, "MATH 351", 3, eMajor.PHYSICS);
		Course course2 = new Course(courseUUID2, "CISC 181", 3, eMajor.BUSINESS);
		Course course3 = new Course(courseUUID3, "ELEG 205", 3, eMajor.CHEM);
		
		// To create an arrayList and add three courses' instances into it
		ArrayList<Course> courseList = new ArrayList<Course>(); 
		courseList.add(course1);
		courseList.add(course2);
		courseList.add(course3);
		
		// Generate a simple date format
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		// To create 2 UUID for 2 semester fall and spring
		UUID fall = UUID.randomUUID();
		UUID spring = UUID.randomUUID();
		
		try
		{
			Date springStart = dateFormat.parse("2014-02-01");
			Date springEnd = dateFormat.parse("2014-05-28");
			Date fallStart = dateFormat.parse("2014-09-01");
			Date fallEnd = dateFormat.parse("2014-12-19");
			
			// To create 2 instance of semesters class, and assign them with specific data
			Semester semester1 = new Semester(fall, fallStart, fallEnd);
			Semester semester2 = new Semester(spring, springStart, springEnd);
			
			// To create a new arrayList, and add 2 instances of semesters to it
			ArrayList<Semester> semesterList = new ArrayList<Semester>();
			semesterList.add(semester1);
			semesterList.add(semester2);
		} catch (

		ParseException e1)

		{
			e1.printStackTrace();
		}
		
		// To create 6 unique UUID for 6 sections 
		UUID sectionUUID1 = UUID.randomUUID();
		UUID sectionUUID2 = UUID.randomUUID();
		UUID sectionUUID3 = UUID.randomUUID();
		UUID sectionUUID4 = UUID.randomUUID();
		UUID sectionUUID5 = UUID.randomUUID();
		UUID sectionUUID6 = UUID.randomUUID();
		
		// To create 6 instances of Section class, and assign it with specific data
		Section section1 = new Section(courseUUID1, fall, sectionUUID1, 202);
		Section section2 = new Section(courseUUID1, spring, sectionUUID2, 205);
		Section section3 = new Section(courseUUID2, fall, sectionUUID3, 101);
		Section section4 = new Section(courseUUID2, spring, sectionUUID4, 108);
		Section section5 = new Section(courseUUID3, fall, sectionUUID5, 309);
		Section section6 = new Section(courseUUID3, spring, sectionUUID6, 301);
		
		// To create a new arrayList, and add 6 instances of sections into it
		ArrayList<Section> sectionList = new ArrayList<Section>();
		sectionList.add(section1);
		sectionList.add(section2);
		sectionList.add(section3);
		sectionList.add(section4);
		sectionList.add(section5);
		sectionList.add(section6);
		
		Date dateOfBirth1 = null;
		Date dateOfBirth2 = null;
		Date dateOfBirth3 = null;
		Date dateOfBirth4 = null;
		Date dateOfBirth5 = null;
		Date dateOfBirth6 = null;
		Date dateOfBirth7 = null;
		Date dateOfBirth8 = null;
		Date dateOfBirth9 = null;
		Date dateOfBirth10 = null;
		
		try {
			dateOfBirth1 = dateFormat.parse("1994-11-27");
			dateOfBirth2 = dateFormat.parse("1993-09-11");
			dateOfBirth3 = dateFormat.parse("1992-04-23");
			dateOfBirth4 = dateFormat.parse("1990-12-12");
			dateOfBirth5 = dateFormat.parse("1994-01-09");
			dateOfBirth6 = dateFormat.parse("1993-05-09");
			dateOfBirth7 = dateFormat.parse("1992-08-27");
			dateOfBirth8 = dateFormat.parse("1995-05-28");
			dateOfBirth9 = dateFormat.parse("1994-06-20");
			dateOfBirth10 = dateFormat.parse("1992-03-11");
			
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		// To create 10 instances of Student class, and assign them with specific data
		Student student1 = new Student("Mingkun", "", "Chen", dateOfBirth1, eMajor.BUSINESS,
				"702 Stone Gate Blvd", "(302)-521-8799", "quinncmk@gmail.com");
		Student student2 = new Student("Mengxi", "", "Jiang", dateOfBirth2, eMajor.CHEM,
				"702 Stone Gate Blvd", "(302)-123-5599", "mengxi@gmail.com");
		Student student3 = new Student("Xin", "", "Li", dateOfBirth3, eMajor.BUSINESS,
				"702 Stone Gate Blvd", "(302)-332-4589", "xin@gmail.com");
		Student student4 = new Student("Jianbo", "", "Pei", dateOfBirth4, eMajor.COMPSI,
				"2207 Stone Gate Blvd", "(302)-569-3329", "jianbo@gmail.com");
		Student student5 = new Student("Longzhao", "", "Hong", dateOfBirth5, eMajor.NURSING,
				"3305 Stone Gate Blvd", "(302)-147-5877", "zhaozhao@gmail.com");
		Student student6 = new Student("Yufei", "", "Liu", dateOfBirth6, eMajor.CHEM,
				"300 West 20th Street", "(302)-367-3266", "yufei@gmail.com");
		Student student7 = new Student("Yilun", "", "Li", dateOfBirth7, eMajor.PHYSICS,
				"699 Stone Gate Blvd", "(302)-129-3656", "yilun@gmail.com");
		Student student8 = new Student("Yifeng", "", "Liu", dateOfBirth8, eMajor.PHYSICS,
				"7299 Stone Gate Blvd", "(302)-329-1893", "yifeng@gmail.com");
		Student student9 = new Student("Xi", "", "Zhu", dateOfBirth9, eMajor.COMPSI,
				"5667 Stone Gate Blvd", "(302)-159-8974", "xizhu@gmail.com");
		Student student10 = new Student("Jincheng", "", "Liu", dateOfBirth10, eMajor.NURSING,
				"2341 Stone Gate Blvd", "(302)-765-0235", "jincheng@gmail.com");
		
		// To create a new arrayList, and add 10 instances of students to it
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		studentList.add(student6);
		studentList.add(student7);
		studentList.add(student8);
		studentList.add(student9);
		studentList.add(student10);
		
		// To generate 60 UUID for 60 enrollmentID
		UUID enrollmentUUID1 = UUID.randomUUID();
		UUID enrollmentUUID2 = UUID.randomUUID();
		UUID enrollmentUUID3 = UUID.randomUUID();
		UUID enrollmentUUID4 = UUID.randomUUID();
		UUID enrollmentUUID5 = UUID.randomUUID();
		UUID enrollmentUUID6 = UUID.randomUUID();
		UUID enrollmentUUID7 = UUID.randomUUID();
		UUID enrollmentUUID8 = UUID.randomUUID();
		UUID enrollmentUUID9 = UUID.randomUUID();
		UUID enrollmentUUID10 = UUID.randomUUID();
		
		UUID enrollmentUUID11 = UUID.randomUUID();
		UUID enrollmentUUID12 = UUID.randomUUID();
		UUID enrollmentUUID13 = UUID.randomUUID();
		UUID enrollmentUUID14 = UUID.randomUUID();
		UUID enrollmentUUID15 = UUID.randomUUID();
		UUID enrollmentUUID16 = UUID.randomUUID();
		UUID enrollmentUUID17 = UUID.randomUUID();
		UUID enrollmentUUID18 = UUID.randomUUID();
		UUID enrollmentUUID19 = UUID.randomUUID();
		UUID enrollmentUUID20 = UUID.randomUUID();
		
		UUID enrollmentUUID21 = UUID.randomUUID();
		UUID enrollmentUUID22 = UUID.randomUUID();
		UUID enrollmentUUID23 = UUID.randomUUID();
		UUID enrollmentUUID24 = UUID.randomUUID();
		UUID enrollmentUUID25 = UUID.randomUUID();
		UUID enrollmentUUID26 = UUID.randomUUID();
		UUID enrollmentUUID27 = UUID.randomUUID();
		UUID enrollmentUUID28 = UUID.randomUUID();
		UUID enrollmentUUID29 = UUID.randomUUID();
		UUID enrollmentUUID30 = UUID.randomUUID();
		
		UUID enrollmentUUID31 = UUID.randomUUID();
		UUID enrollmentUUID32 = UUID.randomUUID();
		UUID enrollmentUUID33 = UUID.randomUUID();
		UUID enrollmentUUID34 = UUID.randomUUID();
		UUID enrollmentUUID35 = UUID.randomUUID();
		UUID enrollmentUUID36 = UUID.randomUUID();
		UUID enrollmentUUID37 = UUID.randomUUID();
		UUID enrollmentUUID38 = UUID.randomUUID();
		UUID enrollmentUUID39 = UUID.randomUUID();
		UUID enrollmentUUID40 = UUID.randomUUID();
		
		UUID enrollmentUUID41 = UUID.randomUUID();
		UUID enrollmentUUID42 = UUID.randomUUID();
		UUID enrollmentUUID43 = UUID.randomUUID();
		UUID enrollmentUUID44 = UUID.randomUUID();
		UUID enrollmentUUID45 = UUID.randomUUID();
		UUID enrollmentUUID46 = UUID.randomUUID();
		UUID enrollmentUUID47 = UUID.randomUUID();
		UUID enrollmentUUID48 = UUID.randomUUID();
		UUID enrollmentUUID49 = UUID.randomUUID();
		UUID enrollmentUUID50 = UUID.randomUUID();
		
		UUID enrollmentUUID51 = UUID.randomUUID();
		UUID enrollmentUUID52 = UUID.randomUUID();
		UUID enrollmentUUID53 = UUID.randomUUID();
		UUID enrollmentUUID54 = UUID.randomUUID();
		UUID enrollmentUUID55 = UUID.randomUUID();
		UUID enrollmentUUID56 = UUID.randomUUID();
		UUID enrollmentUUID57 = UUID.randomUUID();
		UUID enrollmentUUID58 = UUID.randomUUID();
		UUID enrollmentUUID59 = UUID.randomUUID();
		UUID enrollmentUUID60 = UUID.randomUUID();
		
		// To generate 10 unique UUID for StudentID
		UUID studentUUID1 = UUID.randomUUID();
		UUID studentUUID2 = UUID.randomUUID();
		UUID studentUUID3 = UUID.randomUUID();
		UUID studentUUID4 = UUID.randomUUID();
		UUID studentUUID5 = UUID.randomUUID();
		UUID studentUUID6 = UUID.randomUUID();
		UUID studentUUID7 = UUID.randomUUID();
		UUID studentUUID8 = UUID.randomUUID();
		UUID studentUUID9 = UUID.randomUUID();
		UUID studentUUID10 = UUID.randomUUID();
		
		// To create 60 instances of enrollment, and enroll 10 students into each sections that created
		Enrollment enrollment1 = new Enrollment(studentUUID1, sectionUUID1);
		Enrollment enrollment2 = new Enrollment(studentUUID1, sectionUUID2);
		Enrollment enrollment3 = new Enrollment(studentUUID1, sectionUUID3);
		Enrollment enrollment4 = new Enrollment(studentUUID1, sectionUUID4);
		Enrollment enrollment5 = new Enrollment(studentUUID1, sectionUUID5);
		Enrollment enrollment6 = new Enrollment(studentUUID1, sectionUUID6);
		
		Enrollment enrollment7 = new Enrollment(studentUUID2, sectionUUID1);
		Enrollment enrollment8 = new Enrollment(studentUUID2, sectionUUID2);
		Enrollment enrollment9 = new Enrollment(studentUUID2, sectionUUID3);
		Enrollment enrollment10 = new Enrollment(studentUUID2, sectionUUID4);
		Enrollment enrollment11 = new Enrollment(studentUUID2, sectionUUID5);
		Enrollment enrollment12 = new Enrollment(studentUUID2, sectionUUID6);
		
		Enrollment enrollment13 = new Enrollment(studentUUID3, sectionUUID1);
		Enrollment enrollment14 = new Enrollment(studentUUID3, sectionUUID2);
		Enrollment enrollment15 = new Enrollment(studentUUID3, sectionUUID3);
		Enrollment enrollment16 = new Enrollment(studentUUID3, sectionUUID4);
		Enrollment enrollment17 = new Enrollment(studentUUID3, sectionUUID5);
		Enrollment enrollment18 = new Enrollment(studentUUID3, sectionUUID6);
		
		Enrollment enrollment19 = new Enrollment(studentUUID4, sectionUUID1);
		Enrollment enrollment20 = new Enrollment(studentUUID4, sectionUUID2);
		Enrollment enrollment21 = new Enrollment(studentUUID4, sectionUUID3);
		Enrollment enrollment22 = new Enrollment(studentUUID4, sectionUUID4);
		Enrollment enrollment23 = new Enrollment(studentUUID4, sectionUUID5);
		Enrollment enrollment24 = new Enrollment(studentUUID4, sectionUUID6);
		
		Enrollment enrollment25 = new Enrollment(studentUUID5, sectionUUID1);
		Enrollment enrollment26 = new Enrollment(studentUUID5, sectionUUID2);
		Enrollment enrollment27 = new Enrollment(studentUUID5, sectionUUID3);
		Enrollment enrollment28 = new Enrollment(studentUUID5, sectionUUID4);
		Enrollment enrollment29 = new Enrollment(studentUUID5, sectionUUID5);
		Enrollment enrollment30 = new Enrollment(studentUUID5, sectionUUID6);
		
		Enrollment enrollment31 = new Enrollment(studentUUID6, sectionUUID1);
		Enrollment enrollment32 = new Enrollment(studentUUID6, sectionUUID2);
		Enrollment enrollment33 = new Enrollment(studentUUID6, sectionUUID3);
		Enrollment enrollment34 = new Enrollment(studentUUID6, sectionUUID4);
		Enrollment enrollment35 = new Enrollment(studentUUID6, sectionUUID5);
		Enrollment enrollment36 = new Enrollment(studentUUID6, sectionUUID6);
		
		Enrollment enrollment37 = new Enrollment(studentUUID7, sectionUUID1);		
		Enrollment enrollment38 = new Enrollment(studentUUID7, sectionUUID2);
		Enrollment enrollment39 = new Enrollment(studentUUID7, sectionUUID3);
		Enrollment enrollment40 = new Enrollment(studentUUID7, sectionUUID4);
		Enrollment enrollment41 = new Enrollment(studentUUID7, sectionUUID5);
		Enrollment enrollment42 = new Enrollment(studentUUID7, sectionUUID6);
		
		Enrollment enrollment43 = new Enrollment(studentUUID8, sectionUUID1);
		Enrollment enrollment44 = new Enrollment(studentUUID8, sectionUUID2);		
		Enrollment enrollment45 = new Enrollment(studentUUID8, sectionUUID3);
		Enrollment enrollment46 = new Enrollment(studentUUID8, sectionUUID4);
		Enrollment enrollment47 = new Enrollment(studentUUID8, sectionUUID5);
		Enrollment enrollment48 = new Enrollment(studentUUID8, sectionUUID6);
		
		Enrollment enrollment49 = new Enrollment(studentUUID9, sectionUUID1);
		Enrollment enrollment50 = new Enrollment(studentUUID9, sectionUUID2);		
		Enrollment enrollment51 = new Enrollment(studentUUID9, sectionUUID3);
		Enrollment enrollment52 = new Enrollment(studentUUID9, sectionUUID4);
		Enrollment enrollment53 = new Enrollment(studentUUID9, sectionUUID5);
		Enrollment enrollment54 = new Enrollment(studentUUID9, sectionUUID6);
		
		Enrollment enrollment55 = new Enrollment(studentUUID10, sectionUUID1);
		Enrollment enrollment56 = new Enrollment(studentUUID10, sectionUUID2);	
		Enrollment enrollment57 = new Enrollment(studentUUID10, sectionUUID3);
		Enrollment enrollment58 = new Enrollment(studentUUID10, sectionUUID4);
		Enrollment enrollment59 = new Enrollment(studentUUID10, sectionUUID5);
		Enrollment enrollment60 = new Enrollment(studentUUID10, sectionUUID6);
		
		// To set 60 EnrollmentIDs
		enrollment1.setEnrollmentID(enrollmentUUID1);
		enrollment2.setEnrollmentID(enrollmentUUID2);
		enrollment3.setEnrollmentID(enrollmentUUID3);
		enrollment4.setEnrollmentID(enrollmentUUID4);
		enrollment5.setEnrollmentID(enrollmentUUID5);
		enrollment6.setEnrollmentID(enrollmentUUID6);
		enrollment7.setEnrollmentID(enrollmentUUID7);
		enrollment8.setEnrollmentID(enrollmentUUID8);
		enrollment9.setEnrollmentID(enrollmentUUID9);
		enrollment10.setEnrollmentID(enrollmentUUID10);
		
		enrollment11.setEnrollmentID(enrollmentUUID11);
		enrollment12.setEnrollmentID(enrollmentUUID12);
		enrollment13.setEnrollmentID(enrollmentUUID13);
		enrollment14.setEnrollmentID(enrollmentUUID14);
		enrollment15.setEnrollmentID(enrollmentUUID15);
		enrollment16.setEnrollmentID(enrollmentUUID16);
		enrollment17.setEnrollmentID(enrollmentUUID17);
		enrollment18.setEnrollmentID(enrollmentUUID18);
		enrollment19.setEnrollmentID(enrollmentUUID19);
		enrollment20.setEnrollmentID(enrollmentUUID20);
		
		enrollment21.setEnrollmentID(enrollmentUUID21);
		enrollment22.setEnrollmentID(enrollmentUUID22);
		enrollment23.setEnrollmentID(enrollmentUUID23);
		enrollment24.setEnrollmentID(enrollmentUUID24);
		enrollment25.setEnrollmentID(enrollmentUUID25);
		enrollment26.setEnrollmentID(enrollmentUUID26);
		enrollment27.setEnrollmentID(enrollmentUUID27);
		enrollment28.setEnrollmentID(enrollmentUUID28);
		enrollment29.setEnrollmentID(enrollmentUUID29);
		enrollment30.setEnrollmentID(enrollmentUUID30);
		
		enrollment31.setEnrollmentID(enrollmentUUID31);
		enrollment32.setEnrollmentID(enrollmentUUID32);
		enrollment33.setEnrollmentID(enrollmentUUID33);
		enrollment34.setEnrollmentID(enrollmentUUID34);
		enrollment35.setEnrollmentID(enrollmentUUID35);
		enrollment36.setEnrollmentID(enrollmentUUID36);
		enrollment37.setEnrollmentID(enrollmentUUID37);
		enrollment38.setEnrollmentID(enrollmentUUID38);
		enrollment39.setEnrollmentID(enrollmentUUID39);
		enrollment40.setEnrollmentID(enrollmentUUID40);
		
		enrollment41.setEnrollmentID(enrollmentUUID41);
		enrollment42.setEnrollmentID(enrollmentUUID42);
		enrollment43.setEnrollmentID(enrollmentUUID43);
		enrollment44.setEnrollmentID(enrollmentUUID44);
		enrollment45.setEnrollmentID(enrollmentUUID45);
		enrollment46.setEnrollmentID(enrollmentUUID46);
		enrollment47.setEnrollmentID(enrollmentUUID47);
		enrollment48.setEnrollmentID(enrollmentUUID48);
		enrollment49.setEnrollmentID(enrollmentUUID49);
		enrollment50.setEnrollmentID(enrollmentUUID50);
		
		enrollment51.setEnrollmentID(enrollmentUUID51);
		enrollment52.setEnrollmentID(enrollmentUUID52);
		enrollment53.setEnrollmentID(enrollmentUUID53);
		enrollment54.setEnrollmentID(enrollmentUUID54);
		enrollment55.setEnrollmentID(enrollmentUUID55);
		enrollment56.setEnrollmentID(enrollmentUUID56);
		enrollment57.setEnrollmentID(enrollmentUUID57);
		enrollment58.setEnrollmentID(enrollmentUUID58);
		enrollment59.setEnrollmentID(enrollmentUUID59);
		enrollment60.setEnrollmentID(enrollmentUUID60);
		
		// To set grades for each sections of courses that 10 students take
		enrollment1.setGrade(80);
		enrollment2.setGrade(50);
		enrollment3.setGrade(89);
		enrollment4.setGrade(92);
		enrollment5.setGrade(74);
		enrollment6.setGrade(63);
		
		enrollment7.setGrade(100);
		enrollment8.setGrade(91);
		enrollment9.setGrade(82);
		enrollment10.setGrade(79);
		enrollment11.setGrade(82);
		enrollment12.setGrade(95);
		
		enrollment13.setGrade(78);
		enrollment14.setGrade(76);
		enrollment15.setGrade(84);
		enrollment16.setGrade(87);
		enrollment17.setGrade(73);
		enrollment18.setGrade(96);
		
		enrollment19.setGrade(92);
		enrollment20.setGrade(99);
		enrollment21.setGrade(82);
		enrollment22.setGrade(78);
		enrollment23.setGrade(89);
		enrollment24.setGrade(91);
		
		enrollment25.setGrade(74);
		enrollment26.setGrade(63);
		enrollment27.setGrade(100);
		enrollment28.setGrade(91);
		enrollment29.setGrade(82);
		enrollment30.setGrade(79);
		
		enrollment31.setGrade(61);
		enrollment32.setGrade(75);
		enrollment33.setGrade(80);
		enrollment34.setGrade(85);
		enrollment35.setGrade(74);
		enrollment36.setGrade(95);
		
		enrollment37.setGrade(100);
		enrollment38.setGrade(97);
		enrollment39.setGrade(81);
		enrollment40.setGrade(79);
		enrollment41.setGrade(69);
		enrollment42.setGrade(92);
		
		enrollment43.setGrade(89);
		enrollment44.setGrade(87);
		enrollment45.setGrade(91);
		enrollment46.setGrade(96);
		enrollment47.setGrade(73);
		enrollment48.setGrade(92);
		
		enrollment49.setGrade(63);
		enrollment50.setGrade(79);
		enrollment51.setGrade(85);
		enrollment52.setGrade(81);
		enrollment53.setGrade(89);
		enrollment54.setGrade(95);
		
		enrollment55.setGrade(99);
		enrollment56.setGrade(97);
		enrollment57.setGrade(93);
		enrollment58.setGrade(91);
		enrollment59.setGrade(100);
		enrollment60.setGrade(96);
		
		// To calculate the average grade for each course
		double course1Avg = (enrollment1.getGrade() + enrollment2.getGrade() + enrollment7.getGrade() +
				enrollment8.getGrade() + enrollment13.getGrade() + enrollment14.getGrade() + 
				enrollment19.getGrade() + enrollment20.getGrade() + enrollment25.getGrade() +
				enrollment26.getGrade() + enrollment31.getGrade() + enrollment32.getGrade() +
				enrollment37.getGrade() + enrollment38.getGrade() + enrollment43.getGrade() +
				enrollment44.getGrade() + enrollment49.getGrade() + enrollment50.getGrade() + 
				enrollment55.getGrade() + enrollment56.getGrade()) / 20;
		
		double course2Avg = (enrollment3.getGrade() + enrollment4.getGrade() + enrollment9.getGrade() +
				enrollment10.getGrade() + enrollment15.getGrade() + enrollment16.getGrade() + 
				enrollment21.getGrade() + enrollment22.getGrade() + enrollment27.getGrade() +
				enrollment28.getGrade() + enrollment33.getGrade() + enrollment34.getGrade() +
				enrollment39.getGrade() + enrollment40.getGrade() + enrollment45.getGrade() +
				enrollment46.getGrade() + enrollment51.getGrade() + enrollment52.getGrade() + 
				enrollment57.getGrade() + enrollment58.getGrade()) / 20;
		
		double course3Avg = (enrollment5.getGrade() + enrollment6.getGrade() + enrollment11.getGrade() +
				enrollment12.getGrade() + enrollment17.getGrade() + enrollment18.getGrade() + 
				enrollment23.getGrade() + enrollment24.getGrade() + enrollment29.getGrade() +
				enrollment30.getGrade() + enrollment35.getGrade() + enrollment36.getGrade() +
				enrollment41.getGrade() + enrollment42.getGrade() + enrollment47.getGrade() +
				enrollment48.getGrade() + enrollment53.getGrade() + enrollment54.getGrade() + 
				enrollment59.getGrade() + enrollment60.getGrade()) / 20;
		
		// Test course average
		assertEquals(course1Avg, 82.5, 0.001);
		assertEquals(course2Avg, 86.3, 0.001);
		assertEquals(course3Avg, 84.95, 0.001);
		
		// To create 10 arrayList to add each students' grades
		ArrayList<Double> student1Grade = new ArrayList<Double>();
		ArrayList<Double> student2Grade = new ArrayList<Double>();
		ArrayList<Double> student3Grade = new ArrayList<Double>();
		ArrayList<Double> student4Grade = new ArrayList<Double>();
		ArrayList<Double> student5Grade = new ArrayList<Double>();
		ArrayList<Double> student6Grade = new ArrayList<Double>();
		ArrayList<Double> student7Grade = new ArrayList<Double>();
		ArrayList<Double> student8Grade = new ArrayList<Double>();
		ArrayList<Double> student9Grade = new ArrayList<Double>();
		ArrayList<Double> student10Grade = new ArrayList<Double>();
		
		student1Grade.add(enrollment1.getGrade());
		student1Grade.add(enrollment2.getGrade());
		student1Grade.add(enrollment3.getGrade());
		student1Grade.add(enrollment4.getGrade());
		student1Grade.add(enrollment5.getGrade());
		student1Grade.add(enrollment6.getGrade());
		
		student2Grade.add(enrollment7.getGrade());
		student2Grade.add(enrollment8.getGrade());
		student2Grade.add(enrollment9.getGrade());
		student2Grade.add(enrollment10.getGrade());
		student2Grade.add(enrollment11.getGrade());
		student2Grade.add(enrollment12.getGrade());
		
		student3Grade.add(enrollment13.getGrade());
		student3Grade.add(enrollment14.getGrade());
		student3Grade.add(enrollment15.getGrade());
		student3Grade.add(enrollment16.getGrade());
		student3Grade.add(enrollment17.getGrade());
		student3Grade.add(enrollment18.getGrade());
		
		student4Grade.add(enrollment19.getGrade());
		student4Grade.add(enrollment20.getGrade());
		student4Grade.add(enrollment21.getGrade());
		student4Grade.add(enrollment22.getGrade());
		student4Grade.add(enrollment23.getGrade());
		student4Grade.add(enrollment24.getGrade());
		
		student5Grade.add(enrollment25.getGrade());
		student5Grade.add(enrollment26.getGrade());
		student5Grade.add(enrollment27.getGrade());
		student5Grade.add(enrollment28.getGrade());
		student5Grade.add(enrollment29.getGrade());
		student5Grade.add(enrollment30.getGrade());
		
		student6Grade.add(enrollment31.getGrade());
		student6Grade.add(enrollment32.getGrade());
		student6Grade.add(enrollment33.getGrade());
		student6Grade.add(enrollment34.getGrade());
		student6Grade.add(enrollment35.getGrade());
		student6Grade.add(enrollment36.getGrade());
		
		student7Grade.add(enrollment37.getGrade());
		student7Grade.add(enrollment38.getGrade());
		student7Grade.add(enrollment39.getGrade());
		student7Grade.add(enrollment40.getGrade());
		student7Grade.add(enrollment41.getGrade());
		student7Grade.add(enrollment42.getGrade());
		
		student8Grade.add(enrollment43.getGrade());
		student8Grade.add(enrollment44.getGrade());
		student8Grade.add(enrollment45.getGrade());
		student8Grade.add(enrollment46.getGrade());
		student8Grade.add(enrollment47.getGrade());
		student8Grade.add(enrollment48.getGrade());
		
		student9Grade.add(enrollment49.getGrade());
		student9Grade.add(enrollment50.getGrade());
		student9Grade.add(enrollment51.getGrade());
		student9Grade.add(enrollment52.getGrade());
		student9Grade.add(enrollment53.getGrade());
		student9Grade.add(enrollment54.getGrade());
		
		student10Grade.add(enrollment55.getGrade());
		student10Grade.add(enrollment56.getGrade());
		student10Grade.add(enrollment57.getGrade());
		student10Grade.add(enrollment58.getGrade());
		student10Grade.add(enrollment59.getGrade());
		student10Grade.add(enrollment60.getGrade());
		
		// To calculate each students' GPA
		double student1GPA = enrollment1.calculateGPA(course1.getGradePoints(), 
				course2.getGradePoints(), course3.getGradePoints(), student1Grade);
		
		double student2GPA = enrollment1.calculateGPA(course1.getGradePoints(), 
				course2.getGradePoints(), course3.getGradePoints(), student2Grade);
		
		double student3GPA = enrollment1.calculateGPA(course1.getGradePoints(), 
				course2.getGradePoints(), course3.getGradePoints(), student3Grade);
		
		double student4GPA = enrollment1.calculateGPA(course1.getGradePoints(), 
				course2.getGradePoints(), course3.getGradePoints(), student4Grade);
		
		double student5GPA = enrollment1.calculateGPA(course1.getGradePoints(), 
				course2.getGradePoints(), course3.getGradePoints(), student5Grade);
		
		double student6GPA = enrollment1.calculateGPA(course1.getGradePoints(), 
				course2.getGradePoints(), course3.getGradePoints(), student6Grade);
		
		double student7GPA = enrollment1.calculateGPA(course1.getGradePoints(), 
				course2.getGradePoints(), course3.getGradePoints(), student7Grade);
		
		double student8GPA = enrollment1.calculateGPA(course1.getGradePoints(), 
				course2.getGradePoints(), course3.getGradePoints(), student8Grade);
		
		double student9GPA = enrollment1.calculateGPA(course1.getGradePoints(), 
				course2.getGradePoints(), course3.getGradePoints(), student9Grade);
		
		double student10GPA = enrollment1.calculateGPA(course1.getGradePoints(), 
				course2.getGradePoints(), course3.getGradePoints(), student10Grade);
		
		// To test Student's GPA
		assertEquals(student1GPA, 2.12167, 0.001);
		assertEquals(student2GPA, 3.23333, 0.001);
		assertEquals(student3GPA, 2.77167, 0.001);
		assertEquals(student4GPA, 3.28833, 0.001);
		assertEquals(student5GPA, 2.61667, 0.001);
		assertEquals(student6GPA, 2.40000, 0.001);
		assertEquals(student7GPA, 3.00000, 0.001);
		assertEquals(student8GPA, 3.34333, 0.001);
		assertEquals(student9GPA, 2.72167, 0.001);
		assertEquals(student10GPA, 3.90000, 0.001);
		
		// To change one student's major
		student1.setMajor(eMajor.NURSING);
	}
}
