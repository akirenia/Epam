package epam.labs.lab2_2.implementations;

import epam.labs.lab2_2.abstracts.AbstractSchool;

public class MiddleSchoolImpl extends AbstractSchool{

private static final String SCHOOL_TYPE = "Middle";
	
	public MiddleSchoolImpl(String schoolName) {
		super(schoolName);
		this.setSchoolType(SCHOOL_TYPE);	
	}

}
