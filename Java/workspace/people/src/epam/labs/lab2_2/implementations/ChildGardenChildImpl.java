package epam.labs.lab2_2.implementations;

import epam.labs.lab2_2.abstracts.AbstractChild;
import epam.labs.lab2_2.interfaces.IChildGardenChild;


public class ChildGardenChildImpl extends AbstractChild implements IChildGardenChild{

	private static final String CHILD_TYPE = "CHILD GARDEN";
	String childGardenName = "";
	String childGardenAddress = "";
	
	public ChildGardenChildImpl(String firstName, String lastName) {
		super(firstName, lastName);
		this.setChildType(CHILD_TYPE);
	}

	@Override
	public String getChildGardenName() {
		return childGardenName;
	}

	@Override
	public void setChildGardenName(String childGardenName) {
		this.childGardenName = childGardenName;
		
	}

	@Override
	public String getChildGardenAddress() {
		return childGardenAddress;
	}

	@Override
	public void setChildGardenAddress(String childGardenAddress) {
		this.childGardenAddress = childGardenAddress;
		
	}
}
