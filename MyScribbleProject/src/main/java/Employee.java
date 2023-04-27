
public class Employee {

	String firstName;
	String lastName;
	int age;
	String gender;
	int salary;
	int skillLevel;
	String department;
	
	
	public Employee(String firstName, String lastName, int age, String gender, int salary, int skillLevel, String department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.skillLevel = skillLevel;
		this.department = department;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSkillLevel() {
		return skillLevel;
	}
	public void setSkillLevel(int skillLevel) {
		this.skillLevel = skillLevel;
	}
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender=gender;
	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department=department;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gender=" + gender
				+ ", salary=" + salary + ", skillLevel=" + skillLevel + ", department=" + department + "]";
	}
	
}
