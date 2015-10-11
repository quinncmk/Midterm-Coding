package com.cisc181.core;

import java.util.ArrayList;
import java.util.UUID;

import org.hibernate.type.PrimitiveByteArrayBlobType;

public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	private double studentCourseGrade1;
	private double studentCourseGrade2;
	private double studentCourseGrade3;
	private double studentCourseGrade4;
	private double studentCourseGrade5;
	private double studentCourseGrade6;
	
	private Enrollment() {
	}	
	
	public Enrollment(UUID StudentID, UUID SectionID) {
		this.StudentID = StudentID;
		this.SectionID = SectionID;
		this.EnrollmentID = null;
	}
	
	// To get grade of each student
	public double getGrade() {
		return Grade;
	}
	
	// To set grade for each student
	public void setGrade(double grade) {
		Grade = grade;
	}
	
	// To set enrollmentID
	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}
	
	// To calculate for a specific student
	public double calculateGPA(int coursePoint1, int coursePoint2, int coursePoint3, 
			ArrayList<Double> studentGrade) {
		if(studentGrade.get(0) >= 95 && studentGrade.get(0) <= 100){
			this.studentCourseGrade1 = coursePoint1 * 4;			
		}			
		else if(studentGrade.get(0) >= 90 && studentGrade.get(0) < 95){
			this.studentCourseGrade1 = coursePoint1 * 3.7;
		}
		else if(studentGrade.get(0) >= 87 && studentGrade.get(0) < 90){
			this.studentCourseGrade1 = coursePoint1 * 3.33;
		}
		else if(studentGrade.get(0) >= 83 && studentGrade.get(0) < 87){
			this.studentCourseGrade1 = coursePoint1 * 3.0;
		}
		else if(studentGrade.get(0) >= 80 && studentGrade.get(0) < 83){
			this.studentCourseGrade1 = coursePoint1 * 2.7;
		}
		else if(studentGrade.get(0) >= 77 && studentGrade.get(0) < 80){
			this.studentCourseGrade1 = coursePoint1 * 2.3;
		}
		else if(studentGrade.get(0) >= 73 && studentGrade.get(0) < 77){
			this.studentCourseGrade1 = coursePoint1 * 2.0;
		}
		else if(studentGrade.get(0) >= 70 && studentGrade.get(0) < 73){
			this.studentCourseGrade1 = coursePoint1 * 1.7;
		}
		else if(studentGrade.get(0) >= 67 && studentGrade.get(0) < 70){
			this.studentCourseGrade1 = coursePoint1 * 1.3;
		}
		else if(studentGrade.get(0) >= 63 && studentGrade.get(0) < 67){
			this.studentCourseGrade1 = coursePoint1 * 1.0;
		}
		else if(studentGrade.get(0) >= 60 && studentGrade.get(0) < 63){
			this.studentCourseGrade1 = coursePoint1 * 0.7;
		}
		else if(studentGrade.get(0) >= 0 && studentGrade.get(0) < 60){
			this.studentCourseGrade1 = coursePoint1 * 0;
		}
		
		if(studentGrade.get(1) >= 95 && studentGrade.get(1) <= 100){
			this.studentCourseGrade2 = coursePoint1 * 4;			
		}			
		else if(studentGrade.get(1) >= 90 && studentGrade.get(1) < 95){
			this.studentCourseGrade2 = coursePoint1 * 3.7;
		}
		else if(studentGrade.get(1) >= 87 && studentGrade.get(1) < 90){
			this.studentCourseGrade2 = coursePoint1 * 3.33;
		}
		else if(studentGrade.get(1) >= 83 && studentGrade.get(1) < 87){
			this.studentCourseGrade2 = coursePoint1 * 3.0;
		}
		else if(studentGrade.get(1) >= 80 && studentGrade.get(1) < 83){
			this.studentCourseGrade2 = coursePoint1 * 2.7;
		}
		else if(studentGrade.get(1) >= 77 && studentGrade.get(1) < 80){
			this.studentCourseGrade2 = coursePoint1 * 2.3;
		}
		else if(studentGrade.get(1) >= 73 && studentGrade.get(1) < 77){
			this.studentCourseGrade2 = coursePoint1 * 2.0;
		}
		else if(studentGrade.get(1) >= 70 && studentGrade.get(1) < 73){
			this.studentCourseGrade2 = coursePoint1 * 1.7;
		}
		else if(studentGrade.get(1) >= 67 && studentGrade.get(1) < 70){
			this.studentCourseGrade2 = coursePoint1 * 1.3;
		}
		else if(studentGrade.get(1) >= 63 && studentGrade.get(1) < 67){
			this.studentCourseGrade2 = coursePoint1 * 1.0;
		}
		else if(studentGrade.get(1) >= 60 && studentGrade.get(1) < 63){
			this.studentCourseGrade2 = coursePoint1 * 0.7;
		}
		else if(studentGrade.get(1) >= 0 && studentGrade.get(1) < 60){
			this.studentCourseGrade2 = coursePoint1 * 0;
		}
		
		if(studentGrade.get(2) >= 95 && studentGrade.get(2) <= 100){
			this.studentCourseGrade3 = coursePoint2 * 4;			
		}			
		else if(studentGrade.get(2) >= 90 && studentGrade.get(2) < 95){
			this.studentCourseGrade3 = coursePoint2 * 3.7;
		}
		else if(studentGrade.get(2) >= 87 && studentGrade.get(2) < 90){
			this.studentCourseGrade3 = coursePoint2 * 3.33;
		}
		else if(studentGrade.get(2) >= 83 && studentGrade.get(2) < 87){
			this.studentCourseGrade3 = coursePoint2 * 3.0;
		}
		else if(studentGrade.get(2) >= 80 && studentGrade.get(2) < 83){
			this.studentCourseGrade3 = coursePoint2 * 2.7;
		}
		else if(studentGrade.get(2) >= 77 && studentGrade.get(2) < 80){
			this.studentCourseGrade3 = coursePoint2 * 2.3;
		}
		else if(studentGrade.get(2) >= 73 && studentGrade.get(2) < 77){
			this.studentCourseGrade3 = coursePoint2 * 2.0;
		}
		else if(studentGrade.get(2) >= 70 && studentGrade.get(2) < 73){
			this.studentCourseGrade3 = coursePoint2 * 1.7;
		}
		else if(studentGrade.get(2) >= 67 && studentGrade.get(2) < 70){
			this.studentCourseGrade3 = coursePoint2 * 1.3;
		}
		else if(studentGrade.get(2) >= 63 && studentGrade.get(2) < 67){
			this.studentCourseGrade3 = coursePoint2 * 1.0;
		}
		else if(studentGrade.get(2) >= 60 && studentGrade.get(2) < 63){
			this.studentCourseGrade3 = coursePoint2 * 0.7;
		}
		else if(studentGrade.get(2) >= 0 && studentGrade.get(2) < 60){
			this.studentCourseGrade3 = coursePoint2 * 0;
		}
		
		if(studentGrade.get(3) >= 95 && studentGrade.get(3) <= 100){
			this.studentCourseGrade4 = coursePoint2 * 4;			
		}			
		else if(studentGrade.get(3) >= 90 && studentGrade.get(3) < 95){
			this.studentCourseGrade4 = coursePoint2 * 3.7;
		}
		else if(studentGrade.get(3) >= 87 && studentGrade.get(3) < 90){
			this.studentCourseGrade4 = coursePoint2 * 3.33;
		}
		else if(studentGrade.get(3) >= 83 && studentGrade.get(3) < 87){
			this.studentCourseGrade4 = coursePoint2 * 3.0;
		}
		else if(studentGrade.get(3) >= 80 && studentGrade.get(3) < 83){
			this.studentCourseGrade4 = coursePoint2 * 2.7;
		}
		else if(studentGrade.get(3) >= 77 && studentGrade.get(3) < 80){
			this.studentCourseGrade4 = coursePoint2 * 2.3;
		}
		else if(studentGrade.get(3) >= 73 && studentGrade.get(3) < 77){
			this.studentCourseGrade4 = coursePoint2 * 2.0;
		}
		else if(studentGrade.get(3) >= 70 && studentGrade.get(3) < 73){
			this.studentCourseGrade4 = coursePoint2 * 1.7;
		}
		else if(studentGrade.get(3) >= 67 && studentGrade.get(3) < 70){
			this.studentCourseGrade4 = coursePoint2 * 1.3;
		}
		else if(studentGrade.get(3) >= 63 && studentGrade.get(3) < 67){
			this.studentCourseGrade4 = coursePoint2 * 1.0;
		}
		else if(studentGrade.get(3) >= 60 && studentGrade.get(3) < 63){
			this.studentCourseGrade4 = coursePoint2 * 0.7;
		}
		else if(studentGrade.get(3) >= 0 && studentGrade.get(3) < 60){
			this.studentCourseGrade4 = coursePoint2 * 0;
		}
		
		if(studentGrade.get(4) >= 95 && studentGrade.get(4) <= 100){
			this.studentCourseGrade5 = coursePoint3 * 4;			
		}			
		else if(studentGrade.get(4) >= 90 && studentGrade.get(4) < 95){
			this.studentCourseGrade5 = coursePoint3 * 3.7;
		}
		else if(studentGrade.get(4) >= 87 && studentGrade.get(4) < 90){
			this.studentCourseGrade5 = coursePoint3 * 3.33;
		}
		else if(studentGrade.get(4) >= 83 && studentGrade.get(4) < 87){
			this.studentCourseGrade5 = coursePoint3 * 3.0;
		}
		else if(studentGrade.get(4) >= 80 && studentGrade.get(4) < 83){
			this.studentCourseGrade5 = coursePoint3 * 2.7;
		}
		else if(studentGrade.get(4) >= 77 && studentGrade.get(4) < 80){
			this.studentCourseGrade5 = coursePoint3 * 2.3;
		}
		else if(studentGrade.get(4) >= 73 && studentGrade.get(4) < 77){
			this.studentCourseGrade5 = coursePoint3 * 2.0;
		}
		else if(studentGrade.get(4) >= 70 && studentGrade.get(4) < 73){
			this.studentCourseGrade5 = coursePoint3 * 1.7;
		}
		else if(studentGrade.get(4) >= 67 && studentGrade.get(4) < 70){
			this.studentCourseGrade5 = coursePoint3 * 1.3;
		}
		else if(studentGrade.get(4) >= 63 && studentGrade.get(4) < 67){
			this.studentCourseGrade5 = coursePoint3 * 1.0;
		}
		else if(studentGrade.get(4) >= 60 && studentGrade.get(4) < 63){
			this.studentCourseGrade5 = coursePoint3 * 0.7;
		}
		else if(studentGrade.get(4) >= 0 && studentGrade.get(4) < 60){
			this.studentCourseGrade5 = coursePoint3 * 0;
		}
		
		if(studentGrade.get(5) >= 95 && studentGrade.get(5) <= 100){
			this.studentCourseGrade6 = coursePoint3 * 4;			
		}			
		else if(studentGrade.get(5) >= 90 && studentGrade.get(5) < 95){
			this.studentCourseGrade6 = coursePoint3 * 3.7;
		}
		else if(studentGrade.get(5) >= 87 && studentGrade.get(5) < 90){
			this.studentCourseGrade6 = coursePoint3 * 3.33;
		}
		else if(studentGrade.get(5) >= 83 && studentGrade.get(5) < 87){
			this.studentCourseGrade6 = coursePoint3 * 3.0;
		}
		else if(studentGrade.get(5) >= 80 && studentGrade.get(5) < 83){
			this.studentCourseGrade6 = coursePoint3 * 2.7;
		}
		else if(studentGrade.get(5) >= 77 && studentGrade.get(5) < 80){
			this.studentCourseGrade6 = coursePoint3 * 2.3;
		}
		else if(studentGrade.get(5) >= 73 && studentGrade.get(5) < 77){
			this.studentCourseGrade6 = coursePoint3 * 2.0;
		}
		else if(studentGrade.get(5) >= 70 && studentGrade.get(5) < 73){
			this.studentCourseGrade6 = coursePoint3 * 1.7;
		}
		else if(studentGrade.get(5) >= 67 && studentGrade.get(5) < 70){
			this.studentCourseGrade6 = coursePoint3 * 1.3;
		}
		else if(studentGrade.get(5) >= 63 && studentGrade.get(5) < 67){
			this.studentCourseGrade6 = coursePoint3 * 1.0;
		}
		else if(studentGrade.get(5) >= 60 && studentGrade.get(5) < 63){
			this.studentCourseGrade6 = coursePoint3 * 0.7;
		}
		else if(studentGrade.get(5) >= 0 && studentGrade.get(5) < 60){
			this.studentCourseGrade6 = coursePoint3 * 0;
		}
		
		// The total points that student gets 
		double totalTaken = coursePoint1 * 2 + coursePoint2 * 2 + coursePoint3 * 2;
		
		// The total points of courses that student takes
		double totalPoints= (this.studentCourseGrade1 + this.studentCourseGrade2 + this.studentCourseGrade3 +
				this.studentCourseGrade4 + this.studentCourseGrade5 + this.studentCourseGrade6);
		
		// To get the GPA
		double GPA = totalPoints / totalTaken;
		
		return GPA;
	}
}
