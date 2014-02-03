package epam.labs.lab2_2.interfaces;

import epam.labs.lab2_2.abstracts.AbstractSchool;

public interface ISchoolChild extends IChild{
	public AbstractSchool getSchool();
	public void setSchool(AbstractSchool school);
}
