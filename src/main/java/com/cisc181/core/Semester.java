package com.cisc181.core;

import java.sql.Time;
import java.util.Date;
import java.util.UUID;

import org.hibernate.id.UUIDGenerator;

public class Semester {
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	public Semester(UUID sID, Date sDate, Date eDate){
		 
		 this.StartDate = sDate;
		 this.EndDate = eDate;
		 this.SemesterID = sID;		 
	}
}
