package programmers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Camouflage_un {
	public static void main(String[] args) {
		String[][] clothes = {{"yellowhat", "headgear"},{"bluesunglasses", "eyewear"},{"green_turban", "headgear"}};
		System.out.println(solution(clothes));
	}
	
	static int solution(String[][] clothes) {
		
		Map<String, String> map = new HashMap<String, String>();
		Map<String, String> map2 = new HashMap<String, String>();
		for(int i=0; i<clothes.length; i++) {
			map.put(clothes[i][0], clothes[i][1]);
			map2.put(clothes[i][1], clothes[i][0]);
		}
		
		System.out.println(map.size());
		System.out.println(map2.size());
		
		int[] arr = new int[map2.size()];
		Set<String> keySet = map2.keySet();
		System.out.println(keySet.size());
		Iterator<String> keyIterator = keySet.iterator();
		for(int i=0; i<arr.length; i++) {
			while(keyIterator.hasNext()) {
				String key = keyIterator.next();
				if(map.containsValue(key)) {
					arr[i]++;
				}
			}
		}
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr" + i + ": " + arr[i]);
		}
		return 0;
	}
}
