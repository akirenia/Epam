/**
 * 
 */
package epam.lab.human.interfaces;

import epam.lab.human.enums.EducationType;

/**
 * @author Tomat
 * 
 */
public interface IEducation {

	public EducationType getEducationType();

	public void setEducationType(EducationType educationType);

	public boolean isCurrent();

	public void changeIsCurrent(boolean isCurrent);

	public String toString();
}
