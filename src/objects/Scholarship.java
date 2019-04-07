package objects;

import java.util.ArrayList;
import java.util.List;

/**
 * Scholarship class contains all attributes for scholarship
 * 
 * @author Steve Khanna
 *
 *
 */
public class Scholarship {

	/**
	 * Instance Variables
	 */
	private String name;
	private int scholarshipId;
	private double gpaRequirement;
	private String faculty;
	private int yearOfStudy;
	private String typeOfStudy;
	private String Department;
	private int numAllowed;
	private String description;
	private double money;
	
	private List<Integer> studentsApplied;
	private List<Integer> studentsAccepted;

	/**
	 * Default scholarship constructor
	 */
	public Scholarship() {
		this.name = "Sch1";
		this.scholarshipId = 1;
		this.gpaRequirement = 3.00;
		this.faculty = "Science";
		this.yearOfStudy = 3;
		this.typeOfStudy = "Bachelor";
		this.Department = "CPSC";
		this.numAllowed = 100;
		this.description = "This is a generic scholarship";
		this.setMoney(0.00);

	}
	
	/**
	 * Overloaded scholarship controller
	 * @param name 
	 * @param sId
	 * @param gReq
	 * @param faculty
	 * @param YOS
	 * @param TOS
	 * @param Dept
	 * @param nums
	 * @param desc
	 * @param money
	 * This is used when a new scholarship is created
	 */
	public Scholarship(String name, String sId, String gReq, String faculty, String YOS, String TOS, String Dept,
			String nums, String desc, String money,List<Integer> studentsApplied, List<Integer> studentsAccepted) {
		this.name = name;
		this.scholarshipId = Integer.parseInt(sId);
		this.gpaRequirement = Double.parseDouble(gReq);
		this.faculty = faculty;
		this.yearOfStudy = Integer.parseInt(YOS);
		this.typeOfStudy = TOS;
		this.Department = Dept;
		this.numAllowed = Integer.parseInt(nums);
		this.description = desc;
		this.money = Double.parseDouble(money);
		this.studentsApplied= studentsApplied;
		this.studentsAccepted = studentsAccepted;

	}
	
	/**
	 * returnFull method
	 * @returns String of all scholarship attributes with colons separating them
	 */

	public String returnFull() {
		return (name + ":" + scholarshipId + ":" + gpaRequirement + ":" + faculty + ":" + yearOfStudy + ":"
				+ typeOfStudy + ":" + Department + ":" + numAllowed + ":" + description + ":" +money);
	}
	/**
	 * 
	 * The rest of the code contains getters and setters for each attribute
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return scholarshipId;
	}

	public void setId(int scholarshipId) {
		this.scholarshipId = scholarshipId;
	}

	public double getGpaRequirement() {
		return gpaRequirement;
	}

	public void setGpaRequirement(double gpaRequirement) {
		this.gpaRequirement = gpaRequirement;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public int getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}

	public String getTypeOfStudy() {
		return typeOfStudy;
	}

	public void setTypeOfStudy(String typeOfStudy) {
		this.typeOfStudy = typeOfStudy;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public int getNumAllowed() {
		return numAllowed;
	}

	public void setNumAllowed(int numAllowed) {
		this.numAllowed = numAllowed;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	/**
	 * Add student to the scholarship
	 * @param id of the student
	 * @return boolean: if add was successful or not
	 */
	public boolean addStudentToApplied(int id) {
		if (studentsApplied.contains(id)) {
			return false;
		}
		else {
			studentsApplied.add(id);
			return true;
		}
	}
	/**
	 * Remove student from scholarship
	 * @param ucid of the student 
	 * @return boolean: if remove was successful
	 */
	public boolean removeStudentFromApplied(int ucid) {
		return (studentsApplied.remove((Integer)ucid));
	}
	
	/**
	 * Add student to the scholarship
	 * @param id of the student
	 * @return boolean: if add was successful or not
	 */
	public boolean addStudentToAccepted(int id) {
		if (studentsAccepted.contains(id)) {
			return false;
		}
		else {
			studentsAccepted.add(id);
			return true;
		}
	}
	/**
	 * Remove student from scholarship
	 * @param ucid of the student 
	 * @return boolean: if remove was successful
	 */
	public boolean removeStudentFromAccepted(int ucid) {
		return (studentsAccepted.remove((Integer)ucid));
	}
	
	/**
	 * List of students that have applied for this scholarship
	 * @return List of student ucids
	 */
	public List<Integer> getStudentsApplied() {
		return studentsApplied;
	}
	
	public List<Integer> getStudentsAccepted() {
		return studentsAccepted;
	}
	
	/**
	 * toString method for writing the scholarships properly to the file
	 */
	@Override
	public String toString() {
		
		String appliedStudents = "";
		if(studentsApplied.isEmpty()) {
			appliedStudents = "noneApplied";
		}else {
			for(Integer i : studentsApplied) {
				appliedStudents+=i+":";
				
			}
			appliedStudents = appliedStudents.substring(0, appliedStudents.length()-1);
		}
		
		String acceptedStudents = "";
		if(studentsAccepted.isEmpty()) {
			acceptedStudents = "noneAccepted";
		}else {
			for(Integer i : studentsAccepted) {
				acceptedStudents+=i+":";
				
			}
			acceptedStudents = acceptedStudents.substring(0, acceptedStudents.length()-1);
		}
		
		
		String returnString = name + "," + scholarshipId + "," + gpaRequirement + "," + faculty + "," + yearOfStudy + ","
				+ typeOfStudy + "," + Department + "," + numAllowed + "," + description + "," + money +","+appliedStudents+","+acceptedStudents;
		
		return (returnString);
	}

}
