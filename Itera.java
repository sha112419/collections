package colllections;

import java.util.*;

public class Itera {

	public static void main(String[] args) {
		TreeSet<String> sha = new TreeSet<String>();
		
		sha.add("shahid");
		sha.add("are");
		sha.add("how");
		sha.add("hai");
		sha.add("you");
		
		Iterator it = sha.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
