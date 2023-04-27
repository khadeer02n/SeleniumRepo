
import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.util.Optional;
import java.util.Comparator;
/*
* Convert all map values into the list
* Print the string with max length from the above list i.e "caramel chocolate is good adadadadadadd a dadasd"
* Extract the values from above list which contains word car (case insensitive i.e CAr, Car, car..etc)
*/

public class Solution {

	public static void main(String[] args) {
		Map<String, String> phrases = new HashMap<>();
		phrases.put("10001", "Vehicle");
		phrases.put("10024", "CAr Race");
		phrases.put("10034", "caramel chocolate is good adadadadadadd a dadasd");
		phrases.put("34567", "BMW Cars have Garmin GPS");
		phrases.put("22333", "Children Daycare");
		phrases.put("33434", "Navionics");
		phrases.put("33442", "Garmin International");
		
		List<String> values = new ArrayList<String>(phrases.values());
		
		int maxlength=0;
		String answer="";
		for(String k: values) {
			if(k.length()>maxlength) {
				maxlength=k.length();
				answer=k;
			}
		}
		
		System.out.println("The String with the maximum length "+maxlength+" is : "+answer);
		
		List<String> answerValues = new ArrayList<String>();
		
		for(String k1:values) {
		
			if(k1.toLowerCase().contains("car")) {
				answerValues.add(k1);
			}
		}
		System.out.println(answerValues);

	}
}
