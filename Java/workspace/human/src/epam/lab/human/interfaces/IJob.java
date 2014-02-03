/**
 * 
 */
package epam.lab.human.interfaces;

import java.util.Date;

/**
 * @author Tomat
 * 
 */
public interface IJob {

	public String getWorkPlace();

	public void setWorkPlace(String workPlaceName);

	public String getSpecialty();

	public void setSpecialty(String specialty);

	public Date getStartDate();

	public void setStartDate(Date startDate);

	public Date getDismissalDate();

	public void setDismissalDate(Date finishDate);

	public String getReasonOfDismissal();

	public void setReasonOfDismissal(String dismissalReason);

	public short getRank();

	public void setRank(short rank);

	public String getAdditionalInfo();

	public void setAdditionalInfo(String info);

	public String getWhoFired();

	public void setWhoFired(String name);

	public String getWhoRecruited();

	public void setWhoRecruited(String name);

	public boolean isCurrentJob();

	public void addToCurrentJob();

	public String removeFromCurrentJob();

}
