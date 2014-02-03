/**
 * 
 */
package epam.lab.human.implementations;

import java.util.ArrayList;

import epam.lab.human.interfaces.IEducation;
import epam.lab.human.interfaces.IHuman;
import epam.lab.human.interfaces.IJob;
import epam.lab.human.interfaces.Sex;

/**
 * @author Tomat
 *
 */
public class Human implements IHuman {
	
	private String firstName = "";
	private String lastName = "";
	private Sex sex = Sex.MALE;
	private EducationList educationList = null;
	//private ArrayList<IJob> jobList = null;
		
	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;		
	}

	@Override
	public String getLastName() {
		return lastName;
	}
	
	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
		
	}

	@Override
	public Sex getSex() {
		return sex;
	}	

	@Override
	public void setSex(Sex sex) {
		this.sex = sex;
		
	}

	public EducationList getEducationList() {
		return educationList;
	}
	
	public void setEducationList(EducationList educationList) {
		this.educationList = educationList;		
	}
	
	/*
	public void setJobList(ArrayList<IJob> jobList) {
		this.jobList = jobList;		
	}
	
	public void addJob(IJob job) {
		// TODO Auto-generated method stub		
	}

	
	public void removeJob(IJob job) {
		// TODO Auto-generated method stub		
	}

	
	public IJob getCurrentJob() {
		// TODO Auto-generated method stub
		return null;
	}*/

	
	

}
