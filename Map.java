package colllections;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "rahul");
		map.put(2, "manoj");
		map.put(3, "vinay");
		for(HashMap.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" :"+m.getValue());
		
		}
		map.remove(2);
		for(HashMap.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" :"+m.getValue());
		
		}
		
	}

}
