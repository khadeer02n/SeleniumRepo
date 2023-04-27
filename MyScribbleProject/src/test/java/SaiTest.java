import java.util.ArrayList;
import java.util.List;

public class SaiTest {
		
	public String longestString(List<String> input) {
		
		String longestString="";
		
		int lengthofString=0;
		
		for (int i = 0; i < input.size(); i++) {
			if(input.get(i).length()>lengthofString) {
				lengthofString=input.get(i).length();
				longestString=input.get(i);
			}
		}
		return longestString;
	}
	
	public static void returnSmallestIndex(int[] input) {
		int index=0;
		int min=input[index];
		for (int i = 0; i <input.length; i++) {
			if(input[i]<=min) {
				min=input[i];
				index=i;
			}
		}
		System.out.println(index);
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SaiTest khaddu = new SaiTest();
		int[] numbers= {7,6,5,9,11,4};
		khaddu.returnSmallestIndex(numbers);
	}

}
