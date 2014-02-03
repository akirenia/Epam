package epam.labs.lab2_2;

import java.util.ArrayList;

import epam.labs.lab2_2.abstracts.*;
import epam.labs.lab2_2.implementations.*;

public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AbstractStudent universityStudent = new UniversityStudentImpl("James",
				"Bond", "007");
		AbstractStudent technicalStudent = new TechnicalSchoolStudentImpl(
				"Agent", "J", "008");

		ArrayList<AbstractStudent> studentsList = new ArrayList<AbstractStudent>();
		studentsList.add(universityStudent);
		studentsList.add(technicalStudent);

		for (AbstractStudent student : studentsList) {
			System.out.println(student.getFirstName() + " | "
					+ student.getLastName() + " | "
					+ student.getRecordBookNumber() + " | "
					+ student.getStudyType());
		}

		AbstractSchool elementarySchool = new ElementarySchoolImpl(
				"Elementary Source Park School");
		elementarySchool.setSchoolNumber(666);

		SchoolChildImpl schoolChild = new SchoolChildImpl("Eric", "Cartman");
		schoolChild.setSchool(elementarySchool);

		ChildGardenChildImpl childGardenChild = new ChildGardenChildImpl("Ike",
				"Broflovski");
		childGardenChild.setChildGardenName("Source Park Child Garden");

		ArrayList<AbstractChild> childList = new ArrayList<AbstractChild>();
		childList.add(schoolChild);
		childList.add(childGardenChild);

		for (AbstractChild child : childList) {
			System.out.println(child.getFirstName() + " | "
					+ child.getLastName() + " | " + child.getChildType());
		}

		AbstractSchool elementarySchoolOfChild = schoolChild.getSchool();

		ArrayList<AbstractSchool> schoolsList = new ArrayList<AbstractSchool>();
		schoolsList.add(elementarySchool);
		schoolsList.add(elementarySchoolOfChild);

		for (AbstractSchool school : schoolsList) {
			System.out.println(school.getSchoolName()
					+ " | " + school.getSchoolNumber()
					+ " | " + school.getSchoolType());
		}
	}

}
