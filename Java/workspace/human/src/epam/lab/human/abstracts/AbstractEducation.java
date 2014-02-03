/**
 * 
 */
package epam.lab.human.abstracts;

import epam.lab.human.interfaces.EducationType;
import epam.lab.human.interfaces.IEducation;

/**
 * @author Tomat
 * 
 */
public abstract class AbstractEducation implements IEducation {

	public boolean isCurrent = false;
	public EducationType educationType = EducationType.UNIVERSITY;

	@Override
	public EducationType getEducationType() {
		return educationType;
	}

	@Override
	public void setEducationType(EducationType educationType) {
		this.educationType = educationType;
	}

	@Override
	public boolean isCurrent() {
		return isCurrent;
	}

	@Override
	public void changeIsCurrent(boolean isCurrent) {
		this.isCurrent = isCurrent;
	}

}
