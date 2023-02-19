package CollectionFw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Sharath");
		map.put(2,"Som");
		
		System.out.println(map);
		
		Set<Map.Entry<Integer,String>> set = map.entrySet();
		Iterator<Map.Entry<Integer,String>> itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Integer, String> current = itr.next();
			
			System.out.println(current.getKey()+":"+current.getValue());
		}
	}
}
