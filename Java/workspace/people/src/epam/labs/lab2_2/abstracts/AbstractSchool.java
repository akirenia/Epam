package epam.labs.lab2_2.abstracts;

import epam.labs.lab2_2.interfaces.ISchool;

/**
 * @author Anna_Kirenia
 *
 */
public abstract class AbstractSchool implements ISchool {
	private int schoolNumber = -1;
	private String schoolName = "";
	private String schoolType = "";
	
	public AbstractSchool(String schoolName) {
		this.setSchoolName(schoolName);
	}
	
	@Override
	public int getSchoolNumber(){
		return schoolNumber;
	}
	
	@Override
	public void setSchoolNumber(int schoolNumber){
		this.schoolNumber = schoolNumber;
	}
	
	@Override
	public String getSchoolName(){
		return schoolName;
	}
	
	@Override
	public void setSchoolName(String schoolName){
		this.schoolName = schoolName;
	}
	
	@Override
	public String getSchoolType(){
		return schoolType;
	}
	
	@Override
	public void setSchoolType(String schoolType){
		this.schoolType = schoolType;
	}
	
	
}
