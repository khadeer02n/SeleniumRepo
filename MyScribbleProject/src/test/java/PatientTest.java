import java.util.ArrayList;
import java.util.List;

public class PatientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Patient> khaddu = new ArrayList<Patient>();
		
		Patient p1 = new Patient("p1",20,"Corona",10000);
		Patient p2 = new Patient("p2",26,"Fever",6000);
		Patient p3 = new Patient("p3",29,"Corona",8000);
		Patient p4 = new Patient("p4",23,"Corona",12000);
		
		khaddu.add(p1);khaddu.add(p2);khaddu.add(p3);khaddu.add(p4);
		
		List<Patient> khadz = new ArrayList<Patient>();
		
		for(Patient pa:khaddu) {
			if(pa.getDisease().equals("Corona")) {
				khadz.add(pa);
			}
		}
		System.out.println("The list of the patients suffering from Covid are :");
		for(Patient pu : khadz) {
			System.out.println(pu);
		}
		System.out.println("Patients of age less than 25");
		for(Patient pt :khadz) {
			if(pt.getAge()<25) {
				System.out.println(pt);
			}
		}
		int totalSum=0;
		for(Patient pk : khadz) {
			totalSum+=pk.getAmount();
		}
		int average = totalSum/khadz.size();
		
		System.out.println("The average amount of the corona patients is :"+average);
		
		
}
}