/**
 * 
 */
package epam.lab.human.implementations;

import java.util.ArrayList;
import epam.lab.human.interfaces.IEducation;

/**
 * @author Tomat
 * 
 */
public class EducationList {

	private ArrayList<IEducation> educationList = null;

	public ArrayList<IEducation> get() {
		return educationList;
	}

	public void set(ArrayList<IEducation> educationList) {
		this.educationList = educationList;
	}

	public void add(IEducation education) {
		if (education != null)
			educationList.add(education);
	}

	public void remove(IEducation education) {
		if (education != null)
			educationList.remove(education);
	}

	public EducationList getCurrentList() {
		EducationList currentEducationList = new EducationList();
		for (IEducation education : educationList) {
			if (education.isCurrent())
				currentEducationList.add(education);
		}
		return currentEducationList;
	}

	public void setCurrent(IEducation currentEducation) {
		if (currentEducation != null) {
			setCurrent(educationList.indexOf(currentEducation));
		}
	}
	
	public void setCurrent(int educationIndex) {
		if (educationIndex > -1) {
			educationList.get(educationIndex).changeIsCurrent(true);
		}
	}
}
