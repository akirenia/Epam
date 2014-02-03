package epam.labs.lab2_2.implementations;

import epam.labs.lab2_2.abstracts.AbstractChild;
import epam.labs.lab2_2.abstracts.AbstractSchool;
import epam.labs.lab2_2.interfaces.ISchoolChild;

public class SchoolChildImpl extends AbstractChild implements ISchoolChild{

	private static final String CHILD_TYPE = "SCHOOL";
	AbstractSchool abstractSchool = null;
	
	public SchoolChildImpl(String firstName, String lastName) {
		super(firstName, lastName);
		this.setChildType(CHILD_TYPE);
	}	
	
	@Override
	public AbstractSchool getSchool() {
		return abstractSchool;
	}

	@Override
	public void setSchool(AbstractSchool school) {
		this.abstractSchool = school;
		
	}


}
