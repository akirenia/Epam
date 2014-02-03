package epam.labs.lab2_2.abstracts;

import epam.labs.lab2_2.interfaces.IStudent;

public abstract class AbstractStudent extends AbstractHuman implements IStudent {

	private String recordBookNumber = "";
	private String studyType = "";
	
	public AbstractStudent(String firstName, String lastName, String recordBookNumber){
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setRecordBookNumber(recordBookNumber);	
	}
	
	public AbstractStudent(AbstractHuman human, String recordBookNumber){
		this.setFirstName(human.getFirstName());
		this.setLastName(human.getLastName());
		this.setRecordBookNumber(recordBookNumber);	
		this.setStudyType("TECHNICAL SCHOOL");
	}
	
	@Override
	public String getRecordBookNumber() {
		return recordBookNumber;
	}
	
	@Override
	public void setRecordBookNumber(String recordBookNumber) {
		this.recordBookNumber = recordBookNumber;
	}
	
	@Override
	public String getStudyType() {
		return studyType;
	}
	
	@Override
	public void setStudyType(String studyType) {
		this.studyType = studyType;
	}
}
