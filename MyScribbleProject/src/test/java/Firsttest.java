import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Firsttest {
	
	
	
	static void printEvenNumber(int[] input) {
		
		for (int i = 0; i < input.length; i++) {
			if(input[i]%2==0) {
				System.out.print(input[i]+" ");
			}
		}
	}
	
	static void replaceCharacter(String input) {
		char[] data = input.toCharArray();
		for (int i = 0; i < data.length; i++) {
			if(data[i]=='t') {
				data[i]='T';
			}
		}
		System.out.println(data);
		
	}
	
	static void reverseList(List<String> input) {
		
		for (int i = input.size()-1;i>=0; i--) {
			System.out.print(input.get(i)+" ");
		}
		System.out.println("============================");
	}

	static void removeSpecialCharaters(String input) {
		char[] specialchar= {'!','@','#','$','%','^','&','*'};
		boolean temp=false;
		char[] data = input.toCharArray();
		for (int i = 0; i < data.length; i++) {
			temp =false;
			for (int j = 0; j < specialchar.length; j++) {
				if(data[i]==specialchar[j]) {
					temp=true;
				}
			}
			if(!temp) {
				System.out.print(data[i]+"");
			}
		}
		
	}
	
	static void moveNegativetostart(int[] input) {
		int temp=0;
		for (int i = 0; i < input.length; i++) {
			for (int j = i+1; j < input.length; j++) {
				if(input[i]>input[j]) {
					temp=input[i];
					input[i]=input[j];
					input[j]=temp;
				}
				
			}
			System.out.print(input[i]+" ");
		}
	}
	
	
	static void longestString(String[] input) {
		
		int maxlength=0;
		String resultString="";
		
		for (int i = 0; i < input.length; i++) {
			if(input[i].length()>maxlength) {
				maxlength=input[i].length();
				resultString=input[i];
			}
		}
		System.out.println("The length of the longest string is :"+maxlength+" and that string is :"+resultString);	
	}
	
	static void conversionInCaps(String input) {
		
		int length = input.length();
		int half = length/2;
		String firstHalf = input.substring(0, half).toLowerCase();
		String secondHalf = input.substring(half, length).toUpperCase();
		System.out.println(firstHalf+secondHalf);
	}
	
	static void missingNumber(int[] input) {
		
		int maxSum=0;
		int maxNum=0;
		
		for (int i = 0; i < input.length; i++) {
			maxSum+=input[i];
			if(input[i]>maxNum) {
				maxNum=input[i];
			}
		}
		int serialSum= maxNum*(maxNum+1)/2;
		System.out.println("The missing number from the array is :"+(serialSum-maxSum));
		
		
	}
	
	static void sameCharacterAtEnd(String[] input) {
		
		
	}
	
	static void upperCaseStrings(String[] input) {
		List<String> capitals = new ArrayList<String>();
		for (int i = 0; i < input.length; i++) {
			capitals.add(input[i].toUpperCase());
		}
		for(String k : capitals) {
			System.out.print(k+" ");
		}
	}
	
	static void sumOfArrayToElements(int[] input) {
		int maxSum=0;
		for (int i = 0; i < input.length; i++) {
			maxSum+=input[i];
		}
		for (int i = 0; i < input.length; i++) {
			input[i]=input[i]+maxSum;
			System.out.print(input[i]+" ");
		}
	}
	
	
	static void retrieveNames(List<String> input) {
		
		for(String k:input) {
			if(k.charAt(0)=='R'||k.charAt(0)=='r') {
				System.out.println(k);
			}
		}
		List<Integer> khaddu = new ArrayList<Integer>();
		
		//khaddu.stream().
	}
	
	static void swapVariables(String input1, String input2) {
		System.out.println("Values before swapping :"+input1+" and "+input2);
		int length1 =input1.length();
		int length2 = input2.length();
		input1=input1+input2;
		
		
	}
	
	static void isPrime(int n){
        int flag=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag++;
            }
        }
        if(flag>0){
                System.out.println("not prime");
            }
            else{
                System.out.println("prime");
            }
    }
	
	static void returnStrings(List<String> input) {
		long answer = input.stream().filter(k->k.length()>3).count();
		System.out.println(answer);
	}
	
	
	static void filterByCharaters(String[] input) {
		boolean flag= false;
		for (int i = 0; i < input.length; i++) {
			if(input[i].startsWith("fl")) {
				flag = false;
			}
			else {
				flag=true;
				break;
			}
			
		}
		if(flag=true) {
			System.out.println("There is an element which starts without fl");
		}
		if(flag=false) {
			for (int i = 0; i < input.length; i++) {
				System.out.print(input[i]+" ");
			}
		}
		}
	
	static void countZeroesAndOnes() {
		int count=0;
		List<Integer> input = Arrays.asList(0,1,1,0,1,0,1,1,1,0,0);
		Map<Integer,Integer> khadz = new HashMap<Integer,Integer>();
		for(Map.Entry<Integer, Integer> entry : khadz.entrySet() ) {
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] numbers= {7,6,5,9,11,4};
		int[] numbers2= {1,2,3,4,5,7,8,9,10};
		int[] numbers3= {10,20,30,40,50};
		String[] names = {"java","Hibernate","springboot"};
		String[] names2 = {"abc","mnm","xlx","xyz","fkf","qwe"};
		String[] countries= {"India","usa","canada","japan","france","italy","germany"};
		List<String> list = new ArrayList<String>();
		list.add("Sai");list.add("Kumar"); list.add("Ram");list.add("Raju");
		List<String> list2 = new ArrayList<String>();
		list2.add("java"); list2.add("php"); list2.add("angular"); list2.add("python"); list2.add("R"); list2.add("C++");
		String[] saqibNames= {"flower","flaw","fly","flora"};
		//list.add("AA"); list.add("ZZ"); list.add("CC"); list.add("FF");
		//sumOfArrayToElements(numbers3);
		//retrieveNames(list);
		//isPrime(37);
		//returnStrings(list2);
		filterByCharaters(saqibNames);
		
	}

}
