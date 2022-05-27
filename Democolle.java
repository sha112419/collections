package colllections;
import java.io.*;
import java.util.*;

public class Democolle {

	public static void main(String[] args) {
		
		int array[] = new int[] { 2, 11, 24, 19 };
		Vector<Integer> v = new Vector();
		Hashtable<Integer, String> t = new Hashtable();
		
		v.add(1);
		v.add(3);
		v.add(7);
		v.add(8);
		
		t.put(1, "shah");
		t.put(2,"far");
		
		System.out.println(array[1]);
		System.out.println(v.elementAt(2));
		System.out.println(t.get(2));
	

	}

}
