package epam.labs.lab2_2.abstracts;

import epam.labs.lab2_2.interfaces.IHuman;

public abstract class AbstractHuman implements IHuman {
	private String firstName = "";
	private String lastName = "";
	private String sex = "";
	
	@Override
	public String getFirstName(){
		Thread.currentThread().getStackTrace();
		return firstName;
	}
	
	@Override
	public String getLastName(){
		return lastName;		
	}
	
	@Override
	public String getSex(){
		return sex;		
	}	
	
	@Override
	public void setFirstName(String firstName){
		this.firstName = firstName;		
	}
	
	@Override
	public void setLastName(String lastName){
		this.lastName = lastName;		
	}
	
	@Override
	public void setSex(String sex){
		this.sex = sex;		
	}
	
}
