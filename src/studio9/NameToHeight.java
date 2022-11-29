package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */
	
	
	
	
	
	
	public static void main(String[] args) {
		Map<String,Integer> Info = new HashMap<>();
		Scanner in = new Scanner(System.in);
		System.out.println("How many people?");
		int numPeople = in.nextInt();
		for (int i = 0; i < numPeople; i++) {
			System.out.println("What's your name?:");
			String name = in.next();
			System.out.println("What's your height (in cm)?:");
			int height = in.nextInt();
			Info.put (name, height);
		}
		System.out.println("The name you are trying to look at:");
		String name = in.next();
		while (!name.equals("quit")) {
			if (Info.containsKey(name)) {
				System.out.println(Info.get(name));
			} else {
				System.out.println("Invalid name!");
			}
			
			
			System.out.println("The name you are trying to look at:");
			name = in.next();
			
		}

		// FIXME
//		System.out.println("What's your name?:");
//		String name = in.next();
//		System.out.println("What's your height (in )?:");
//		int height = in.nextInt();
//		Map<String, Integer> temp = new HashMap<>();
//		temp.put(name, height);

	}
}
