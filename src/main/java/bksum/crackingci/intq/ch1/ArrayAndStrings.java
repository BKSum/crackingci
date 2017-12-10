package bksum.crackingci.intq.ch1;

import java.util.*;

/**
 * 
 * @author Brandon
 *
 */
public class ArrayAndStrings {

	/**
	 * 1.1 - Using Map data structure
	 * @param s
	 * @return
	 */
	public boolean hasUniqueCharacters(String s) {
		Map<Character, Character> mTest = new HashMap<Character, Character>();
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(mTest.containsKey(c))
				return false;
			mTest.put(c, c);
		}
		return true;
	}
	
	/**
	 * 1.1 - Using Map datastructure
	 * @param s
	 * @return
	 */
	public boolean hasUniqueCharactersNoDataStructure(String s) {
		boolean[] charUnique = new boolean[300];
		for(int i=0; i<s.length(); i++) {
			int ascii = s.charAt(i);
			if(charUnique[ascii]) {
				return false;
			}else {
				charUnique[ascii] = true;
			}
		}
		return true;
	}	
	
	public static void main(String[] args) {
		System.out.println("***Starting ArrayAndStrings ***");
		ArrayAndStrings ans = new ArrayAndStrings();
		System.out.println("hasUniqueCharacters:" + ans.hasUniqueCharacters("tesa"));
		System.out.println("hasUniqueCharactersNoDataStructure: " + ans.hasUniqueCharactersNoDataStructure("tesat"));
	}
	
}
