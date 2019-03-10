package objects;
/**
 * 
 * @author Pierce de Jong
 * 
 * Student class extends user class 
 * contains student constructor to make a new student
 * and return method for returning faculty of student
 *
 */
public class Student extends User{
	
	/**
	 * Instance Variable
	 */
	private String faculty;
	private double gpa;
	private int yearOfStudy;
	private String typeOfStudy;
	private String department;
	
	
	/**
	 * Student constructor with the following params  
	 * @param ucid
	 * @param email
	 * @param password
	 * @param name
	 * @param faculty
	 * @param gpa
	 * @param yearOfStudy
	 * @param typeOfStudy
	 * @param department
	 */
	public Student(int ucid, String email, String password, String name, String faculty,
			double gpa, int yearOfStudy, String typeOfStudy, String department) {
		super(ucid, email, password, name);
		this.faculty = faculty;
		this.gpa = gpa;
		this.yearOfStudy = yearOfStudy;
		this.typeOfStudy= typeOfStudy;
		this.department= department;
	}
	
	/**
	 * toFile method
	 * @return String containing attributes for student with
	 * colon separators
	 */
	public String toFile() {
		return getUCID()+":"+getEmail()+":"+getPassword()+":"+getName();
	}
	
	/**
	 * Getter method for faculty
	 * @return String containing the faculty of the student
	 */
	public String getFaculty() {
		return faculty;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
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
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
