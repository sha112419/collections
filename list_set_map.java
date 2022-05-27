package colllections;

import java.util.ArrayList;
import java.util.List;

public class list_set_map {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(2);
		al.add(34);
		al.add(45);
		al.add(78);
		al.add("shahid");
		al.add(40.09);
		al.add(45.09786);
		al.add('s');
		al.add(true);
		System.out.println(al);
		System.out.println(al.add("rahman"));
		System.out.println(al.size());
		al.add(5,"karina");
		
		System.out.println(al.contains("karina"));
		System.out.println(al.get(4));
		System.out.println(al.remove(6));
		System.out.println(al);
		al.set(5, "deepika");
		System.out.println(al);
		System.out.println("index"+al.indexOf("rahman"));
		System.out.println(al);
		ArrayList ab=new ArrayList();
		ab.addAll(al);
		ab.add("sharukhan");
		System.out.println("ab arraylist: "+ab);
		ArrayList ac=new ArrayList();
		ac.addAll(al);
		ac.add("mumbai");
		ac.add("chennai");
		ac.add("salem");
		System.out.println("ac arraylist: "+ac);
		List ad=ac.subList(0, 6);
		System.out.println("ad arraylist: "+ad);


		
	}

}
