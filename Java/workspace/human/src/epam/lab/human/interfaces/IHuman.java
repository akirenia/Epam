/**
 * 
 */
package epam.lab.human.interfaces;

import epam.lab.human.enums.Sex;

/**
 * @author Tomat
 * 
 */
public interface IHuman {

	public String getFirstName();

	public String getLastName();

	public Sex getSex();

	// public ArrayList<IEducation> getEducationList();
	// public ArrayList<IJob> getJobList();

	public void setFirstName(String firstName);

	public void setLastName(String firstName);

	public void setSex(Sex firstName);

	public void setEducationList();
	// public void setJobList(ArrayList<IJob> jobList);

	// public void addEducation(IEducation education);
	// public void removeEducation(IEducation education);
	// public ArrayList<IEducation> getCurrentEducation();
	// public void addJob(IJob job);
	// public void removeJob(IJob job);
	// public IJob getCurrentJob();
}
