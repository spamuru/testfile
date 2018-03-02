package AandA;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class CrazyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabbccddeeffgghhiijjkkllmmnnooppqrstuvwwwxxxyyyzzzz";
		numberOfVowels(str);
	}

	private static void numberOfVowels(String str) {
		// TODO Auto-generated method stub
		
		char[] ca = str.replace(" ", "").toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<=ca.length-1;i++) {
			if(map.containsKey(ca[i])) {
				map.put(ca[i], map.get(ca[i])+1);
			}else {
			map.put(ca[i], 1);
			}
		}
		
		Iterator<Entry<Character,Integer>> i = map.entrySet().iterator();
		while(i.hasNext()) {
			Entry<Character,Integer> entryset = i.next();
			System.out.println(entryset.getKey() + "  " +  entryset.getValue());
			
		}
		
	}

}
