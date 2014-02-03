package epam.labs.lab2_2.implementations;

import epam.labs.lab2_2.abstracts.AbstractSchool;

public class ElementarySchoolImpl extends AbstractSchool{
	private static final String SCHOOL_TYPE = "ELEMENTARY";
		
		public ElementarySchoolImpl(String schoolName) {
			super(schoolName);
			this.setSchoolType(SCHOOL_TYPE);	
		}
}