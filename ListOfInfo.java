/**
 * 
 */
package Learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author Karthic
 *
 */
public class ListOfInfo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<String> s1 = new ArrayList<String>();
		s1.add("raja");
		s1.add("dinesh");
		s1.add("james");
		
		ArrayList<String> s2 =  new ArrayList<String>();
		s2.add("jagadeesh");
		s2.add("madhan");
		s2.add("senthil");
		
		s1.addAll(s2);
		//Collections.sort(s1);  ascending order 
		Collections.reverse(s1);  
		Iterator itr = s1.iterator();
		
		while(itr.hasNext()){
			
			System.out.println(itr.next());
			
		}

	}

}
