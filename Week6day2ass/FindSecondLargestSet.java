package Week6day2ass;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargestSet {
	public static void main(String[] args) {
		//declare the input
		int[] number= {3,2,11,4,6,7,2,3,3,6,7};
		//create an empty set using TreeSet
		Set<Integer> secondLargest=new TreeSet<Integer>();
		//declare for loop iteration from 0 to number and add into set
		for(int i=0;i<number.length;i++) {
			secondLargest.add(number[i]);
			
		}
		//convert set into list
		List<Integer> SecondLargestNumber=new ArrayList<Integer>(secondLargest);
		//print the secondLargest number from list
		int size= SecondLargestNumber.size();
		System.out.println(size);
		System.out.println(SecondLargestNumber.get(SecondLargestNumber.size()-2));
		
		
	}

}
