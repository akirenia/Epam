package epam.labs.lab2_2.abstracts;

import epam.labs.lab2_2.interfaces.IChild;

/**
 * @author Anna_Kirenia
 *
 */
public abstract class AbstractChild extends AbstractHuman implements IChild {
		
	private String childType = "";
	
	public AbstractChild(String firstName, String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}
	
	@Override
	public String getChildType() {
		return childType;
	}
	
	@Override
	public void setChildType(String childType) {
		this.childType  = childType;
	}
	
}
