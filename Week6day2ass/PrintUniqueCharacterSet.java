package Week6day2ass;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacterSet {
public static void main(String[] args) {
	String name="Meenakshi";
	char[] charArray=name.toCharArray();

	Set<Character> uniqueCharacter=new HashSet<Character>();
	Set<Character> uniqueCharacter1=new LinkedHashSet<Character>();
	for(int i=0;i<charArray.length;i++) {
		uniqueCharacter.add(charArray[i]);
		
	}
	System.out.println(uniqueCharacter);
	for(int j=0;j<charArray.length;j++) {
		uniqueCharacter1.add(charArray[j]);
		
	}
	System.out.println(uniqueCharacter1);
}
}
