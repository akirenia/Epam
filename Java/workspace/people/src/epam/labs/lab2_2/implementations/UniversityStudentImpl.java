package epam.labs.lab2_2.implementations;

import epam.labs.lab2_2.abstracts.*;

public class UniversityStudentImpl  extends AbstractStudent {
	
	private static final String STUDY_TYPE = "UNIVERSITY";
	
	public UniversityStudentImpl(String firstName, String lastName,
			String recordBookNumber) {
		super(firstName, lastName, recordBookNumber);
		this.setStudyType(STUDY_TYPE);	
	}
	
	public UniversityStudentImpl(AbstractHuman human,
			String recordBookNumber) {
		super(human, recordBookNumber);
		this.setStudyType(STUDY_TYPE);	
	}
}
