package epam.labs.lab2_2.implementations;

import epam.labs.lab2_2.abstracts.AbstractSchool;

public class HighSchoolImpl extends AbstractSchool{
	
	private static final String SCHOOL_TYPE = "HIGH";
	
	public HighSchoolImpl(String schoolName) {
		super(schoolName);
		this.setSchoolType(SCHOOL_TYPE);	
	}

}
