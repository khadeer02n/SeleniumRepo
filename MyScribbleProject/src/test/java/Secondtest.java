import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Secondtest {
	
	static void multiplyIntegers(List<Integer> input) {
		List<Integer> answer = new ArrayList<Integer>();
		for(int k :input) {
			answer.add(k*2);
		}
		System.out.print(answer);
	}	
	static void multiplyNumbers(int[] input) {
		for (int i = 0; i < input.length; i++) {
			input[i]=input[i]*2;
			System.out.print(input[i]+" ");
		}
		
	}
	
	static void printFirstDigit(List<Integer> input) {
		List<String> answer = new ArrayList<String>();
		for(Integer k :input) {
			answer.add(k.toString());
		}
		for(String s : answer) {
			if(s.charAt(0)=='1') {
				System.out.print(s+" ");
			}
		}
	}
	static void reverseDigit(Integer input) {
		String s = input.toString();
		char[] answer= s.toCharArray();
		for (int i=answer.length-1; i>=0 ; i--) {
			System.out.print(answer[i]);
		}
	}
	
	static void replaceCharaters(String input) {
		
		String answer = input.replaceAll("[^0-9a-zA-Z]", "");
		System.out.println(answer);
	}
	
	
	
	
	static void deleoitteProblem(String input, int letterLength) {
		
		String a="";
		for(char i='a';i<='z';i++) {
			a+=i;
		}
		String temp = a.substring(letterLength, a.length()-1)+a.substring(0, letterLength);
		System.out.println(temp);
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i)>='a' && input.charAt(i)<='z') {
				System.out.print(temp.charAt(a.indexOf(input.charAt(i)))+"");
			}
		}
		
		
	}
	
	static void findDuplicate(int[] input) {
		
		System.out.println("The duplicates are:");
		for (int i = 0; i < input.length; i++) {
			for (int j = i+1; j < input.length; j++) {
				if(input[i]==input[j]) {
					System.out.print(input[i] +" ");
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(10,12,50,30,18,19);
		int[] data = {3,4,3,4,7,8};
		//multiplyNumbers(data);
		//multiplyIntegers(numbers);
		//printFirstDigit(numbers);
		//reverseDigit(5672);
		//deleoitteProblem("abcdefghijklmnopqrstuvwxyz",3);
		//replaceCharaters("!@#$JA%&^()VA123kha+");
		//deleoitteProblem("welcome-to-scriptlearners",5);
		findDuplicate(data);
	}

}
