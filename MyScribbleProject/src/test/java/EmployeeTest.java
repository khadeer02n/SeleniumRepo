import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		List<Employee> khadz = new ArrayList<Employee>();
		List<Integer> salaries = new ArrayList<Integer>();
		Employee e1 = new Employee("Khadeer","Ahmed",31,"Male",4000,7,"CS");
		Employee e2 = new Employee("Sara","Ahmed",38,"Female",5000,8,"IT");
		Employee e3 = new Employee("Hanna","Ahmed",32,"Female",6000,9,"CS");
		Employee e4 = new Employee("Ali","Ahmed",27,"Male",7000,10,"IT");
		Employee e5 = new Employee("Siraj","Ahmed",29,"Male",8000,11,"CS");
		
		khadz.add(e1);khadz.add(e2);khadz.add(e3);khadz.add(e4);khadz.add(e5);
		
		int maxSalary=0;
		int femaleCount=0;
		System.out.println("The employees belonging to CS are :");
		for(Employee k :khadz ) {
			if(k.getDepartment().equals("CS")) {
				System.out.print(k.getFirstName()+" ");
			}
			
		}
		
	}
}
